package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomRecentsPlayedBinding
import com.freely.listenfreely.pojos.TopAlbumsSongs

class CustomRecentlyPlayedSongsAdapter(
    val context: Context,
    val tracksList: List<TopAlbumsSongs>
) : RecyclerView.Adapter<CustomRecentlyPlayedSongsAdapter.CustomRecentlyPlayedSongsViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomRecentlyPlayedSongsViewHolder {
        val customRecentsBinding =
            CustomRecentsPlayedBinding.bind(
                LayoutInflater.from(context).inflate(R.layout.custom_recents_played, parent, false)
            )

        return CustomRecentlyPlayedSongsViewHolder(customRecentsBinding)
    }

    override fun getItemCount(): Int = tracksList.size

    override fun onBindViewHolder(holder: CustomRecentlyPlayedSongsViewHolder, position: Int) {
        holder.onBind(tracksList, position)
    }

    inner class CustomRecentlyPlayedSongsViewHolder(val customRecentPlayedBinding: CustomRecentsPlayedBinding) :
        RecyclerView.ViewHolder(customRecentPlayedBinding.root) {

        fun onBind(list: List<TopAlbumsSongs>, position: Int) {
            customRecentPlayedBinding.apply {
                customTvSongName.text =
                    list[position].songName
                customTvSongArtistOrAlbum.text =
                    list[position].songAlbum

                Glide.with(context)
                    .load(list[position].songImg)
                    .into(customRoundedSiv)

                customIvRemoveFromList.setOnClickListener {
                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}