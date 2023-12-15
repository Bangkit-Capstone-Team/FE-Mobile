package com.dicoding.e_doc.ui.screen.user.list

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.R
import com.dicoding.e_doc.data.model.dummySimpleDocument
import com.dicoding.e_doc.ui.components.ButtonSimpleRow
import com.dicoding.e_doc.ui.components.DocumentSimpleGridRow
import com.dicoding.e_doc.ui.components.SearchItem
import com.dicoding.e_doc.ui.components.SectionTextItem

@Composable
fun UserListScreen() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier.padding(start = 32.dp, end = 32.dp, top = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.xprofile),
                    contentDescription = "image description",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )
                Image(painter = painterResource(id = R.drawable.outline_camera_alt_24),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .clickable { })
            }
            SearchItem(modifier = Modifier.padding(top = 24.dp, bottom = 32.dp))
            SectionTextItem(tile = "Category")
            ButtonSimpleRow(onClick = {}, bgColor = Color(0xffFFEC86), textColor = Color.Black)
            DocumentSimpleGridRow(
                listDocument = dummySimpleDocument,
                modifier = Modifier.padding(top = 24.dp)
            )


        }


    }
}