package com.example.sako

import android.content.Intent
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.grindview.adapters.DashboardAdapters
import com.example.grindview.model.DashboardItem
import com.example.sako.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_navdrawer.*

class NavdrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navdrawer)

        val cirleImg  = findViewById(R.id.circleImg) as ImageView
        val topUpImg = findViewById<ImageView>(R.id.image_topup)
        val witdrawImg = findViewById<ImageView>(R.id.imageWithdraw)
        val loanImg = findViewById<ImageView>(R.id.loanimg)
         setupNavigation()


        cirleImg.setOnClickListener{
            val intent = Intent(this,CirclesActivity::class.java)
            startActivity(intent)
        }
//       topUpImg.setOnClickListener{
//            val intent = Intent(this,TransactionsActivity::class.java)
//            startActivity(intent)
//        }
//        witdrawImg.setOnClickListener{
//            val intent = Intent(this,AccountActivity::class.java)
//            startActivity(intent)
//        }
        loanImg.setOnClickListener{
            val intent = Intent(this,LoansActivity::class.java)
            startActivity(intent)
        }








//
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)


//        setSupportActionBar(toolbar)
//        var actionBar = supportActionBar
//        actionBar?.title = "Home"

        /**
         * closing and open drawer
         * dennis 23/04/2020
         *
         * */
        var drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
//           toolbar,
            (R.string.open),
            (R.string.close)

        ){} //setting empty function

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

    }

    private fun setupNavigation() {
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
//                    val intent = Intent(this,NavdrawerActivity::class.java)
//                    startActivity(intent)
                    super.onOptionsItemSelected(item)
                }
                R.id.history -> {
                    val intent = Intent(this,TransactionsActivity::class.java)
                    startActivity(intent)
                     super.onOptionsItemSelected(item)
                }
                R.id.navigation_account -> {
                    val intent = Intent(this,AccountActivity::class.java)
                    startActivity(intent)
                    true
            }
            else -> true
            }
        }
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





//    override fun onStart() {
//        super.onStart()
//        if(!SharedPrefManager.getInstance(this)!!.isLoggedIn){
//            val intent = Intent(applicationContext, LoginActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            startActivity(intent)
//        }
//    }

}
