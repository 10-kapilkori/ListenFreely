package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomCircleSongsAdapterBinding
import com.freely.listenfreely.pojos.Albums
import com.freely.listenfreely.pojos.TopAlbumsSongs

class CustomCircleForAlbumsAdapter(
    private val context: Context,
    private val trackLists: List<Albums>
): RecyclerView.Adapter<CustomCircleForAlbumsAdapter.CustomCircleForAlbumsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomCircleForAlbumsViewHolder {
        val customCircleSongsAdapterBinding =
            CustomCircleSongsAdapterBinding.bind(
                LayoutInflater.from(context).inflate(R.layout.custom_circle_songs_adapter, parent, false)
            )

        return CustomCircleForAlbumsViewHolder(customCircleSongsAdapterBinding)
    }

    override fun getItemCount(): Int = trackLists.size

    override fun onBindViewHolder(holder: CustomCircleForAlbumsViewHolder, position: Int) {
        holder.onBind(trackLists, position)
    }

    inner class CustomCircleForAlbumsViewHolder(private val customCircleSongsAdapterBinding: CustomCircleSongsAdapterBinding): RecyclerView.ViewHolder(customCircleSongsAdapterBinding.root) {

        fun onBind(trackLists: List<Albums>, position: Int) {
            customCircleSongsAdapterBinding.apply {
                Glide.with(context)
                    .load(trackLists[position].albumUrl)
                    .into(circleSongsIvImg)
            }
        }
    }
}