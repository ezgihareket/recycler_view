package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview1.layoutManager = LinearLayoutManager(this)
        recyclerview1.adapter = AylarAdapter(MockList.getMockedAylarListesi())
    }
}



// -> build.gradle dosyasına RecyclerView kütüphanesini implaement edildi.
// -> xml dosyaları oluşturuldu.(activity_detay)
// -> Model Sınıfı oluşturuldu.(AylarModel)
// -> View’lerin içeriklerinin bulunduğu Liste oluşturuldu.(AylarListesi)
// -> ViewHolder oluşturuldu ve view’lerin bilgileri, layout dosyası ve içerikler bağlandı.(AylarViewHolder)
// -> Adapter oluşturuldu.(AylarAdapter)
// -> MainActivity e gerekli kodlar yazıldı.