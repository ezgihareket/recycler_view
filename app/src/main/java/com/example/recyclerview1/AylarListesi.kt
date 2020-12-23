package com.example.recyclerview1

object MockList {
    fun getMockedAylarListesi(): List<AylarModel> {
        val aylarModel = AylarModel(
            1, "Ocak"
        )

        val aylarModel2 = AylarModel(
            2, "Şubat"
        )

        val aylarModel3 = AylarModel(
            3, "Mart"
        )

        val aylarListesi: ArrayList<AylarModel> = ArrayList()

        aylarListesi.add(aylarModel)
        aylarListesi.add(aylarModel2)
        aylarListesi.add(aylarModel3)

        return aylarListesi
    }
}