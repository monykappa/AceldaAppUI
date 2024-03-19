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
import com.example.acledaapp.screens.accountScreen
import com.example.acledaapp.screens.bakongScreen
import com.example.acledaapp.screens.depositScreen
import com.example.acledaapp.screens.loanScreen
import com.example.acledaapp.screens.mainScreen
import com.example.acledaapp.screens.mobileScreen
import com.example.acledaapp.screens.notificationScreen
import com.example.acledaapp.screens.payMeScreen
import com.example.acledaapp.screens.paymentScreen
import com.example.acledaapp.screens.quickCashScreen
import com.example.acledaapp.screens.scanQrScreen
import com.example.acledaapp.screens.transferScreen


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


@Preview(showBackground = true)
@Composable
fun homeSceen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            mainScreen(navController = navController)
        }
        composable("notificaiton_page") {
            notificationScreen()
        }
        composable("bakong") {
            bakongScreen()
        }
        composable("payments_page") {
            paymentScreen()
        }
        composable("mobile_top_up_page") {
            mobileScreen()
        }
        composable("transfers_page") {
            transferScreen()
        }
        composable("pay_me_page") {
            payMeScreen()
        }
        composable("scan_qr_page") {
            scanQrScreen()
        }
        composable("account_page") {
            accountScreen()
        }
        composable("deposit_page") {
            depositScreen()
        }
        composable("loan_page") {
            loanScreen()
        }
        composable("quick_cash_page") {
            quickCashScreen()
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


