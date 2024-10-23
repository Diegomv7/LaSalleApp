package com.example.lasalleapp.ui.theme.models

import android.widget.ImageView
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.lasalleapp.ui.theme.utils.Screen

data class BottomNavigationItem(
    val title : String,
    val icon : ImageVector,
    val route: String
) {
    companion object {
        val items = listOf(
            BottomNavigationItem(
                title = "Home",
                icon = Icons.Default.Home,
                route = Screen.Home.route
            ),
            BottomNavigationItem(
                title = "Calificaciones",
                icon = Icons.Default.Menu,
                route = Screen.Grades.route
            ),BottomNavigationItem(
                title = "Calendario",
                icon = Icons.Default.DateRange,
                route = Screen.Calendar.route
            ),BottomNavigationItem(
                title = "Configuracion",
                icon = Icons.Default.Settings,
                route = Screen.Settings.route
            )
        )
    }
}