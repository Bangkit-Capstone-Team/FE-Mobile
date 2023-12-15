package com.dicoding.e_doc.ui.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.R
import com.dicoding.e_doc.ui.components.ButtonDefaultItem
import com.dicoding.e_doc.ui.components.SectionTextItem

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .padding(start = 32.dp, end = 32.dp, top = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.xprofile),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )
                Column {
                    SectionTextItem(tile = "Suminah", fontWeight = FontWeight.Bold)
                    SectionTextItem(tile = "Personal Use", fontWeight = FontWeight.Light)
                }
            }
        }
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Black,
            title = "Buat Dokumentasi",
            modifier = Modifier
                .padding(bottom = 18.dp)
                .fillMaxWidth()
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Black,
            title = "Bahasa",
            modifier = Modifier
                .padding(bottom = 0.5.dp)
                .fillMaxWidth()
                .height(60.dp)
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Black,
            title = "FAQ",
            modifier = Modifier
                .padding(bottom = 0.5.dp)
                .fillMaxWidth()
                .height(60.dp)
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Black,
            title = "Mode",
            modifier = Modifier
                .padding(bottom = 28.dp)
                .fillMaxWidth()
                .height(60.dp)
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Black,
            title = "Tentang",
            modifier = Modifier
                .padding(bottom = 28.dp)
                .fillMaxWidth()
                .height(60.dp)
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
        ButtonDefaultItem(
            onClick = { },
            bgColor = Color.White,
            textColor = Color.Red,
            title = "Keluar",
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()
                .height(60.dp)
                .height(60.dp)
                .shadow(elevation = 1.dp, shape = RectangleShape)
        )
    }
}