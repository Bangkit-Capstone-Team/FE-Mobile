package com.dicoding.e_doc.data.model

import androidx.annotation.DrawableRes
import com.dicoding.e_doc.R

data class Document(
    @DrawableRes val imageDocument: Int,
    val titleDocument: String,
    val uploaderDocument: String,
    val idDocument: Int
)

val dummyDocument = listOf(
    Document(R.drawable.d_review1, "Cara menghubungkan cctv", "e-doc", 1),
    Document(R.drawable.d_review2, "Memasang lensa kamera sony", "sony", 2),
    Document(R.drawable.d_review2, "Menginstall driver printer", "epson", 3),
    Document(R.drawable.d_review1, "Cara membungkar kipas angin philips", "philips", 4),
)

val dummySimpleDocument = listOf(
    Document(R.drawable.d_ipad, "ipad", "e-doc", 1),
    Document(R.drawable.d_cannon, "cannon", "sony", 2),
    Document(R.drawable.d_hp_printer, "hp printer", "hp", 3),
    Document(R.drawable.d_tv, "tv klasik", "e-doc", 4),
    Document(R.drawable.d_keyboard, "magic keyboard", "apple", 5),
    Document(R.drawable.d_iphone, "iphone", "apple", 6),
)

val dummyLastDocument = dummyDocument.shuffled()