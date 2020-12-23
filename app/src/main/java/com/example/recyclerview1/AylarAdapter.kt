package com.example.recyclerview1

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AylarAdapter(val aylarListesi: List<AylarModel>) : RecyclerView.Adapter<AylarViewHolder>() {

    //ViewHolder ile Layout dosyasını ilişkilendirir.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AylarViewHolder {
        return AylarViewHolder(parent)
    }

    //Verilerin tutulduğu listenin uzunluğunu tutar.
    override fun getItemCount(): Int {
        return aylarListesi.size
    }


    //View’lere yapılan atamaların, içerik bağlamada kullanılan bind fonksiyonunun çağırıldığı yer
    override fun onBindViewHolder(holder: AylarViewHolder, position: Int) {
        holder.bind(aylarListesi[position])
    }
}