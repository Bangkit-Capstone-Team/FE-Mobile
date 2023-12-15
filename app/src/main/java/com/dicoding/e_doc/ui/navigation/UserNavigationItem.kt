package com.dicoding.e_doc.ui.navigation

import androidx.compose.ui.graphics.painter.Painter

data class UserNavigationItem(
    val title: String,
    val icon: Painter,
    val screen: UserScreen
)