package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomChannelsAdapterBinding

class CustomChannelsAdapter(
    private val context: Context,
    private val channels: List<String>
) : RecyclerView.Adapter<CustomChannelsAdapter.CustomChannelsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomChannelsViewHolder {
        val binding =
            CustomChannelsAdapterBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.custom_channels_adapter, parent, false)
            )

        return CustomChannelsViewHolder(binding)
    }

    override fun getItemCount(): Int = channels.size

    override fun onBindViewHolder(holder: CustomChannelsViewHolder, position: Int) {
        holder.onBind(channels, position)
    }

    inner class CustomChannelsViewHolder(private val customChannelsAdapterBinding: CustomChannelsAdapterBinding) :
        RecyclerView.ViewHolder(customChannelsAdapterBinding.root) {

        fun onBind(channelList: List<String>, position: Int) {
            customChannelsAdapterBinding.apply {
                Glide.with(context)
                    .load(channelList[position])
                    .into(customChannelIv)
            }
        }
    }
}