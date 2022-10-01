package com.example.picturesfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import androidx.core.graphics.drawable.toDrawable
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val grid:GridView = findViewById(R.id.gridImages)
        var array = ArrayList<images>()
        array.add(images(R.drawable.starwars, "Star Wars"))
        array.add(images(R.drawable.gameofthrones, "Juego de Tronos"))
        array.add(images(R.drawable.houseofdragon, "La casa del Dragón"))
        array.add(images(R.drawable.senoranillos, "El señor de los anillos"))
        var adapter = adapterClass(this,array)
        grid.adapter = adapter

        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this,ViewImage::class.java)
            intent.putExtra("imagen",array[i].drawable)
            intent.putExtra("titulo",array[i].title)
            startActivity(intent)
        }

    }
}