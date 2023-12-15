package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.R
import com.dicoding.e_doc.data.model.Document
import com.dicoding.e_doc.ui.theme.EdocTheme

@Composable
fun DocumentBigSimpleItem(document: Document) {
    Card(
        modifier = Modifier.width(140.dp).padding(bottom = 8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
    ) {
        Box {
            Image(
                painter = painterResource(document.imageDocument),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
            )
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp),
                color = Color.Transparent
            ) {
                Canvas(
                    modifier = Modifier.fillMaxSize(),
                    onDraw = {
                        val colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.5f))
                        drawRect(Brush.verticalGradient(colors))
                    }
                )
            }
            Text(
                modifier = Modifier.padding(top = 110.dp, start = 8.dp),
                text = document.titleDocument,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )

        }


    }
}

@Composable
fun DocumentSimpleRow(
    listDocument: List<Document>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(listDocument, key = {
            it.idDocument
        }) { document -> DocumentBigSimpleItem(document = document) }
    }
}

@Composable
fun DocumentSimpleGridRow(
    listDocument: List<Document>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(listDocument, key = {
            it.idDocument
        }) { document ->
            DocumentBigSimpleItem(
                document = document
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DocumentBigSimplePreview() {
    EdocTheme {
        DocumentBigItem(document = Document(R.drawable.d_review1, "Hello", "e-doc", 1))
    }
}

