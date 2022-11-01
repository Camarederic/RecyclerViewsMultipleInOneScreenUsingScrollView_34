package com.example.recyclerviewsmultipleinonescreenusingscrollview_34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter.BestSellerAdapter
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter.ClothingAdapter
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.adapter.OfferAdapter
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.model.BestSeller
import com.example.recyclerviewsmultipleinonescreenusingscrollview_34.model.Clothing

class MainActivity : AppCompatActivity() {

    private lateinit var offerRecyclerView: RecyclerView
    private lateinit var offerImageList: ArrayList<Int>
    private lateinit var offerAdapter: OfferAdapter

    private lateinit var bestSellerRecyclerView: RecyclerView
    private lateinit var bestSellerImageList: ArrayList<BestSeller>
    private lateinit var bestSellerAdapter: BestSellerAdapter

    private lateinit var clothingRecyclerView: RecyclerView
    private lateinit var clothingImageList: ArrayList<Clothing>
    private lateinit var clothingAdapter: ClothingAdapter

    private lateinit var bestSellerRecyclerView2: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    private fun init(){
        offerRecyclerView = findViewById(R.id.offerRecyclerView)
        offerRecyclerView.setHasFixedSize(true)
        offerRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        offerImageList = ArrayList()
        offerImageList.add(R.drawable.offer_shopping)
        offerImageList.add(R.drawable.nikon_cannon_offer)
        offerImageList.add(R.drawable.tv_offer)
        offerAdapter = OfferAdapter(offerImageList)
        offerRecyclerView.adapter = offerAdapter

        bestSellerRecyclerView = findViewById(R.id.bestSellerRecyclerView)
        bestSellerRecyclerView.setHasFixedSize(true)
        bestSellerRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL, false)
        bestSellerImageList = ArrayList()
        bestSellerImageList.add(BestSeller(R.drawable.bags, "Up to 20% off"))
        bestSellerImageList.add(BestSeller(R.drawable.mobiles, "Up to 20% off"))
        bestSellerImageList.add(BestSeller(R.drawable.watches, "Up to 20% off"))
        bestSellerAdapter = BestSellerAdapter(bestSellerImageList)
        bestSellerRecyclerView.adapter = bestSellerAdapter

        clothingRecyclerView = findViewById(R.id.clothingRecyclerView)
        clothingRecyclerView.setHasFixedSize(true)
        clothingRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        clothingImageList = ArrayList()
        clothingImageList.add(Clothing(R.drawable.levis_clothing,"Up to 30% off"))
        clothingImageList.add(Clothing(R.drawable.women_clothing,"Up to 30% off"))
        clothingImageList.add(Clothing(R.drawable.nike_shoes,"Up to 30% off"))
        clothingAdapter = ClothingAdapter(clothingImageList)
        clothingRecyclerView.adapter = clothingAdapter

        bestSellerRecyclerView2 = findViewById(R.id.bestSeller2RecyclerView)
        bestSellerRecyclerView2.setHasFixedSize(true)
        bestSellerRecyclerView2.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        bestSellerRecyclerView2.adapter = bestSellerAdapter
    }
}