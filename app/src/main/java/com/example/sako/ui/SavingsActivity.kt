package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.sako.R

class SavingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_savings)

        val toolbar: Toolbar = findViewById(R.id.toolbar_savings)
        setSupportActionBar(toolbar)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = "Savings"

        //actionbar
        //val actionbar = supportActionBar
        //set actionbar title
        // actionbar?.title = "Loans"

        //set back button
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    //back arrow button function to return toolbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
