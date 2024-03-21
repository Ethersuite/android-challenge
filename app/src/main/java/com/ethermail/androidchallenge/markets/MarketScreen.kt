package com.ethermail.androidchallenge.markets


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ethermail.androidchallenge.data.model.markets.MarketData

// TODO: Implement MarketScreen properly with the real data from CoinCap API as part of the code challenge
@Composable
fun MarketScreen(market: MarketData) = Box(modifier = Modifier.fillMaxSize()) {
    Card(
        shape = RoundedCornerShape(10),
        modifier = Modifier
            .fillMaxSize(0.9F)
            .align(Alignment.Center)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Exchange ID", fontWeight = FontWeight.Bold)
            Text(text = "${market.exchangeId}")

            Text(text = "Rank", fontWeight = FontWeight.Bold)
            Text(text = "${market.rank}")

            Text(text = "Price", fontWeight = FontWeight.Bold)
            Text(text = "${market.priceUsd}")

            Text(text = "Date", fontWeight = FontWeight.Bold)
            Text(text = "${market.updated}")
        }
    }
}

@Composable
@Preview
private fun PreviewMarketScreen() = MarketScreen(
    market = MarketData(
        exchangeId = "bibox",
        rank = "76",
        baseSymbol = "BSV",
        baseId = "bitcoin-sv",
        quoteSymbol = "BTC",
        quoteId = "bitcoin",
        priceQuote = "0.0012093000000000",
        percentExchangeVolume = "percentExchangeVolume",
        priceUsd = "80.3713214940290781",
        tradesCount24Hr = "12848",
        updated = 1711035429482,
        volumeUsd24Hr = "645445.1245697122860790"
    )
)