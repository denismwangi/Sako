package com.example.sako.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.NavdrawerActivity
import com.example.sako.R
import com.example.sako.adapters.LoansAdapter
import com.example.sako.model.Loans
import com.google.android.material.bottomnavigation.BottomNavigationView

class LoansActivity : AppCompatActivity() {

    lateinit var loans_List :ArrayList<Loans>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loans)


        loans_List = ArrayList()
        addLoans()

        setupNavigation()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 0))

        recyclerView.adapter = LoansAdapter(loans_List)
    }

    private fun addLoans() {
        loans_List.add(Loans("Chama Yetu", "Ksh 800.00","Approved 15/02/2021"))
    }

    /**
     * bottom navigation
     */
    private fun setupNavigation() {
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, NavdrawerActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.history -> {
                    val intent = Intent(this,TransactionsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_account -> {
                    val intent = Intent(this,AccountActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> true
            }
        }
    }
}
