package com.example.sako.storage

import android.content.Context
import android.content.SharedPreferences
import com.example.sako.model.User


class SharedPrefManager private constructor( private val mCtx: Context) {


//    fun saveUser(user: User) {
//        val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(
//            SHARED_PREF_NAME,
//            Context.MODE_PRIVATE
//        )
//        val editor = sharedPreferences.edit()
//        editor.putInt("id", user.id)
//        editor.putString("firstname", user.firstname)
//        editor.putString("lastname", user.lastname)
//        editor.putInt("phone", user.phone)
//        editor.putString("password", user.password)
//        editor.apply()
//    }
//
//    val isLoggedIn: Boolean
//        get() {
//            val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(
//                SHARED_PREF_NAME,
//                Context.MODE_PRIVATE
//            )
//            return sharedPreferences.getInt("id", -1) != -1
//        }
//
//    val user: User
//        get() {
//            val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE
//            )
//
//            return User(
//                sharedPreferences.getInt("id", -1),
//                sharedPreferences.getString("firstname", null)!!,
//                sharedPreferences.getString("lastname", null)!!,
//                sharedPreferences.getInt("phone", -1),
//                sharedPreferences.getString("password", null)!!
//            )
//        }
//
//    fun clear() {
//        val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(
//            SHARED_PREF_NAME,
//            Context.MODE_PRIVATE
//        )
//        val editor = sharedPreferences.edit()
//        editor.clear()
//        editor.apply()
//    }
//
//    companion object {
//        private const val SHARED_PREF_NAME = "my_shared_preff"
//        private var mInstance: SharedPrefManager? = null
//
//        @Synchronized
//        fun getInstance(mCtx: Context): SharedPrefManager? {
//            if (mInstance == null) {
//                mInstance = SharedPrefManager(mCtx)
//            }
//            return mInstance as SharedPrefManager
//        }
 //   }
    
}