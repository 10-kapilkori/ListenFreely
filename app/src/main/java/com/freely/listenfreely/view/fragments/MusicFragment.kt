package com.freely.listenfreely.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.FragmentMusicBinding
import com.freely.listenfreely.utils.Utils
import com.freely.listenfreely.view.adapters.CustomCircleAdapter
import com.freely.listenfreely.view.adapters.CustomCircleForAlbumsAdapter
import com.freely.listenfreely.view.adapters.CustomRoundedCornersAdapter
import com.freely.listenfreely.view.adapters.CustomRoundedCornersForAnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MusicFragment : Fragment() {

    lateinit var fragmentMusicBinding: FragmentMusicBinding
    lateinit var customCircleAdapter: CustomCircleAdapter
    lateinit var customCircleForAlbumAdapter: CustomCircleForAlbumsAdapter
    lateinit var customRoundedCornersAdapter: CustomRoundedCornersAdapter
    lateinit var customRoundedCornersForAnimeAdapter: CustomRoundedCornersForAnimeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMusicBinding = FragmentMusicBinding.inflate(inflater)
        return fragmentMusicBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentMusicBinding.apply {

            customCircleAdapter = CustomCircleAdapter(requireContext(), Utils.tracksList)
            musicRvRecentSongs.adapter = customCircleAdapter
            customCircleAdapter.notifyDataSetChanged()

            customRoundedCornersAdapter = CustomRoundedCornersAdapter(requireContext(), Utils.artistsList)
            musicRvSongs.adapter = customRoundedCornersAdapter
            customRoundedCornersAdapter.notifyDataSetChanged()

            customCircleForAlbumAdapter = CustomCircleForAlbumsAdapter(requireContext(), Utils.albumsList)
            musicRvAlbums.adapter = customCircleForAlbumAdapter
            customCircleAdapter.notifyDataSetChanged()

            customRoundedCornersForAnimeAdapter = CustomRoundedCornersForAnimeAdapter(requireContext(), Utils.albumsList[3].topAlbumSongs)
            musicRvAnime.adapter = customRoundedCornersForAnimeAdapter
            customRoundedCornersForAnimeAdapter.notifyDataSetChanged()
        }
    }
}