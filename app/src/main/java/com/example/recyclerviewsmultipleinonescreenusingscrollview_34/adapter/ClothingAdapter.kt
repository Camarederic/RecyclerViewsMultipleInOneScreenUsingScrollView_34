package com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.R
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.model.Clothing

class ClothingAdapter(private val clothingList: List<Clothing>) :
    RecyclerView.Adapter<ClothingAdapter.ClothingViewHolder>() {

    class ClothingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val clothingImageView: ImageView = itemView.findViewById(R.id.clothing_image)
        val clothingTextView: TextView = itemView.findViewById(R.id.textViewClothingOffer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothingViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.clothing_layout, parent, false)
        return ClothingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClothingViewHolder, position: Int) {
        val cloth = clothingList[position]
        holder.clothingImageView.setImageResource(cloth.image)
        holder.clothingTextView.text = cloth.offer
    }

    override fun getItemCount(): Int {
        return clothingList.size
    }
}