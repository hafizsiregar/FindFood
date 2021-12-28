package com.example.findfood.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.findfood.R
import com.example.findfood.model.Food

class ListFoodAdapter(private val context: Context, private val food: List<Food>, val listener: (Food) -> Unit)
    : RecyclerView.Adapter<ListFoodAdapter.FoodViewHolder>(){

    class FoodViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFood = view.findViewById<ImageView>(R.id.tvImage)
        val titleFood = view.findViewById<TextView>(R.id.tvTitle)
        val priceFood = view.findViewById<TextView>(R.id.tvPrice)

        fun bindView(food: Food, listener: (Food) -> Unit) {
            imgFood.setImageResource(food.imgFood)
            titleFood.text = food.titleFood
            priceFood.text = food.priceFood
            itemView.setOnClickListener {
                listener(food)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_food, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
       holder.bindView(food[position], listener)
    }

    override fun getItemCount(): Int = food.size

}