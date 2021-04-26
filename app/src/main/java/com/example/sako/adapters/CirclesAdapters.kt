package com.example.sako.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.interfaces.onCircleClickListener
import com.example.sako.model.CirclesList
import kotlinx.android.synthetic.main.circles_list.view.*


class CirclesAdapters(val circles: ArrayList<CirclesList>,var clickListner: onCircleClickListener) : RecyclerView.Adapter<CirclesAdapters.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CirclesAdapters.ViewHolder {
        lateinit var circlesViewHolder : RecyclerView.ViewHolder
        circlesViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.circles_list,parent,false ))
        return circlesViewHolder
    }

    override fun getItemCount(): Int {
        return circles.size
    }

    override fun onBindViewHolder(holder: CirclesAdapters.ViewHolder, position: Int) {
        holder.initialize(circles.get(position),clickListner)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name = itemView.circlename
        var description = itemView.circledescription
        var time_contrib = itemView.time_contrib
        var amount = itemView.amount

        fun initialize(sacco: CirclesList, action:onCircleClickListener) {

            name.text = sacco.name
            description.text = sacco.description
            time_contrib.text = sacco.time_of_contribution
            amount.text = sacco.min_to_contribute



            itemView.setOnClickListener {
                action.onItemClick(sacco,adapterPosition)
            }



        }
    }


}