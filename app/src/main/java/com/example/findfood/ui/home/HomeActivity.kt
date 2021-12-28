package com.example.findfood.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findfood.R
import com.example.findfood.model.Food
import com.example.findfood.ui.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnProfile = findViewById<ImageView>(R.id.imgProfile)
        btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        val foodList = listOf<Food>(
            Food(
                R.drawable.nasgor,
                "Nasi Goreng",
                "Rp 10.000",
                ),
            Food(
                R.drawable.miegor,
                "Mie Goreng",
                "Rp 10.000",),
            Food(
                R.drawable.ice,
                "Ice Cream",
                "Rp 7.000",),
            Food(
                R.drawable.sate,
                "Sate Padang",
                "Rp 12.000",),
            Food(
                R.drawable.nasilemak,
                "Nasi Lemak",
                "Rp 8.0000",),
            Food(
                R.drawable.lamongan,
                "Ayam Lamongan",
                "Rp 15.000",),
            Food(
                R.drawable.lontong,
                "Lontong Sayur",
                "Rp 7.000",),
            Food(
                R.drawable.opor,
                "Opor Ayam",
                "Rp 12.000",),
            Food(
                R.drawable.ayamgor,
                "Ayam Goreng",
                "Rp 15.000",),
            Food(
                R.drawable.ikanbakar,
                "Ikan Bakar",
                "Rp 17.000",),
            Food(
                R.drawable.pecelele,
                "Pecel Lele",
                "Rp 20.000",
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_food)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ListFoodAdapter(this, foodList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}