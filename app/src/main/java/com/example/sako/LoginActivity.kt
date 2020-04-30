package com.example.sako

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Text1 = findViewById<TextView>(R.id.register1) as TextView
        val Btn = findViewById<Button>(R.id.btn_login) as Button

        Text1.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        Btn.setOnClickListener{
           val intent = Intent(this,NavdrawerActivity::class.java)
            startActivity(intent)
        }


    }
}