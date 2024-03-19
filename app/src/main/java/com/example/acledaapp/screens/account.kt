package com.example.acledaapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.menuRow1
import com.example.acledaapp.models.menuRow2
import com.example.acledaapp.models.menuRow3
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.poppinsFontFamily
import com.example.acledaapp.models.truenorgFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch





@Preview(showSystemUi = true)
@Composable
fun AccountScreenPreview() {
    val navController = rememberNavController()

    accountScreen(navController = navController)
}

@Composable
fun accountScreen(navController: NavController) {
    accountNavBar(navController = navController)
}



@Composable
fun accountNavBar(navController: NavController) {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Top
        ) {
            TopAppBar(
                modifier = Modifier.height(60.dp),
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 0.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "ACCOUNTS",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            fontFamily = montyFontFamily,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                },
                backgroundColor = Color(0xFF173a67),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("home") }) {
                            Image(
                            painter = painterResource(id = R.drawable.ic_back),
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    Box(
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        IconButton(
                            onClick = { /* Handle logo image click */ },
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

            ButtonRow()
            AccountCards()
        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun ButtonRow() {
    val buttonTextStyle = TextStyle(fontSize = 12.sp)
    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.size(100.dp, 40.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23324f)), // Set the background color here
            shape = RoundedCornerShape(0.dp) // Set the shape to rectangular
        ) {
            Text(
                text = "ACCOUNTS",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                style = buttonTextStyle,
                color = Color.White
            )
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .size(100.dp, 40.dp)
                .fillMaxSize(),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d)) // Set the background color here
        ) {
            Text(
                text = "TRADING",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.size(100.dp, 40.dp),
            shape = RoundedCornerShape(0.dp), // Set the shape to rectangular
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d)) // Set the background color here
        ) {
            Text(
                text = "CARDS",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.size(100.dp, 40.dp),  shape = RoundedCornerShape(0.dp), // Set the shape to rectangular

            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d)) // Set the background color here
        ) {
            Text(
                text = "LINK",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
    }
}


data class AccountData(
    val iconId: Int,
    val phoneNumber: String,
    val availableBalance: String,
    val walletAccount: String,
    val balance: String
)



val accountDataList = listOf(
    AccountData(
        iconId = R.drawable.ic_riel2,
        phoneNumber = "012 xxx xxx",
        availableBalance = "Available balance",
        walletAccount = "Wallet Account",
        balance = "950.00KHR"
    ),
    AccountData(
        iconId = R.drawable.ic_dollar,
        phoneNumber = "015 xxx xxx",
        availableBalance = "Available balance",
        walletAccount = "Wallet Account",
        balance = "15.12 USD"
    ),
    AccountData(
        iconId = R.drawable.ic_riel2,
        phoneNumber = "012 xxx xxx",
        availableBalance = "Savings Account",
        walletAccount = "Wallet Account",
        balance = "950.00KHR"
    ),
    AccountData(
        iconId = R.drawable.ic_dollar,
        phoneNumber = "0001- xxxxxxxx-27",
        availableBalance = "Savings Account",
        walletAccount = "Wallet Account",
        balance = "15.12 USD"
    ),
    AccountData(
        iconId = R.drawable.ic_dollar,
        phoneNumber = "0001- xxxxxxxx-27",
        availableBalance = "Savings Account",
        walletAccount = "Wallet Account",
        balance = "950.00KHR"
    ),

)




//@Preview(showSystemUi = true)
@Composable
fun AccountCards() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.background(Color.White)) {
            accountDataList.forEachIndexed { index, accountData ->
                Row(
                    modifier = Modifier

                        .drawWithContent {
                            drawContent()
                            drawRect(
                                color = Color.Black.copy(alpha = 0.1f),
                                topLeft = Offset(0f, size.height),
                                size = Size(size.width, 1.dp.toPx()) // Adjust the shadow height as needed
                            )
                        }
                )  {
                    Image(
                        painter = painterResource(id = accountData.iconId),
                        modifier = Modifier.offset(y = 25.dp, x = 10.dp).size(30.dp),
                        contentDescription = "Icon Image"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = Modifier.padding(top = 10.dp)) {
                        // Phone number
                        Text(
                            text = accountData.phoneNumber,
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp).offset(x = 10.dp),
                        )
                        // Available balance
                        Text(
                            text = accountData.availableBalance,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF727272),
                            modifier = Modifier.padding(top = 5.dp, bottom = 10.dp).offset(x = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f)) // Expandable space
                    Column(modifier = Modifier.padding(end = 20.dp, top = 10.dp)) {
                        // Wallet
                        Text(
                            text = accountData.walletAccount,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF727272),
                            modifier = Modifier.padding(top = 10.dp),
                        )
                        // Balance
                        val balanceColor = if (index % 2 == 0) Color(0xFFbd9e40) else Color(0xFF243548)
                        Text(
                            text = accountData.balance,
                            fontSize = 16.sp,
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = balanceColor,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.End,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_dots),
                            contentDescription = "Icon Image",
                            modifier = Modifier.size(20.dp).offset(x = -15.dp, y = 10.dp),
                        )
                    }
                }
            }
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
//                LazyColumn(){
//                    items(accountList) { account ->
//                        AccountCard(account = account)
//                    }
//                }
//
//}
//
//@Composable
//fun AccountCard(account: Account) {
//    Card(
////        elevation = 40.dp,
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