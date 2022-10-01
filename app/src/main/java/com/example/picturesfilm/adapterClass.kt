package com.example.picturesfilm

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class adapterClass:BaseAdapter {
    var context:Context? = null
    var array = ArrayList<images>()

    constructor(context: Context?, array: ArrayList<images>) : super() {
        this.context = context
        this.array = array
    }

    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(p0: Int): Any {
        return array[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row = inflater.inflate(R.layout.layout_images, null)
        val imagen:ImageView = row.findViewById(R.id.imagen)
        val titulo:TextView = row.findViewById(R.id.titulo)
        Glide.with(context!!).load(array[p0].drawable).into(imagen)
        titulo.text = array[p0].title
        return row
    }

}