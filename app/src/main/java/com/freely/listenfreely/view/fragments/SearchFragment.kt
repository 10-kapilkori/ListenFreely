package com.freely.listenfreely.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.FragmentSearchBinding
import com.freely.listenfreely.utils.Utils
import com.freely.listenfreely.view.adapters.CustomChannelsAdapter
import com.freely.listenfreely.view.adapters.CustomRecentlyPlayedSongsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment() {

    lateinit var fragmentSearchBinding: FragmentSearchBinding
    lateinit var recentPlayedAdapter: CustomRecentlyPlayedSongsAdapter
    lateinit var trendingSongAdapter: CustomRecentlyPlayedSongsAdapter
    lateinit var channelAdapter: CustomChannelsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentSearchBinding = FragmentSearchBinding.inflate(inflater)
        return fragmentSearchBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentSearchBinding.apply {
            recentPlayedAdapter = CustomRecentlyPlayedSongsAdapter(requireContext(), Utils.recentlyPlayedTracksList)
            searchRvRecentlyPlayed.adapter = recentPlayedAdapter

            trendingSongAdapter = CustomRecentlyPlayedSongsAdapter(requireContext(), Utils.albumsList[1].topAlbumSongs)
            searchRvTrending.adapter = trendingSongAdapter

            channelAdapter = CustomChannelsAdapter(requireContext(), Utils.channelsList)
            searchRvChannel.adapter = channelAdapter

            searchTxtSearchBox.doOnTextChanged { text, start, before, count ->
                if (text?.isEmpty() == true) {
                    searchGViews.visibility = VISIBLE
                    searchRvSearches.visibility = GONE
                } else {
                    searchGViews.visibility = GONE
                    searchRvSearches.visibility = VISIBLE
                }
            }
        }
    }
}