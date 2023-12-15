package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.ui.theme.EdocTheme
import com.dicoding.e_doc.data.model.dummyCategory

@Composable
fun ButtonDefaultItem(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    bgColor: Color,
    textColor: Color,
    title: String,
) {
    Button(
        onClick = { onClick },
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = textColor
        ),
        shape = MaterialTheme.shapes.extraSmall,
        modifier = modifier,
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium)
        )
    }

}

@Composable
fun ButtonDefaultRow(
    modifier: Modifier = Modifier,
    btnModifier: Modifier,
    onClick: () -> Unit,
    bgColor: Color,
    textColor: Color,
    title: String
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            dummyCategory,
            key = { it.idCategory }) { category ->
            ButtonDefaultItem(
                title = title,
                onClick = { onClick },
                bgColor = bgColor,
                textColor = textColor,
                modifier = btnModifier
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonDefaultRowPreview() {
    EdocTheme {
        ButtonDefaultRow(
            title = "Login",
            onClick = {},
            bgColor = Color(0xffFFEC86),
            textColor = Color.Black,
            btnModifier = Modifier
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonDefaultItemPreview() {
    EdocTheme {
        ButtonDefaultItem(
            title = "Login",
            modifier = Modifier.padding(horizontal = 8.dp),
            onClick = {},
            bgColor = Color(0xffFFEC86),
            textColor = Color.Black
        )
    }
}
