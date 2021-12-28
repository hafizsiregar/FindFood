package com.example.findfood.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.findfood.R
import com.example.findfood.model.Food

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val food = intent.getParcelableExtra<Food>(HomeActivity.INTENT_PARCELABLE)
        val imgFood = findViewById<ImageView>(R.id.tvImage)
        val titleFood = findViewById<TextView>(R.id.tvTitle)
        val priceFood = findViewById<TextView>(R.id.tvPrice)

        val btnFavorite: Button = findViewById(R.id.btnFavorite)
        btnFavorite.setOnClickListener {
            Toast.makeText(it.context, "Yeay, kamu berhasil menambahkan makanan ini ke dalam favorit kamu", Toast.LENGTH_SHORT).show()
        }

        if (food != null) {
            imgFood.setImageResource(food.imgFood)
        }
        if (food != null) {
            titleFood.text = food.titleFood
        }
        if (food != null) {
            priceFood.text = food.priceFood
        }
    }
}