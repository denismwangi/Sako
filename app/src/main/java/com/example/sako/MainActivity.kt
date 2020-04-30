package com.example.sako

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {

    internal val TIME_OUT = 1000




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed(
            {
                startActivity(Intent(this,ViewpagerActivity::class.java))
                finish()

            }, TIME_OUT.toLong())





    }
}
