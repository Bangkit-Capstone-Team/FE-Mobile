package com.dicoding.e_doc.ui.screen.user.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.R
import com.dicoding.e_doc.data.model.dummyDocument
import com.dicoding.e_doc.data.model.dummyLastDocument
import com.dicoding.e_doc.data.model.dummySimpleDocument
import com.dicoding.e_doc.ui.components.BannerRow
import com.dicoding.e_doc.ui.components.DocumentRow
import com.dicoding.e_doc.ui.components.DocumentSimpleRow
import com.dicoding.e_doc.ui.components.SearchItem
import com.dicoding.e_doc.ui.components.SectionTextItem

@Composable
fun UserHomeScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .padding(start = 32.dp, end = 32.dp, top = 20.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.xprofile),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.outline_camera_alt_24),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp).clickable {  }
                )
            }
            SearchItem(modifier = Modifier.padding(top = 24.dp, bottom = 32.dp))
        }
        BannerRow()
        Column(
            modifier = Modifier
                .padding(start = 32.dp, end = 32.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SectionTextItem(tile = "Continue Watching")
                SectionTextItem(tile = ">")
            }
            DocumentRow(dummyDocument)
            Row(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SectionTextItem(tile = "New Document")
                SectionTextItem(tile = ">")
            }
            DocumentSimpleRow(dummySimpleDocument)
            Row(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .clickable { },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SectionTextItem(tile = "Popular Document")
                SectionTextItem(tile = ">")
            }
            DocumentSimpleRow(dummySimpleDocument)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        value = text,
        onValueChange = { text = it },
    )
}

@Composable
fun FilledTonalButtons(onClick: () -> Unit) {
    Button(
        onClick = { onClick() }, colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF3A94EC),
            contentColor = Color.White
        ), modifier = Modifier
            .padding(top = 52.dp)
            .fillMaxWidth()
            .height(53.dp)
    ) {
        Text("Daftar")
    }
}