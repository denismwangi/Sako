package com.example.sako.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sako.R
import com.example.sako.model.IntroSlide

class IntroSliderAdapter(private val introSlides: List<IntroSlide>) :
    RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    inner class IntroSliderViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)
        private val imageIcon = view.findViewById<ImageView>(R.id.imageSlideIcon)

        fun bind(introSlide: IntroSlide){
            textTitle.text = introSlide.title
            textDescription.text = introSlide.description
            imageIcon.setImageResource(introSlide.icon)
        }
    }
}