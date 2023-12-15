package com.dicoding.e_doc.ui.navigation

sealed class UserScreen(val route: String) {
    object Beranda : UserScreen("beranda")
    object Scan : UserScreen("scan")
    object Profile : UserScreen("profile")
}