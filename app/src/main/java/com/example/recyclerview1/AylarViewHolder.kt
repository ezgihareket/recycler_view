package com.example.recyclerview1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AylarViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.activity_detay, container, false
    )
) {
    val crdView: CardView = itemView.findViewById(R.id.cardview1)
    val txtAylaradi: TextView = itemView.findViewById(R.id.txtAylar_adi)

    fun bind(aylarModel: AylarModel) {
        txtAylaradi.text = aylarModel.aylar
    }


}