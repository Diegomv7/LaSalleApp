package com.example.lasalleapp.ui.theme.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lasalleapp.ui.theme.models.News

@Composable
fun CardImage(news: News, onClick:(News)->Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable{
            onClick(news)
        }
    ) {
        AsyncImage(
            model = news.image,
            contentDescription = "CardImage",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.Crop
        )
    }
}