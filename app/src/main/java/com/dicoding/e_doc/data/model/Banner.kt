package com.dicoding.e_doc.data.model

import androidx.annotation.DrawableRes
import com.dicoding.e_doc.R

data class Banner(
    @DrawableRes val imageBanner: Int,
    val idBanner: Int
)

val dummyBanner = listOf(
    R.drawable.d_cannon to 1,
    R.drawable.d_ipad to 2,
    R.drawable.d_hp_printer to 3,
    R.drawable.d_tv to 4,
).map { Banner(it.first, it.second) }