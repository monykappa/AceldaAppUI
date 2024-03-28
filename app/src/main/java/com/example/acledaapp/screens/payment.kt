package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.acledaapp.models.paymentDataList
import com.example.acledaapp.models.truenorgbdFontFamily

@Preview(showSystemUi = true)
@Composable
fun PaymentScreenPreview() {
    val navController = rememberNavController()
    PaymentScreen(navController = navController)
}

@Composable
fun PaymentScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, "PAYMENT")
        LazyColumn(){
            item{
                ComposePaymentCards()
            }
        }

    }
}

@Composable
fun ComposePaymentCards() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.background(Color.White)) {
            paymentDataList.forEachIndexed { index, PaymentData ->
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .shadow(
                            ambientColor = Color(0xFFb9b9b9),
                            elevation = (0.5.dp)

                        )
                        .clickable { /* Handle click action */ }
                        .padding(horizontal = 16.dp, vertical = 8.dp,)
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = PaymentData.iconId),
                        contentDescription = "Icon Image",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 8.dp),
                    )
                    Column {
                        // Title
                        Text(
                            text = PaymentData.title,
                            fontSize = 14.sp,
                            color = Color(0xFF101b2d),
                            fontFamily = truenorgbdFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 10.dp)

                        )
                    }
                }
            }
        }
    }
}

