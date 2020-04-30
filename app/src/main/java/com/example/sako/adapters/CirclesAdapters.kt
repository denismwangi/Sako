package com.example.sako.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sako.R
import com.example.sako.model.AccountList
import com.example.sako.model.CirclesList

class CirclesAdapters(var context: Context, var arrayList: ArrayList<CirclesList>): BaseAdapter(){


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
        val view:View = View.inflate(context , R.layout.circles_cardview, null)



        // var icons:ImageView = view.findViewById(R.id.icon_list)
        var title: TextView = view.findViewById(R.id.title_text)
        var detail: TextView = view.findViewById(R.id.detail_text)

        var items: CirclesList = arrayList.get(position)

        //      icons.setImageResource(items.icons!!)
        title.text = items.title
        detail.text = items.detail

        return view

    }


}