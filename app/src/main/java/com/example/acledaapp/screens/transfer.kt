package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily

@Preview(showSystemUi = true)
@Composable
fun TransferScreenPreview() {
    val navController = rememberNavController()
    TransferScreen(navController = navController)
}

@Composable
fun TransferScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, "TRANSFER")
        Transfer()
    }

}


@Composable
fun Transfer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(85.dp)
                    .fillMaxWidth(1f)
                    .border(width = 2.dp, color = Color.Gray),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.img_15),
                    contentDescription = "OWNACCOUNT",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(top = 5.dp)
                )

                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = "OWN ACCOUNTS",
                        style = TextStyle(fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )

                    Text(
                        text = "Transfer between your ACLEDA Account",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Gray,
                    )

                }


            }

        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(85.dp)
                    .fillMaxWidth(1f)
                    .border(width = 2.dp, color = Color.Gray),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.img_16), // Assuming R.drawable.img_15 exists
                    contentDescription = "ACLEDA",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(top = 5.dp)
                )

                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = "ACLEDA ACCOUNT/PHONE NUMBER",
                        style = TextStyle(fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )

                    Text(
                        text = "Transfer to Bank/Wallet Account or Phone Number",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Gray,
                    )

                }


            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(85.dp)
                    .fillMaxWidth(1f)
                    .border(width = 2.dp, color = Color.Gray),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.img_17), // Assuming R.drawable.img_15 exists
                    contentDescription = "Other",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(top = 5.dp)
                )


                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = "OTHER LOCAL BANKS OR MFIs",
                        style = TextStyle(fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )

                    Text(
                        text = "Transfer to other Local Bank Accounts, Wallets or Phone",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Gray,
                    )

                }


            }

        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(85.dp)
                    .fillMaxWidth(1f)
                    .border(width = 2.dp, color = Color.Gray),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.img_18), // Assuming R.drawable.img_15 exists
                    contentDescription = "INTERNATIONAL",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(top = 5.dp)
                )

                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = "INTERNATIONAL TRANSFERS",
                        style = TextStyle(fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )

                    Text(
                        text = "Overseas fund transfer to bank account/agent/card",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Gray,
                    )

                }


            }

        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .height(85.dp)
                    .fillMaxWidth(1f)
                    .border(width = 2.dp, color = Color.Gray),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.img_20), // Assuming R.drawable.img_15 exists
                    contentDescription = "INTERNATIONAL",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(top = 5.dp)
                )

                Column {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = "INTERNATIONAL CARD",
                        style = TextStyle(fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )

                    Text(
                        text = "Transfer to Visa, Mastercard",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Gray,
                    )

                }


            }

        }
    }
}

