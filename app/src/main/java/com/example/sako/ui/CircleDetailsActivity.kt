package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sako.R
import kotlinx.android.synthetic.main.activity_circle_details.*

class CircleDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_details)


        name.text = getIntent().getStringExtra("name")
        amount_contib.text = getIntent().getStringExtra("min to contribute")
        description.text = getIntent().getStringExtra("description")

    }
}
