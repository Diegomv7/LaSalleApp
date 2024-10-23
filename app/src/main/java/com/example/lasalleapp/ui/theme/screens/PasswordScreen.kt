package com.example.lasalleapp.ui.theme.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun PasswordScreen(innerPadding: PaddingValues) {
    Text(text = "Password", textAlign = TextAlign.Center,modifier = Modifier.padding(innerPadding))
}