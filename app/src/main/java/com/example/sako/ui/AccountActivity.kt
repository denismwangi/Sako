package com.example.sako.ui

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.NavdrawerActivity
import com.example.sako.R
import com.example.sako.adapters.AccountsAdapter
import com.example.sako.model.Accounts
import com.google.android.material.bottomnavigation.BottomNavigationView

class AccountActivity : AppCompatActivity() {

    lateinit var accountList :ArrayList<Accounts>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        accountList = ArrayList()
        addAccounts()

        setupNavigation()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 0))
        recyclerView.adapter = AccountsAdapter(accountList)
    }

    private fun addAccounts() {
        accountList.add(Accounts("Chama Yetu", "Ksh 2,729"))
        accountList.add(Accounts("Ushirika", "Ksh 300"))
        accountList.add(Accounts("Demo Chama", "Ksh 700"))
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
