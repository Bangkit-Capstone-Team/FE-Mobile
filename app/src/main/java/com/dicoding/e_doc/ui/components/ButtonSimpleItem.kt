package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.data.model.Banner
import com.dicoding.e_doc.ui.theme.EdocTheme
import com.dicoding.e_doc.R
import com.dicoding.e_doc.data.model.Category
import com.dicoding.e_doc.data.model.dummyBanner
import com.dicoding.e_doc.data.model.dummyCategory

@Composable
fun ButtonSimpleItem(
    category: Category,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    bgColor: Color,
    textColor: Color,
) {
    Button(
        onClick = { onClick },
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = textColor
        ),
        shape = MaterialTheme.shapes.small,
    ) {
        Text(text = category.titleCategory)
    }

}

@Composable
fun ButtonSimpleRow(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    bgColor: Color,
    textColor: Color,
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            dummyCategory,
            key = { it.idCategory }) { category ->
            ButtonSimpleItem(
                category = category,
                onClick = { onClick },
                bgColor = bgColor,
                textColor = textColor
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonSimpleRowPreview() {
    EdocTheme {
        ButtonSimpleRow(onClick = {}, bgColor = Color(0xffFFEC86), textColor = Color.Black)
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonSimpleItemPreview() {
    EdocTheme {
        ButtonSimpleItem(
            category = Category("Hand phone", 1),
            modifier = Modifier.padding(horizontal = 8.dp),
            onClick = {},
            bgColor = Color(0xffFFEC86),
            textColor = Color.Black
        )
    }
}
