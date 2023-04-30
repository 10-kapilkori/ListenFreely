package com.freely.listenfreely.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.FragmentHomeBinding
import com.freely.listenfreely.utils.Utils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    lateinit var fragmentHomeBinding: FragmentHomeBinding
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController =
            (childFragmentManager.findFragmentById(R.id.home_nav_host_fragment) as NavHostFragment).navController

        fragmentHomeBinding.apply {

            requireActivity().onBackPressedDispatcher.addCallback(
                viewLifecycleOwner,
                object : OnBackPressedCallback(true) {
                    override fun handleOnBackPressed() {
                        requireActivity().finish()
                    }
                })

            if (
                Utils.getPreferences(requireContext(), "music_data") == Utils.MUSIC_ID ||
                Utils.getPreferences(requireContext(), "music_data") == null
            ) {
                interchangeViews(homeMusicTab, homePodcastsTab)
            } else {
                interchangeViews(homePodcastsTab, homeMusicTab)
            }

            homeMusicTab.setOnClickListener {
                Utils.changeTabs(
                    fragmentHomeBinding.root,
                    homeVNav,
                    homeMusicTab,
                    0.5f
                )
                homeMusicTab.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                homeMusicTab.typeface =
                    ResourcesCompat.getFont(requireContext(), R.font.nunito_bold)
                homePodcastsTab.typeface =
                    ResourcesCompat.getFont(requireContext(), R.font.nunito_light)

                Utils.savePreferences(requireContext(), "music_data", Utils.MUSIC_ID)
                if (navController.currentDestination?.id == R.id.podcastsFragment) {
                    navController.navigate(R.id.action_podcastFragment_to_musicFragment)
                }
            }

            homePodcastsTab.setOnClickListener {
                Utils.changeTabs(
                    fragmentHomeBinding.root,
                    homeVNav,
                    homePodcastsTab,
                    0.5f
                )
                homeMusicTab.typeface =
                    ResourcesCompat.getFont(requireContext(), R.font.nunito_light)
                homePodcastsTab.typeface =
                    ResourcesCompat.getFont(requireContext(), R.font.nunito_bold)
                homePodcastsTab.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
                Utils.savePreferences(requireContext(), "music_data", Utils.PODCASTS_ID)
                if (navController.currentDestination?.id == R.id.musicFragment) {
                    navController.navigate(R.id.action_musicFragment_to_podcastFragment)
                }
            }
        }
    }

    private fun interchangeViews(selectedView: TextView, unselectedView: TextView) {
        selectedView.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
        selectedView.typeface =
            ResourcesCompat.getFont(requireContext(), R.font.nunito_bold)
        unselectedView.typeface =
            ResourcesCompat.getFont(requireContext(), R.font.nunito_light)

        Utils.changeTabs(
            fragmentHomeBinding.root,
            fragmentHomeBinding.homeVNav,
            selectedView,
            0.5f
        )
    }
}