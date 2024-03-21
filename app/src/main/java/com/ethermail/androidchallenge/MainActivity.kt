package com.ethermail.androidchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ethermail.androidchallenge.assets.AssetsScreen
import com.ethermail.androidchallenge.assets.dummyAssets
import com.ethermail.androidchallenge.ui.theme.AndroidChallengeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidChallengeTheme {
                // TODO: To be replaced with the real data from CoinCap API as part of the code challenge
                // TODO: implement navigation strategy for the application
                AssetsScreen(assets = dummyAssets)
            }
        }
    }
}
