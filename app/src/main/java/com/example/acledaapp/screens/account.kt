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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
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

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    ButtonRow()
                    AccountCards()
                }
                BottomButton()
            }
        }
    }
}


@Composable
fun BottomButton() {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier.fillMaxWidth()
    ) {
        Surface(
            shape = RoundedCornerShape(50.dp),
            color = Color(0xFF15334e),
            modifier = Modifier
                .padding(bottom = 20.dp, end = 20.dp)
                .align(Alignment.End)
                .clickable{}

           ) {
            Box(
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_add),
                    modifier = Modifier.size(20.dp),
                    contentDescription = "Icon"
                )
            }
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23324f)),
        ) {
            Text(
                text = "TRANSACTION HISTORY",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                color = Color(0XFFcea530),
                fontFamily = montyFontFamily,
            )
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
                        .bottomBorderColor(color = Color.Gray, borderWidth = 0.5.dp)
                        .clickable {}


                )  {
                    Image(
                        painter = painterResource(id = accountData.iconId),
                        modifier = Modifier
                            .offset(y = 25.dp, x = 10.dp)
                            .size(30.dp),
                        contentDescription = "Icon Image"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = Modifier.padding(top = 10.dp)) {
                        // Phone number
                        Text(
                            text = accountData.phoneNumber,
                            fontSize = 14.sp,
                            color = Color(0xFF101b2d),
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 15.dp)
                                .offset(x = 10.dp),
                        )
                        // Available balance
                        Text(
                            text = accountData.availableBalance,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = truenorgFontFamily,
                            color = Color(0xFF727272),
                            modifier = Modifier
                                .padding(top = 5.dp, bottom = 15.dp)
                                .offset(x = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f)) // Expandable space
                    Column(modifier = Modifier.padding(end = 20.dp, top = 10.dp)) {
                        // Wallet
                        Text(
                            text = accountData.walletAccount,
                            textAlign = TextAlign.End,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = truenorgFontFamily,
                            color = Color(0xFF727272),
                            modifier = Modifier
                                .padding(top = 15.dp)
                                .width(130.dp),
                        )
                        // Balance
                        val balanceColor = if (index % 2 == 0) Color(0xFFbd9e40) else Color(0xFF243548)
                        Text(
                            text = accountData.balance,
                            textAlign = TextAlign.End,
                            fontSize = 14.sp,
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFcea530),
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .width(130.dp)
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.End,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_dots),
                            contentDescription = "Icon Image",
                            modifier = Modifier
                                .size(20.dp)
                                .offset(x = -15.dp, y = 10.dp),
                        )
                    }
                }
            }
        }
    }
}
