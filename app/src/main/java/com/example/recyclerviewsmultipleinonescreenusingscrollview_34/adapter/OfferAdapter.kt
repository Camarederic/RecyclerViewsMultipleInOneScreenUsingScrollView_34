package com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.R

class OfferAdapter(private val offerList:List<Int>):RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    class OfferViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val offerImageView:ImageView = itemView.findViewById(R.id.imageViewOffer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.offer_layout,parent,false)
        return OfferViewHolder(view)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        holder.offerImageView.setImageResource(offerList[position])
    }

    override fun getItemCount(): Int {
        return offerList.size
    }

}