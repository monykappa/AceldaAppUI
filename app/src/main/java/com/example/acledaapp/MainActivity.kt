package com.example.acledaapp

import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.text.KeyboardOptions
import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.screens.mainScreen
import com.example.acledaapp.screens.detailScreen
import com.example.acledaapp.screens.mainScreen
import com.example.acledaapp.screens.mainScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcledaAppTheme {
                mainScreen()
                }
            }
        }
    }







//@Preview(showBackground = true)
//@Composable
//fun app() {
//            composeNavScreen()
//}
//
//@Composable
//fun composeNavScreen() {
//    val navController = rememberNavController()
//
//    NavHost(navController = navController, startDestination = "home") {
//        composable("home") {
//            mainScreen(navController = navController)
//        }
//        composable("detail") {
//            detailScreen()
//        }
//    }
//}


