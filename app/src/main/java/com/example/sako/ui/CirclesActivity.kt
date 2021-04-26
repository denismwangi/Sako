package com.example.sako.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.sako.R
import com.example.sako.adapters.CirclesAdapters
import com.example.sako.interfaces.onCircleClickListener
import com.example.sako.model.CirclesList
import kotlinx.android.synthetic.main.activity_circles.*
import kotlinx.android.synthetic.main.nav_header_navdrawer.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class CirclesActivity : AppCompatActivity(), onCircleClickListener {


    lateinit var saccos: ArrayList<CirclesList>
    private val API_URL = "http://api.sakoapp.co.ke/api/allsaccos"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circles)

        saccos  = ArrayList()
        getCircles()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, 1))

        recyclerView.adapter = CirclesAdapters(saccos, this)
    }

   private fun getCircles(){

       val progressBar = findViewById<View>(R.id.progressBar) as ProgressBar
       //making the progressbar visible
       progressBar.visibility = View.VISIBLE

       // Request a string response from the provided URL.
       val stringRequest = StringRequest(Request.Method.GET, API_URL,
           Response.Listener { response ->
               //hiding the progressbar after completion
               progressBar.setVisibility(View.INVISIBLE)


               try {
                   val obj = JSONObject(response)
                   val saccoArray = obj.getJSONArray("saccos")


                   for (i in 0 until saccoArray.length()) {
                       val saccoObject = saccoArray.getJSONObject(i)

                       val sacco = CirclesList(
                           saccoObject.getString("name"),
                           saccoObject.getString("description"),
                           saccoObject.getString("time_of_contribution"),
                           saccoObject.getString("min_to_contribute")

                       )

                       saccos.add(sacco)

                   }

                   val adapter = CirclesAdapters(saccos,this)
                   recyclerView.setAdapter(adapter)

               } catch (e: JSONException) {
                   e.printStackTrace()
               }
           },
           Response.ErrorListener { error ->
               //displaying the error in toast if occurrs
               Toast.makeText(applicationContext, error.message, Toast.LENGTH_SHORT).show()
           })
       //creating a request queue
       val requestQueue = Volley.newRequestQueue(this)

       //adding the string request to request queue
       requestQueue.add(stringRequest)

   }


    override fun onItemClick(item: CirclesList, position: Int) {
        val intent = Intent(this, CircleDetailsActivity::class.java)
        intent.putExtra("name", item.name)
        intent.putExtra("description", item.description)
        intent.putExtra("time of contribution", item.time_of_contribution)
        intent.putExtra("min to contribute", item.min_to_contribute)
        startActivity(intent)


    }


}
