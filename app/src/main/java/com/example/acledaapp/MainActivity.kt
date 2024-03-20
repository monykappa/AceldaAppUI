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
import com.example.acledaapp.screens.AccountScreen
import com.example.acledaapp.screens.BakongScreen
import com.example.acledaapp.screens.DepositScreen
import com.example.acledaapp.screens.LoanScreen
import com.example.acledaapp.screens.MainScreen
import com.example.acledaapp.screens.MobileScreen
import com.example.acledaapp.screens.PayMeScreen
import com.example.acledaapp.screens.PaymentScreen
import com.example.acledaapp.screens.QuickCashScreen
import com.example.acledaapp.screens.ScanQrScreen
import com.example.acledaapp.screens.notificationScreen
import com.example.acledaapp.screens.TransferScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcledaAppTheme {
                HomeScreen()
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun App() {
    HomeScreen()
}


@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            MainScreen(navController = navController)
        }
        composable("notification_page") {
            notificationScreen(navController = navController)
        }
        composable("bakong") {
            BakongScreen(navController = navController)
        }
        composable("payments_page") {
            PaymentScreen(navController = navController)
        }
        composable("mobile_top_up_page") {
            MobileScreen(navController = navController)
        }
        composable("transfers_page") {
            TransferScreen(navController = navController)
        }
        composable("pay_me_page") {
            PayMeScreen(navController = navController)
        }
        composable("scan_qr_page") {
            ScanQrScreen(navController = navController)
        }
        composable("account_page") {
            AccountScreen(navController = navController)
        }
        composable("deposit_page") {
            DepositScreen(navController = navController)
        }
        composable("loan_page") {
            LoanScreen(navController = navController)
        }
        composable("quick_cash_page") {
            QuickCashScreen(navController = navController)
        }
    }
}


