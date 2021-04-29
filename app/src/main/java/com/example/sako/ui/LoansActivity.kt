package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.adapters.LoansAdapter
import com.example.sako.model.Loans

class LoansActivity : AppCompatActivity() {

    lateinit var loans_List :ArrayList<Loans>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loans)


        loans_List = ArrayList()
        addLoans()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 0))

        recyclerView.adapter = LoansAdapter(loans_List)
    }

    private fun addLoans() {
        loans_List.add(Loans("Chama Yetu", "Ksh 800.00","Approved 15/10/2021"))
    }
}
