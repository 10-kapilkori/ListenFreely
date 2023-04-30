package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomRoundedCornersSongsAdapterBinding

class CustomRoundedCornersAdapter(
    private val context: Context,
    private val list: List<String>
) : RecyclerView.Adapter<CustomRoundedCornersAdapter.CustomRoundedCornerViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomRoundedCornerViewHolder {
        val customRoundedCornersSongsAdapterBinding =
            CustomRoundedCornersSongsAdapterBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.custom_rounded_corners_songs_adapter, parent, false)
            )

        return CustomRoundedCornerViewHolder(customRoundedCornersSongsAdapterBinding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CustomRoundedCornerViewHolder, position: Int) {
        holder.onBind(list, position)
    }

    inner class CustomRoundedCornerViewHolder(private val customRoundedCornersSongsAdapterBinding: CustomRoundedCornersSongsAdapterBinding) :
        RecyclerView.ViewHolder(customRoundedCornersSongsAdapterBinding.root) {

        fun onBind(list: List<String>, position: Int) {
            customRoundedCornersSongsAdapterBinding.apply {
                Glide.with(context)
                    .load(list[position])
                    .into(customRoundedImg)
            }
        }
    }
}