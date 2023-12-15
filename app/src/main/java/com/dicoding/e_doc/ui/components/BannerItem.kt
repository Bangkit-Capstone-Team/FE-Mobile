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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.e_doc.data.model.Banner
import com.dicoding.e_doc.ui.theme.EdocTheme
import com.dicoding.e_doc.R
import com.dicoding.e_doc.data.model.dummyBanner

@Composable
fun BannerItem(
    banner: Banner,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = Modifier.width(242.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
    ) {
        Image(
            painter = painterResource(id = banner.imageBanner),
            contentDescription = banner.idBanner.toString(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(
                    RoundedCornerShape(8.dp)
                )
        )
    }

}

@Composable
fun BannerRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dummyBanner, key = { it.idBanner }) { banner -> BannerItem(banner = banner) }
    }
}

@Composable
@Preview(showBackground = true)
fun BannerRowPreview() {
    EdocTheme {
        BannerRow()
    }
}

@Composable
@Preview(showBackground = true)
fun BannerItemPreview() {
    EdocTheme {
        BannerItem(
            banner = Banner(R.drawable.d_cannon, 1),
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}
