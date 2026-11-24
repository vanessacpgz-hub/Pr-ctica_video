package io.devexpert.nav3samples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import io.devexpert.nav3samples.ui.theme.Nav3SamplesTheme
import io.devexpert.nav3samples.ui.theme.screens.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Nav3SamplesTheme {
                Navigation()
            }
        }
    }
}