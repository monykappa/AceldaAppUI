package com.example.acledaapp.screens

import android.annotation.SuppressLint
import android.util.Log.v
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
fun MobileScreenPreview() {
    val navController = rememberNavController()
    MobileScreen(navController = navController)
}

@Composable
fun MobileScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, navName = "MOBILE TOP-UP" )
        ComposeTopUp()
    }

}

@Composable
fun ComposeTopUp() {
    Surface(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = White),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(55.dp)
                        .fillMaxWidth(0.5f)
                        .background(color = Color(0xFF1a3351)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "PINLESS",
                        color = Color.White,
                        fontFamily = montyFontFamily,

                        )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(55.dp)
                        .fillMaxWidth(0.5f)
                        .background(color = Color(0xFF122134)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "PIN VOUCHER",
                        color = Color(0xFFcba131),
                        fontFamily = montyFontFamily,

                        )
                }
            }

            Column(
                modifier = Modifier
                    .width(450.dp)
                    .height(220.dp)
                    .background(color = Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_pinless),
                    contentDescription = "PINLESS",
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    text="PINLESS",
                    style = TextStyle(fontSize = 18.sp,
                        fontWeight = FontWeight.Bold),
                    color = Color(28, 51, 82),
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            Column(
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .height(55.dp)
                        .background(color = Color.White)
                        .border(width =1 .dp, color = Color.Gray, shape = RoundedCornerShape(10.dp))
                ) {
                    Row {
                        Text(text = "Select Account",
                            modifier = Modifier.padding(start = 16.dp, top = 5.dp),
                            style = TextStyle(fontSize = 16.sp,
                                fontWeight = FontWeight.Bold),
                            color = Color(0xFF818286),)

                        Row {
                            Column {
                                Text(text = "012 345 678",
                                    modifier = Modifier.padding(start = 80.dp, top = 5.dp),
                                    style = TextStyle(fontSize = 17.sp,

                                        fontWeight = FontWeight.Bold),
                                    fontFamily = montyFontFamily,
                                    color = Color(0xFF818287),)

                                Text(text = "123,368.000 KHR",
                                    modifier = Modifier.padding(start = 70.dp, top = 5.dp),
                                    fontFamily = montyFontFamily,
                                    style = TextStyle(fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold),
                                    color = Color(0xFFcba232),)
                            }
                            Image(
                                painter=painterResource(id=R.drawable.ic_mobile_drop_down),contentDescription = "QRCODE",modifier = Modifier
                                    .size(40.dp)
                                    .padding(top = 10.dp))
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(color = Color.White)
                        .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(10.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 15.dp)
                    ) {
                        Row {

                            Image(
                                painter=painterResource(id=R.drawable.ic_wifi),contentDescription = "WIFI",modifier = Modifier
                                    .size(30.dp)
                                    .offset(x = 5.dp, y = (-5).dp)
                            )
                            Text(text = "To mobile number",
                                modifier = Modifier.padding(start = 14.dp),
                                fontFamily = montyFontFamily,
                                style = TextStyle(fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold),
                                color = Color.Gray,)
                        }
                        Image(
                            painter=painterResource(id=R.drawable.ic_select_mobile),contentDescription = "QRCODE",modifier = Modifier
                                .size(35.dp)
                                .offset(x = 120.dp, y = (-5).dp)

                        )
                    }
                }
                DotDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 25.dp, bottom = 25.dp)
                )

                Row {
                    Image(
                        painter=painterResource(id=R.drawable.ic_heart),contentDescription = "Heart",modifier = Modifier
                            .size(30.dp),
                    )
                    Text(text = "Add to Favorites",
                        style = TextStyle(fontSize = 16.sp),
                        fontWeight = FontWeight.Bold,
                        fontFamily = montyFontFamily,
                        color = Color(0xFF5d5d5d),
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    var isChecked by remember { mutableStateOf(false) }
                    Switch(
                        modifier = Modifier
                            .padding(start = 120.dp),
                        checked = isChecked,
                        onCheckedChange = { isChecked = it }
                    )
                }
            }
            Box(
                modifier = Modifier
                    .padding(top = 200.dp)
                    .weight(1f)
                    .height(55.dp)
                    .fillMaxWidth(1f)
                    .background(color = Color(28, 51, 82)),

                contentAlignment = Alignment.Center
            ) {
                Text(
                    style = TextStyle(fontSize = 30.sp),
                    text = "OK",
                    color = Color(199, 161, 45),
                )
            }
        }
    }
}


