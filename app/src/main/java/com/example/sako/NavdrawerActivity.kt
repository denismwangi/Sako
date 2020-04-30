package com.example.sako

import android.content.Intent
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.grindview.adapters.DashboardAdapters
import com.example.grindview.model.DashboardItem
import com.example.sako.ui.AccountActivity
import com.example.sako.ui.CirclesActivity
import com.example.sako.ui.LoansActivity
import com.example.sako.ui.SavingsActivity
import kotlinx.android.synthetic.main.activity_navdrawer.*

class NavdrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemClickListener {

     private var arrayList: ArrayList<DashboardItem>? = null
     private var gridView: GridView? = null
    private var dashboardAdapters: DashboardAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navdrawer)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        gridView = this.findViewById(R.id.my_grind_list)
        arrayList = ArrayList()
        arrayList = setDataLIst()
        dashboardAdapters = DashboardAdapters(applicationContext, arrayList!!)
         gridView?.adapter = dashboardAdapters
         gridView?.onItemClickListener = this


        setSupportActionBar(toolbar)
        var actionBar = supportActionBar
        actionBar?.title = "Home"

        /**
         * closing and open drawer
         * dennis 23/04/2020
         *
         * */
        var drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            (R.string.open),
            (R.string.close)

        ){} //setting empty function

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

    }
    /**
     * implementing Drawer NavigationView.OnNavigationItemSelectedListener to open other activities menu item is clicked
     * dennis 25/04/2020
     *
     * */

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {

            R.id.month_navigation_account -> {

                this.startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
            R.id.navigation_loans -> {

                this.startActivity(Intent(this, LoansActivity::class.java))
                return true
            }


            R.id.navigation_circles ->{
                this.startActivity(Intent(this, CirclesActivity::class.java))
                return true
            }
             //else -> super.oonNavigationItemSelected(MenuItem)

            R.id.navigation_savings -> {
                this.startActivity(Intent(this, SavingsActivity::class.java))
                return true

            }
            R.id.nav_rate ->{


            }

            R.id.nav_share -> {


            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }



    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)


        } else {
            super.onBackPressed()
        }
    }

    //function that display all the arraylist items
    private fun setDataLIst() : ArrayList<DashboardItem>{

        var arrayList:ArrayList<DashboardItem> = ArrayList()

        arrayList.add(DashboardItem(R.drawable.accounticon, "My Account"))
        arrayList.add(DashboardItem(R.drawable.circles, "Circles"))
        arrayList.add(DashboardItem(R.drawable.saveicon, "Savings"))
        arrayList.add(DashboardItem(R.drawable.loan1, "Loans"))
        //arrayList.add(LanguageItem(R.drawable.book, "book"))


        return arrayList
    }


    /**
    * implementing oncliclistener to open other activities once arraylist item is clicked
    * dennis 27/04/2020
    *
     * */
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        //var items:LanguageItem = arrayList!!.get(position)
       if(position==0){
           val intent = Intent(this,AccountActivity::class.java)
           startActivity(intent)
       }
        else if(position==1){
           val intent = Intent(this,CirclesActivity::class.java)
           startActivity(intent)

        }
        else if(position==2){

           val intent = Intent(this,SavingsActivity::class.java)
           startActivity(intent)
       }
        else if(position == 3){
           //this.startActivity(Intent(this, LoansActivity::class.java))
           //return true

           val intent = Intent(this,LoansActivity::class.java)
           startActivity(intent)


       }
       // else if(position == 5){

      // }
      //  else if(position == 6){

      // }

    }

}
