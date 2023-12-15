package com.dicoding.e_doc.data.model

data class Category(
    val titleCategory: String,
    val idCategory: Int
)

val dummyCategory = listOf(
    "Hand phone" to 1,
    "Tv" to 2,
    "Kamera" to 3,
    "Printer" to 4,
    "Monitor" to 5,
    "Headphone" to 6,
    "Keyboard" to 7,
).map { Category(it.first, it.second) }