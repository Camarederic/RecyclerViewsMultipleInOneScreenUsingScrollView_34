package com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.R
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.model.BestSeller

class BestSellerAdapter(private val bestSellerList: List<BestSeller>):
    RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder>() {

    class BestSellerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val bestSellerImageView:ImageView = itemView.findViewById(R.id.bestSellerImage)
        val bestSellerTextView:TextView = itemView.findViewById(R.id.bestSellerText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.best_seller_layout,parent,false)
        return BestSellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        val bestSeller = bestSellerList[position]
        holder.bestSellerImageView.setImageResource(bestSeller.image)
        holder.bestSellerTextView.text = bestSeller.offer
    }

    override fun getItemCount(): Int {
        return bestSellerList.size
    }
}