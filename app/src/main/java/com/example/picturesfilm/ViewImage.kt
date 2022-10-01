package com.example.picturesfilm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class ViewImage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_image)
        val imagen:ImageView = findViewById(R.id.VerImagen)
        val titulo:TextView = findViewById(R.id.titlePeli)
        var loadImagen = intent.extras
        titulo.text = loadImagen!!.getString("titulo")
        Glide.with(this).load(loadImagen!!.getInt("imagen"))
            .circleCrop()
            .into(imagen)
    }
}