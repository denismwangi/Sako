package com.example.sako.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.sako.R
import com.example.sako.adapters.AccountAdapters
import com.example.sako.model.AccountList

class AccountActivity : AppCompatActivity(),AdapterView.OnItemClickListener {

    private var listView: ListView? = null
    private  var itemAdapters: AccountAdapters? = null
    private  var arrayList:ArrayList<AccountList>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        listView = findViewById(R.id.card_list_view)
        arrayList = ArrayList()
        arrayList = setDataItem()
        itemAdapters = AccountAdapters(applicationContext , arrayList!!)
        listView?.adapter = itemAdapters
        listView?.onItemClickListener = this
    }

    private fun setDataItem(): ArrayList<AccountList> {

        var listItem : ArrayList<AccountList> = ArrayList()

        listItem.add(
            AccountList(
              //  R.drawable.book,
                "Balance",
                " KES 00.00"
            )
        )
        listItem.add(
            AccountList(
                //  R.drawable.book,
                "Deposit",
            ""
            )
        )

        return listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


        var items: AccountList = arrayList?.get(position)!!
        Toast.makeText(applicationContext, items.title, Toast.LENGTH_SHORT).show()

    }
}
