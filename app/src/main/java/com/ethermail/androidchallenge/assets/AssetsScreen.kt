package com.ethermail.androidchallenge.assets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AssetsScreen(assets: List<AssetUiItem>) {
    LazyColumn(
        state = rememberLazyListState(),
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(top = 4.dp),
    ) {
        items(count = assets.size, key = { index -> assets[index].symbol }) { index ->
            AssetView(asset = assets[index])
        }
    }
}

@Composable
private fun AssetView(asset: AssetUiItem) = Card(
    shape = RoundedCornerShape(10),
    modifier = Modifier.fillMaxWidth(),
) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = asset.name)
        Row {
            Text(text = asset.symbol, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = asset.price)
        }
    }
}

@Preview
@Composable
private fun PreviewAssetView() {
    AssetsScreen(assets = dummyAssets)
}