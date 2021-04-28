package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.adapters.TransactionsAdapter
import com.example.sako.model.Transactions

class TransactionsActivity : AppCompatActivity() {

    lateinit var transactions: ArrayList<Transactions>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions)
        
        transactions = ArrayList()
        addTransactions()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 0))

        recyclerView.adapter = TransactionsAdapter(transactions)


    }

    private fun addTransactions() {
        transactions.add(Transactions("Chama Yetu", "Ksh 6,999","12.00 pm"))
        transactions.add(Transactions("Gitati", "Ksh 200","4.00 pm"))
        transactions.add(Transactions("Vijana Kazi", "Ksh 1,200","9.00 am"))
        transactions.add(Transactions("Safaricom Offers", "Ksh 200","2.00 am"))
        transactions.add(Transactions("Test Chama", "Ksh 1,200","9.00 pm"))
        transactions.add(Transactions(" Kazi Yetu", "Ksh 1,200","9.00 am"))
        transactions.add(Transactions("Vijana Kazi", "Ksh 1,200","9.00 am"))

    }
}
