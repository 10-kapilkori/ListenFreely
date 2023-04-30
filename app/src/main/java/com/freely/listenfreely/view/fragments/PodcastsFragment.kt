package com.freely.listenfreely.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.freely.listenfreely.databinding.FragmentPodcastsBinding
import com.freely.listenfreely.utils.Utils
import com.freely.listenfreely.view.adapters.CustomCircleForAlbumsAdapter
import com.freely.listenfreely.view.adapters.CustomRoundedCornersPodcastsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PodcastsFragment : Fragment() {

    lateinit var fragmentPodcastsBinding: FragmentPodcastsBinding
    lateinit var customCircleForAlbumsAdapter: CustomCircleForAlbumsAdapter
    lateinit var customRoundedCornersPodcastsAdapter: CustomRoundedCornersPodcastsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPodcastsBinding = FragmentPodcastsBinding.inflate(inflater)
        return fragmentPodcastsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    requireActivity().finish()
                }
            })

        fragmentPodcastsBinding.apply {
            customCircleForAlbumsAdapter =
                CustomCircleForAlbumsAdapter(requireContext(), Utils.podcastsList.reversed())
            podcastsRvRecentPodcasts.adapter = customCircleForAlbumsAdapter

            customRoundedCornersPodcastsAdapter =
                CustomRoundedCornersPodcastsAdapter(requireContext(), Utils.podcastsList)
            podcastsRvAll.adapter = customRoundedCornersPodcastsAdapter
        }
    }
}