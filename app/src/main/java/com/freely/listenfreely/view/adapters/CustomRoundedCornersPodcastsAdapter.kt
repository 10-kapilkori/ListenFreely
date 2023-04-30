package com.freely.listenfreely.view.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomRoundedCornersPodcastsAdapterBinding
import com.freely.listenfreely.pojos.Albums

class CustomRoundedCornersPodcastsAdapter(
    private val context: Context,
    private val list: List<Albums>
) : RecyclerView.Adapter<CustomRoundedCornersPodcastsAdapter.CustomRoundedCornerPodcastsViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomRoundedCornerPodcastsViewHolder {
        val customRoundedCornersPodcastsAdapterBinding =
            CustomRoundedCornersPodcastsAdapterBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.custom_rounded_corners_podcasts_adapter, parent, false)
            )

        return CustomRoundedCornerPodcastsViewHolder(customRoundedCornersPodcastsAdapterBinding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CustomRoundedCornerPodcastsViewHolder, position: Int) {
        holder.onBind(list, position)
    }

    inner class CustomRoundedCornerPodcastsViewHolder(private val customRoundedCornersSongsAdapterBinding: CustomRoundedCornersPodcastsAdapterBinding) :
        RecyclerView.ViewHolder(customRoundedCornersSongsAdapterBinding.root) {

        fun onBind(list: List<Albums>, position: Int) {
            customRoundedCornersSongsAdapterBinding.apply {
                Glide.with(context)
                    .load(list[position].albumUrl)
                    .into(customRoundedImg)
            }
        }
    }
}