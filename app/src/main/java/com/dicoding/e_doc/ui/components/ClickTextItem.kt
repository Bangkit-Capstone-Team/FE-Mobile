package com.dicoding.e_doc.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ClickTextItem(texts: String,modifier: Modifier = Modifier) {
    androidx.compose.foundation.text.ClickableText(
        text = AnnotatedString(texts),
        modifier = modifier,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF5B5B5B),
        ),
        onClick = {
        }
    )
}