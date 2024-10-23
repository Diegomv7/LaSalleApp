package com.example.lasalleapp.ui.theme.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.theme.utils.Screen
import com.example.lasalleapp.ui.theme.utils.materias

@Composable
fun GradeScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ){
            Column(modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clip(RoundedCornerShape(60.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mora),
                        contentDescription = "imagenAlumno",
                        contentScale = ContentScale.Crop,
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = "Diego Andrés Gómez Vázquez",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "dgv78501@lasallebajio.edu.mx",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "5to Semestre",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.bodyMedium,
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "Promedio 9.22",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                items(materias){ materias ->
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp)
                        .padding(15.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .clickable {
                            Log.i("Buen Clic", "${materias.id}")
                            navController.navigate(Screen.Materia.route+"/${materias.id}")
                        }
                        .background(MaterialTheme.colorScheme.primary),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            text = materias.nombre,
                            color = MaterialTheme.colorScheme.onPrimary,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        Text(
                            text = "Promedio: ${materias.promedio}",
                            color = MaterialTheme.colorScheme.onPrimary,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}





@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GradesScreenPreview() {
    LaSalleAppTheme {
        val navController = rememberNavController()
        GradeScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}