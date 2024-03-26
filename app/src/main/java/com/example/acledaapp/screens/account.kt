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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.truenorgFontFamily

data class AccountData(
    val imageResourceId: Int,
    val phoneNumber: String,
    val availableBalance: String,
    val walletAccount: String,
    val balance: String
)

val accountDataList = mutableListOf(
    AccountData(
        R.drawable.ic_riel2,
        "012 345 678",
        "Available balance",
        "Wallet Account",
        "950.00KHR"
    ),
    AccountData(
        R.drawable.ic_dollar,
        "015 123 123",
        "Available balance",
        "Wallet Account",
        "15.12 USD"
    ),
    AccountData(
        R.drawable.ic_riel2,
        "012 321 321",
        "Savings Account",
        "Wallet Account",
        "950.00KHR"
    ),
    AccountData(
        R.drawable.ic_dollar,
        "0001- 12312312-27",
        "Savings Account",
        "Wallet Account",
        "15.12 USD"
    ),
    AccountData(
        R.drawable.ic_dollar,
        "0001- 12312312-27",
        "Savings Account",
        "Wallet Account",
        "950.00KHR"
    )
)

@Preview(showSystemUi = true)
@Composable
fun AccountScreenPreview() {
    val navController = rememberNavController()
    AccountScreen(navController = navController)
}

@Composable
fun AccountScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            ComposeNavbar(navController = navController, "ACCOUNT")
            ComposeButtonRow()
            ComposeAccountCards(modifier = Modifier.weight(1f))
        }
        ComposeBottomButton()
    }
}

@Composable
fun ComposeBottomButton() {
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
            onClick = { },
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

@Composable
fun ComposeButtonRow() {
    val buttonTextStyle = TextStyle(fontSize = 12.sp)
    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Button(
            onClick = {},
            modifier = Modifier.size(100.dp, 40.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23324f)),
            shape = RoundedCornerShape(0.dp)
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
            onClick = { },
            modifier = Modifier
                .size(100.dp, 40.dp)
                .fillMaxSize(),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d))
        ) {
            Text(
                text = "TRADING",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
        Button(
            onClick = { },
            modifier = Modifier.size(100.dp, 40.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d))
        ) {
            Text(
                text = "CARDS",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
        Button(
            onClick = {  },
            modifier = Modifier.size(100.dp, 40.dp),  shape = RoundedCornerShape(0.dp),

            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF101b2d))
        ) {
            Text(
                text = "LINK",
                style = buttonTextStyle,
                color = Color(0xFFcca441)
            )
        }
    }
}

@Composable
fun ComposeAccountCards(modifier: Modifier) {
    Surface() {
        Column(modifier = Modifier.background(Color.White)) {
            accountDataList.forEachIndexed { index, accountData ->
                Row(

                    modifier = Modifier

                        .shadow(
                            ambientColor = Color(0xFFb9b9b9),
                            elevation = (0.5.dp)

                        )
                        .clickable {}


                )  {
                    Image(
                        painter = painterResource(id = accountData.imageResourceId),
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
                            fontSize = 15.sp,
                            color = Color(0xFF1d3153),
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 15.dp)
                                .offset(x = 15.dp),
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
                                .offset(x = 15.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
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
                            color = Color(0xFFc9a74a),
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
                                .offset(x = (-15).dp, y = 10.dp),
                        )
                    }
                }
            }
        }
    }
}