package com.example.sako.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.*
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.widget.Toolbar
import androidx.core.view.MenuItemCompat
import com.example.sako.R
import com.example.sako.adapters.AccountAdapters
import com.example.sako.adapters.CirclesAdapters
import com.example.sako.model.AccountList
import com.example.sako.model.CirclesList

class CirclesActivity : AppCompatActivity() {
    private var listView: ListView? = null
    private  var itemAdapters: CirclesAdapters? = null
    private  var arrayList:ArrayList<CirclesList>? = null

   // lateinit var mListview: ListView
   // lateinit var mArrayAdapter : ArrayAdapter<String>
   // val mArrayList = arrayOf("Chama1","Chama1","Chama1","Chama1","Chama1","Chama1","Chama1","Chama1","Chama1","Chama1","Chama1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circles)
      //  val search = findViewById<SearchView>(R.id.search_view) as SearchView


       // mListview = findViewById(R.id.list_view)
       // mArrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mArrayList)
        //mListview.adapter = mArrayAdapter

        listView = findViewById(R.id.card_list_view)
        arrayList = ArrayList()
        arrayList = setDataItem()
        itemAdapters = CirclesAdapters(applicationContext , arrayList!!)
        listView?.adapter = itemAdapters
      //  listView?.onItemClickListener = this


        val toolbar: Toolbar = findViewById(R.id.toolbar_circles)
        setSupportActionBar(toolbar)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = "Circles"

        //actionbar
        //val actionbar = supportActionBar
        //set actionbar title
        // actionbar?.title = "Loans"

        //set back button
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

      //  val btn = findViewById<Button>(R.id.btn_add_circle) as Button

      //  btn.setOnClickListener{

         //   val intent = Intent(this, AddCirclesActivity::class.java )
         //   startActivity(intent)
       // }

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener {
                //view ->
           // Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
            //    .setAction("Action", null)
              //  .show()
            val intent = Intent(this, AddCirclesActivity::class.java )
              startActivity(intent)
        }

       /** search.setOnQueryTextListener(object :SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                mArrayAdapter.filter.filter(newText)
                return false
            }
        })
        */
    }


        private fun setDataItem(): ArrayList<CirclesList> {

            var listItem : ArrayList<CirclesList> = ArrayList()

            listItem.add(
          CirclesList(
                    //  R.drawable.book,
                    "Chama 1",
                    " this is...."
                )
            )
            listItem.add(
                CirclesList(
                    //  R.drawable.book,
                    "Chama 1",
                    " this is...."
                )
            )
            listItem.add(
                CirclesList(
                    //  R.drawable.book,
                    "Chama 1",
                    " this is...."
                )
            )



            return listItem
        }


//back arrow button function to return toolbar
override fun onSupportNavigateUp(): Boolean {
    onBackPressed()
    return true
}
}
