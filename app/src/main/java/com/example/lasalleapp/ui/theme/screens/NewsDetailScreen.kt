package com.example.lasalleapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lasalleapp.ui.theme.utils.newsList

@Composable
fun NewsDetailScreen(innerPadding: PaddingValues, newsId: Int) {
    val news = newsList.first{ it.id == newsId }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.fillMaxWidth().height(300.dp).padding(16.dp),
        ){
            AsyncImage(
                model = news.image,
                contentDescription = news.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(20.dp))
            )
        }

        Text(
            text = news.title,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center
        )

        Text(text = news.description,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 10.dp)
            )
    }
}