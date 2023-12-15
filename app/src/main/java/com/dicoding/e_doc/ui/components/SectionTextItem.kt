package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SectionTextItem(tile: String, modifier: Modifier = Modifier) {
    Text(
        text = tile,
        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    )
}