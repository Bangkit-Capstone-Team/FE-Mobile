package com.dicoding.e_doc.ui.screen.user

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dicoding.e_doc.R
import com.dicoding.e_doc.ui.navigation.UserNavigationItem
import com.dicoding.e_doc.ui.navigation.UserScreen
import com.dicoding.e_doc.ui.screen.user.home.UserHomeScreen
import com.dicoding.e_doc.ui.screen.user.list.UserListScreen
import com.dicoding.e_doc.ui.screen.user.scan.UserScanScreen

@Composable
fun UserMainScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = { BottomBar(navController) }, modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = UserScreen.Beranda.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(UserScreen.Beranda.route) {
                UserHomeScreen(navController)
            }
            composable(UserScreen.Scan.route) {
                UserScanScreen()
            }
            composable(UserScreen.Profile.route) {
                UserScanScreen()
            }
            composable(UserScreen.UserList.route) {
                UserListScreen()
            }

        }
    }
}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val navigationItems = listOf(
            UserNavigationItem(
                title = "Beranda",
                icon = painterResource(R.drawable.ic_home),
                screen = UserScreen.Beranda
            ),
            UserNavigationItem(
                title = "Scan",
                icon = painterResource(R.drawable.outline_camera_alt_24),
                screen = UserScreen.Scan
            ),
            UserNavigationItem(
                title = "Profile",
                icon = painterResource(R.drawable.ic_profile),
                screen = UserScreen.Profile
            ),
        )
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        navigationItems.map { item ->
            NavigationBarItem(

                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                label = { Text(item.title) },
                icon = {
                    Icon(
                        painter = item.icon,
                        contentDescription = item.title
                    )
                })
        }
    }
}