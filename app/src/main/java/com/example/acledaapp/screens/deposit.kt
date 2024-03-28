package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.truenorgFontFamily
import com.example.acledaapp.models.truenorgbdFontFamily


data class DepositData(
    val iconId: Int,
    val title: String,
    val description: String,
)

val depositDataList = listOf(
    DepositData(
        iconId = R.drawable.ic_stock_up,
        title = "Hi-Growth term deposit",
        description = "Maturity date interest settlement",
    ),
    DepositData(
        iconId = R.drawable.ic_income,
        title = "Hi-Income term deposit",
        description = "Monthly interest settlement",

        ),
    DepositData(
        iconId = R.drawable.ic_clock,
        title = "Long Term deposit",
        description = "Quarterly interest settlement",
    ),
)

@Preview(showSystemUi = true)
@Composable
fun DepositScreenPreview(){
    val navController = rememberNavController()
    DepositScreen(navController = navController)
}

@Composable
fun DepositScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, navName = "DEPOSITS" )
        ComposeDepositsCards()
    }

}


@Composable
fun ComposeDepositsCards() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.background(Color.White)) {
            depositDataList.forEachIndexed { index, depositData ->
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .shadow(
                            ambientColor = Color(0xFFb9b9b9),
                            elevation = (0.5.dp)

                        )
                        .clickable { /* Handle click action */ }
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = depositData.iconId),
                        contentDescription = "Icon Image",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 8.dp),
                    )
                    Column {
                        // Title
                        Text(
                            text = depositData.title,
                            fontSize = 14.sp,
                            color = Color(0xFF101b2d),
                            fontFamily = truenorgbdFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 7.dp)
                                .offset(x = 10.dp),
                        )
                        // Description
                        Text(
                            text = depositData.description,
                            fontSize = 14.sp,
                            fontFamily = truenorgFontFamily,
                            color = Color(0xFF727272),
                            modifier = Modifier
                                .padding(bottom = 5.dp)
                                .offset(x = 10.dp)
                        )
                    }

                }
            }
        }
    }
}
