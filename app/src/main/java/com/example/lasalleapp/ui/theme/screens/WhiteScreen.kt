package com.example.lasalleapp.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WhiteScreen(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
        Text(text = "White Page")
    }
}