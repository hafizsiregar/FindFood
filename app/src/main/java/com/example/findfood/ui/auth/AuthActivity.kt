package com.example.findfood.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.findfood.ui.home.HomeActivity
import com.example.findfood.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val btnLogin : Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            Toast.makeText(this, "Kamu berhasil Login", Toast.LENGTH_SHORT).show()
        }

        val btnLoginGoogle : Button = findViewById(R.id.btn_login_google)
        btnLoginGoogle.setOnClickListener {
            Toast.makeText(this,"Kamu harus login terlebih dahulu", Toast.LENGTH_SHORT).show()
        }

        val btnDaftar : Button = findViewById(R.id.btn_daftar)
        btnDaftar.setOnClickListener {
            Toast.makeText(this,"Kamu harus login terlebih dahulu", Toast.LENGTH_SHORT).show()
        }
    }
}