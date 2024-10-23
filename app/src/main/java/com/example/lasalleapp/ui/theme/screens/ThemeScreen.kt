package com.example.lasalleapp.ui.theme.screens

import android.content.res.Resources.Theme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ThemeScreen(innerPadding: PaddingValues) {
    Text(text = "Theme", textAlign = TextAlign.Center,modifier = Modifier.padding(innerPadding))
}