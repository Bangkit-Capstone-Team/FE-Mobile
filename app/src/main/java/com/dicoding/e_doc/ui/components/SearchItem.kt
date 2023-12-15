package com.dicoding.e_doc.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.ui.theme.EdocTheme
import com.dicoding.e_doc.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchItem(modifier: Modifier = Modifier) {
    SearchBar(
        query = "",
        onQueryChange = {},
        onSearch = {},
        active = false,
        onActiveChange = {},
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 48.dp),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        shape = MaterialTheme.shapes.small,
        colors = SearchBarDefaults.colors(containerColor = MaterialTheme.colorScheme.background),
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    EdocTheme {
        SearchItem()
    }
}