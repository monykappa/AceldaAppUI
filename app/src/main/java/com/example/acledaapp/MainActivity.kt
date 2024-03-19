package com.example.acledaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.screens.bakongScreen
import com.example.acledaapp.screens.mainScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcledaAppTheme {
                homeSceen()
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun app() {
    homeSceen()
}

@Composable
fun homeSceen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            mainScreen(navController = navController)
        }
        composable("detail") {
            bakongScreen()
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


