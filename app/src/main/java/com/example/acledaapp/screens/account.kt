package com.example.acledaapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import com.example.acledaapp.R
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.models.FavoriteItem
import com.example.acledaapp.models.MenuItems
import com.example.acledaapp.models.drawerItems
import com.example.acledaapp.models.favoriteItems
import com.example.acledaapp.models.menuRow1
import com.example.acledaapp.models.menuRow2
import com.example.acledaapp.models.menuRow3
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.poppinsFontFamily
import com.example.acledaapp.models.truenorgFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


//@Preview(showSystemUi = true)
@Composable
fun accountScreen(navController: NavController) {
    accountNavBar(navController = navController)

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Preview(showSystemUi = true)
@Composable
fun accountNavBar(navController: NavController) {
    Surface {
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.height(60.dp),
                    title = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 25.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "ACCOUNTS",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                fontFamily = montyFontFamily,
                                fontSize = 18.sp,
                                color = Color.White,
                                modifier = Modifier
                            )
                        }
                    },
                    backgroundColor = Color(0xFF173a67),
                    navigationIcon = {
                        IconButton(onClick = { navController.navigate("home") }) {
                            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back", modifier = Modifier.size(20.dp))
                        }
                    },
                    actions = {
                        Box(
                            modifier = Modifier.padding(end = 16.dp)
                        ) {
                            IconButton(
                                onClick = { /* Handle logo image click */ },
                                modifier = Modifier.size(40.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ac_logo),
                                    contentDescription = "Account"
                                )
                            }
                        }
                    },
                    elevation = AppBarDefaults.TopAppBarElevation
                )

            }
        ) {
            // Content of the scaffold
        }
    }
}





//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Preview(showSystemUi = true)
//@Composable
//fun accountScreen() {
//    val accountList = listOf(
//        Account(number = "015 XXX XXX", name = "Wallet Account", balance = 950.00, currency = "KHR"),
//        Account(number = "015 XXX XXX", name = "Wallet Account", balance = 260.28, currency = "USD"),
//        Account(number = "0001-XXXXXXXX-27", name = "Savings Account", balance = 800.00, currency = "KHR"),
//        Account(number = "0001-XXXXXXXX-37", name = "Credit Card Account", balance = 0.00, currency = "USD"),
//        Account(number = "0001-XXXXXXXX-47", name = "Credit Card Account", balance = 4160.73, currency = "USD"),
//        Account(number = "0001-XXXXXXXX-14", name = "Payroll Account", balance = 43501.66, workingBalance = 10501.66, currency = "USD"),
//    )
//
//
//        Surface(color = MaterialTheme.colors.background) {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text("ACCOUNTS") },
//                        backgroundColor = MaterialTheme.colors.primary
//                    )
//                }
//            ) {
//                LazyColumn(contentPadding = PaddingValues(16.dp)) {
//                    items(accountList) { account ->
//                        AccountCard(account = account)
//                    }
//                }
//            }
//        }
//
//}
//
//@Composable
//fun AccountCard(account: Account) {
//    Card(
//        elevation = 4.dp,
//        modifier = Modifier.padding(16.dp)
//    ) {
//        Column {
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(text = account.number, style = MaterialTheme.typography.body1)
//                Spacer(modifier = Modifier.weight(1f))
//                Text(text = account.name, style = MaterialTheme.typography.body1)
//            }
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(
//                    text = "Available balance",
//                    style = MaterialTheme.typography.caption
//                )
//                Spacer(modifier = Modifier.weight(1f))
//                Text(
//                    text = "${account.balance} ${account.currency}",
//                    style = MaterialTheme.typography.body1
//                )
//            }
//            if (account.workingBalance != null) {
//                Row(
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text(
//                        text = "Working balance",
//                        style = MaterialTheme.typography.caption
//                    )
//                    Spacer(modifier = Modifier.weight(1f))
//                    Text(
//                        text = "${account.workingBalance} ${account.currency}",
//                        style = MaterialTheme.typography.body1
//                    )
//                }
//            }
//        }
//    }
//}
//
//data class Account(
//    val number: String,
//    val name: String,
//    val balance: Double,
//    val currency: String,
//    val workingBalance: Double? = null
//)