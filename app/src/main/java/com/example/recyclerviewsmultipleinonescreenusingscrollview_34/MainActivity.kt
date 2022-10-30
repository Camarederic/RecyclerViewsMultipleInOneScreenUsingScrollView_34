package com.example.recyclerviewsmultipleinonescreenusingscrollview_34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var offerRecyclerView: RecyclerView
    private lateinit var bestSellerRecyclerView: RecyclerView
    private lateinit var clothingRecyclerView: RecyclerView
    private lateinit var bestSellerRecyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun init(){
        offerRecyclerView = findViewById(R.id.offerRecyclerView)
        offerRecyclerView.setHasFixedSize(true)
        offerRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        bestSellerRecyclerView = findViewById(R.id.bestSellerRecyclerView)
        bestSellerRecyclerView.setHasFixedSize(true)
        bestSellerRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL, false)

        clothingRecyclerView = findViewById(R.id.clothingRecyclerView)
        clothingRecyclerView.setHasFixedSize(true)
        clothingRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)

        bestSellerRecyclerView2 = findViewById(R.id.bestSeller2RecyclerView)
        bestSellerRecyclerView2.setHasFixedSize(true)
        bestSellerRecyclerView2.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
    }
}