package com.freely.listenfreely.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.CustomCircleSongsAdapterBinding

class CustomCircleAdapter(
    private val context: Context,
    private val trackLists: List<String>
): RecyclerView.Adapter<CustomCircleAdapter.CustomCircleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomCircleViewHolder {
        val customCircleSongsAdapterBinding =
            CustomCircleSongsAdapterBinding.bind(
                LayoutInflater.from(context).inflate(R.layout.custom_circle_songs_adapter, parent, false)
            )

        return CustomCircleViewHolder(customCircleSongsAdapterBinding)
    }

    override fun getItemCount(): Int = trackLists.size

    override fun onBindViewHolder(holder: CustomCircleViewHolder, position: Int) {
        holder.onBind(trackLists, position)
    }

    inner class CustomCircleViewHolder(private val customCircleSongsAdapterBinding: CustomCircleSongsAdapterBinding): RecyclerView.ViewHolder(customCircleSongsAdapterBinding.root) {

        fun onBind(trackLists: List<String>, position: Int) {
            customCircleSongsAdapterBinding.apply {
                Glide.with(context)
                    .load(trackLists[position])
                    .into(circleSongsIvImg)
            }
        }
    }
}