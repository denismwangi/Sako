package com.example.sako.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.adapters.CirclesAdapters
import com.example.sako.interfaces.onCircleClickListener
import com.example.sako.model.CirclesList

class CirclesActivity : AppCompatActivity(), onCircleClickListener {

    lateinit var saccos: ArrayList<CirclesList>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circles)

        saccos  = ArrayList()
        //addSaccos()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 1))

        recyclerView.adapter = CirclesAdapters(saccos, this)
    }


    override fun onItemClick(item: CirclesList, position: Int) {
        val intent = Intent(this, shelterDetails::class.java)
        intent.putExtra("sheltername", item.sheltername)
        intent.putExtra("address", item.address)
        intent.putExtra("suburb", item.suburb)
        intent.putExtra("phone", item.phone)
        intent.putExtra("email", item.email)
        startActivity(intent)


    }
}
