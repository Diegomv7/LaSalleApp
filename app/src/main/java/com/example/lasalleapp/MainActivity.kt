package com.example.lasalleapp

import MateriaScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.theme.models.BottomNavigationItem
import com.example.lasalleapp.ui.theme.screens.*
import com.example.lasalleapp.ui.theme.utils.Screen
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var selectedItem by rememberSaveable { mutableStateOf(0) }
            val navController = rememberNavController()

            LaSalleAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        AnimatedNavigationBar(
                            selectedIndex = selectedItem,
                            modifier = Modifier.height(90.dp),
                            barColor = MaterialTheme.colorScheme.primary,
                            cornerRadius = shapeCornerRadius(34.dp)
                        ) {
                            BottomNavigationItem.items.forEachIndexed { index, item ->
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clickable {
                                            navController.navigate(item.route) {
                                                launchSingleTop = true
                                            }
                                            selectedItem = index
                                        },
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = item.icon,
                                        contentDescription = item.title,
                                        tint = if (selectedItem == index)
                                            MaterialTheme.colorScheme.onPrimary
                                        else
                                            MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f),
                                        modifier = Modifier.size(26.dp)
                                    )
                                    Text(
                                        text = item.title,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = if (selectedItem == index)
                                            MaterialTheme.colorScheme.onPrimary
                                        else
                                            MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f)
                                    )
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(navController, startDestination = Screen.Home.route) {
                        composable(Screen.Home.route) {
                            HomeScreen(innerPadding, navController)
                        }
                        composable(Screen.Grades.route) {
                            GradeScreen(innerPadding, navController)
                        }
                        composable(Screen.Calendar.route) {
                            CalendarScreen(innerPadding)
                        }
                        composable(Screen.Settings.route) {
                            SettingsScreen(innerPadding, navController)
                        }
                        composable(
                            Screen.NewsDetail.route + "/{newsId}",
                            arguments = listOf(navArgument("newsId") { type = NavType.IntType })
                        ) {
                            val newsId = it.arguments?.getInt("newsId") ?: 0
                            NewsDetailScreen(innerPadding, newsId)
                        }
                        composable(Screen.Password.route) {
                            PasswordScreen(innerPadding)
                        }
                        composable(Screen.Theme.route) {
                            ThemeScreen(innerPadding)
                        }
                        composable(Screen.Payments.route) {
                            PaymentScreen(innerPadding)
                        }
                        composable(Screen.WhiteScreen.route) {
                            WhiteScreen(innerPadding)
                        }
                        composable(
                            Screen.Materia.route + "/{materiaId}",
                            arguments = listOf(navArgument("materiaId") { type = NavType.IntType })
                        ) {
                            val materiaId = it.arguments?.getInt("materiaId")
                                ?: throw IllegalArgumentException("MateriaId no encontrado")
                            MateriaScreen(innerPadding, materiaId)
                        }
                    }
                }
            }
        }
    }
}