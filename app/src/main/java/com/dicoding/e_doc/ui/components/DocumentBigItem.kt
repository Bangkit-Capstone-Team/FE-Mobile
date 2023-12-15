package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun DocumentBigItem(document: Document, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.width(140.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
    ) {
        Column {
            Image(
                painter = painterResource(document.imageDocument),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = document.titleDocument,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.ExtraBold)
                )
                Text(text = document.uploaderDocument, style = MaterialTheme.typography.titleSmall)
            }
        }
    }
}

@Composable
fun DocumentRow(
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
        }) { document -> DocumentBigItem(document = document) }
    }
}

@Composable
@Preview(showBackground = true)
fun DocumentBigPreview() {
    EdocTheme {
        DocumentBigItem(document = Document(R.drawable.d_review1, "Hello", "e-doc", 1))
    }
}

