package com.example.lasalleapp.ui.theme.utils

sealed class  Screen(val route:String) {
    data object Home : Screen("home")
    data object Grades : Screen("grades")
    data object Calendar : Screen("calendar")
    data object Settings : Screen("settings")
    data object NewsDetail : Screen("news-detail")
    data object Password : Screen("password")
    data object Theme : Screen("theme")
    data object Materia : Screen("materia")
    data object Payments : Screen("payments")
    data object WhiteScreen : Screen("white-screen")
}