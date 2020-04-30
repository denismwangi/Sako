package com.example.grindview.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.grindview.model.DashboardItem
import com.example.sako.R

class DashboardAdapters(var context: Context, var arrayList: ArrayList<DashboardItem> ) : BaseAdapter(){


    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getCount(): Int {
       return arrayList.size
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view:View = View.inflate(context , R.layout.card_view_item_grind, null)
        var icons:ImageView = view.findViewById(R.id.icons)
        var names:TextView = view.findViewById(R.id.name_text_view)

        var listItem:DashboardItem = arrayList.get(position)

        icons.setImageResource(listItem.icons!!)
        names.text = listItem.name

        return view
    }

}
