package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.sako.R

class LoansActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loans)



        val toolbar: Toolbar = findViewById(R.id.toolbar_loans)
        setSupportActionBar(toolbar)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = "Loans"

        //actionbar
        //val actionbar = supportActionBar
        //set actionbar title
       // actionbar?.title = "Loans"

        //set back button
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
      onBackPressed()
       return true
    }
}




