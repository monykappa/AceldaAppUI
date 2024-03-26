package com.example.acledaapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview(showSystemUi = true)
@Composable
fun PayMeScreenPreview() {
    val navController = rememberNavController()
    PayMeScreen(navController = navController)
}


@Composable
fun PayMeScreen(navController: NavController) {
    ComposeNavbar(navController = navController, "PAY ME")
}


