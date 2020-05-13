package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.sako.R
import kotlinx.android.synthetic.main.app_bar_navdrawer.*

class AddCirclesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_circles)


        val toolbar: Toolbar = findViewById(R.id.toolbar_add_circles)
        setSupportActionBar(toolbar)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = "Add Circles"

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
