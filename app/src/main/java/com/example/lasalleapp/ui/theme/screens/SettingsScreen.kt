package com.example.lasalleapp.ui.theme.screens


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.theme.utils.Screen

@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
        Row(
            modifier = Modifier.padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Logo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
                modifier = Modifier.size(70.dp),
            )
            // Usuario
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_text),
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 18.sp
                )
                Text(
                    text = "Quien Soy?",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.W900
                )
            }
    }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
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
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                text = "Diego Andrés Gómez Vázquez",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleSmall,
            )
            Spacer(modifier = Modifier.size(7.dp))
            Text(
                text = "07/05/2003",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleSmall,
            )
            Spacer(modifier = Modifier.size(7.dp))
            Text(
                text = "dgv78501@lasallebajio.edu.mx",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleSmall,
            )
            Spacer(modifier = Modifier.size(7.dp))
            Text(
                text = "Matricula - 78501",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleSmall,
            )
            Spacer(modifier = Modifier.size(50.dp))
            Column(modifier = Modifier.fillMaxWidth().padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(MaterialTheme.colorScheme.primary)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable {
                            Log.i("Clic","Buen Click")
                            navController.navigate(Screen.Password.route)
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(text = "Cambiar Contraseña", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary)
                }
                Spacer(modifier = Modifier.size(10.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(MaterialTheme.colorScheme.primary)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clickable {
                            Log.i("Clic","Buen Click")
                            navController.navigate(Screen.Theme.route)
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(text = "Cambiar Tema", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary)
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
fun SettingsScreenPreview() {
    LaSalleAppTheme {
        val navController = rememberNavController()
        SettingsScreen(innerPadding = PaddingValues(0.dp), navController = navController)
    }
}