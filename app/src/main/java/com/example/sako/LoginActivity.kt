package com.example.sako

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.sako.api.RetrofitRegistration
import com.example.sako.model.LoginResponse
import com.example.sako.storage.SharedPrefManager
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.tv_password
import kotlinx.android.synthetic.main.activity_login.tv_phoneno
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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


//            val phone = tv_phoneno.text.toString().trim()
//            val password = tv_password.text.toString().trim()
//
//            if (phone.isEmpty()){
//                tv_firstname.error = "firstname is required"
//                tv_firstname.requestFocus()
//                return@setOnClickListener
//            }
//            if (password.isEmpty()){
//                tv_lastname.error = "lastname is required"
//                tv_lastname.requestFocus()
//                return@setOnClickListener
//            }
//
//            RetrofitRegistration.instance.userLogin(phone ,password)
//                .enqueue(object: Callback<LoginResponse>{
//                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
//
//                    }
//
//                    override fun onResponse(
//                        call: Call<LoginResponse>,
//                        response: Response<LoginResponse>
//                    ) {
//
//                        if (!response.body()?.error!!){
//
//                            SharedPrefManager.getInstance(applicationContext)?.saveUser(response.body()?.user!!)
//
//                            val intent = Intent(applicationContext, NavdrawerActivity::class.java)
//                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//                            startActivity(intent)
//                        }else{
//                            Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_LONG ).show()
//                        }
//
//                    }


  //              })
        }


    }

    /**
     *
     * checking if user is logged in
     */

    override fun onStart() {
        super.onStart()
        if(SharedPrefManager.getInstance(this)!!.isLoggedIn){
            val intent = Intent(applicationContext, NavdrawerActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}