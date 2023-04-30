package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomRoundedCornersSongsAdapterBinding
import com.freely.listenfreely.pojos.TopAlbumsSongs

class CustomRoundedCornersForAnimeAdapter(
    private val context: Context,
    private val list: List<TopAlbumsSongs>
) : RecyclerView.Adapter<CustomRoundedCornersForAnimeAdapter.CustomRoundedCornerForAnimeViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomRoundedCornerForAnimeViewHolder {
        val customRoundedCornersSongsAdapterBinding =
            CustomRoundedCornersSongsAdapterBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.custom_rounded_corners_songs_adapter, parent, false)
            )

        return CustomRoundedCornerForAnimeViewHolder(customRoundedCornersSongsAdapterBinding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CustomRoundedCornerForAnimeViewHolder, position: Int) {
        holder.onBind(list, position)
    }

    inner class CustomRoundedCornerForAnimeViewHolder(private val customRoundedCornersSongsAdapterBinding: CustomRoundedCornersSongsAdapterBinding) :
        RecyclerView.ViewHolder(customRoundedCornersSongsAdapterBinding.root) {

        fun onBind(list: List<TopAlbumsSongs>, position: Int) {
            customRoundedCornersSongsAdapterBinding.apply {
                Glide.with(context)
                    .load(list[position].songImg)
                    .into(customRoundedImg)
            }
        }
    }
}