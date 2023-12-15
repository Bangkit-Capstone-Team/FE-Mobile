package com.dicoding.e_doc.ui.model

import androidx.annotation.DrawableRes
import com.dicoding.e_doc.R

data class Banner(
    @DrawableRes val imageBanner: Int,
    val idBanner: Int
)

val dummyBanner = listOf(
    R.drawable.dCannon to 1,
    R.drawable.dCannon to 2,
    R.drawable.dCannon to 3,
    R.drawable.dCannon to 4,
).map { Banner(it.first, it.second) }