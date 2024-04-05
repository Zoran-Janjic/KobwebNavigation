package org.example.kobwebtest.components.Navigation

sealed class Screen(val route: String) {
    object HomePage : Screen(route = "/")
    object AboutPage : Screen(route = "/about")
    object ContactPage : Screen(route = "/contact")
    object LoginPage : Screen(route = "/login")

}