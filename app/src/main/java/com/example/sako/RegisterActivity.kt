package com.example.sako

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sako.api.RetrofitRegistration
import com.example.sako.model.RegistrationResponse
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//
//        btn_sign_up.setOnClickListener{
//
//            //input validation
//            val firstname = tv_firstname.text.toString().trim()
//            val lastname = tv_lastname.text.toString().trim()
//            val  phone = tv_phoneno.text.toString().trim()
//            val password = tv_password.text.toString().trim()
//            val password2 = tv_password2.text.toString().trim()
//
//            if (firstname.isEmpty()){
//                tv_firstname.error = "firstname is required"
//                tv_firstname.requestFocus()
//                return@setOnClickListener
//            }
//            if (lastname.isEmpty()){
//                tv_lastname.error = "lastname is required"
//                tv_lastname.requestFocus()
//                return@setOnClickListener
//            }
//            if (phone.isEmpty()){
//                tv_phoneno.error = "phone number is required"
//                tv_firstname.requestFocus()
//                return@setOnClickListener
//            }
//            if (password.isEmpty()){
//                tv_password.error = "password is required"
//                tv_password.requestFocus()
//                return@setOnClickListener
//            }
//            if (password2.isEmpty()){
//                tv_password2.error = "password is required"
//                tv_password2.requestFocus()
//                return@setOnClickListener
//            }
//
//           RetrofitRegistration.instance.createUser(firstname, lastname, phone, password, password2)
//                   //retrofit call backhere
//               .enqueue(object: Callback<RegistrationResponse> {
//                   override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
//                       Toast.makeText(applicationContext, t.message,   Toast.LENGTH_LONG).show()
//                   }
//
//                   override fun onResponse(
//                       call: Call<RegistrationResponse>,
//                       response: Response<RegistrationResponse>
//                   ) {
//                       Toast.makeText(applicationContext, response.body()?.message,   Toast.LENGTH_LONG).show()
//
//                   }
//
//
//               })
//        }
//    }
}