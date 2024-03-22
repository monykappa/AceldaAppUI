package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.truenorgFontFamily


@Preview(showSystemUi = true)
@Composable
fun PreviewNotification(){
    val navController = rememberNavController()
    notificationScreen(navController = navController)
}
@Composable
fun notificationScreen(navController: NavController){
    ComposeNotification(navController = navController)
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ComposeNotification(navController: NavController) {
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
                                text = "NOTIFICATION",
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
                        IconButton(onClick = { navController.popBackStack() }) {
                            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back", modifier = Modifier.size(20.dp))
                        }
                    },
                    actions = {
                        Box(
                            modifier = Modifier.padding(end = 16.dp)
                        ) {
                            IconButton(
                                onClick = { },
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
            ComposeDisplayNotifications()
        }
    }
}

@Composable
fun ComposeDisplayNotifications() {
    Surface(color = Color(0xFFe5e5e5), modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(15) { index ->
                NotificationItem(
                    iconId = R.drawable.scan_blue,
                    title = "KHQR Payment ACELEDA mobile",
                    time = "MAR 18, 2024 04:45 PM",
                    message = "You have paid USD 1.50 to Oudom Pov, ABA Bank, by KHQR, on 18-Mar-2024 04:45PM, Ref:"
                )
            }
        }
    }
}

@Composable
fun NotificationItem(iconId: Int, title: String, time: String, message: String) {
    Box(
        modifier = Modifier
            .padding(top = 10.dp, start = 10.dp, end = 10.dp, bottom = 0.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .clickable { }
    ) {
        Column(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 0.dp)
        ) {
            Box {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = iconId),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                    Column(modifier = Modifier.padding(start = 10.dp)) {
                        Text(
                            title,
                            fontFamily = truenorgFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF223754),
                            fontSize = 16.sp,
                        )
                        Text(
                            time,
                            fontSize = 12.sp,
                            fontFamily = truenorgFontFamily,
                            color = Color(0xFF223754)
                        )
                    }
                }
            }
            Text(
                message,
                fontFamily = truenorgFontFamily,
                fontSize = 13.sp,
                color = Color(0xFF223754),
                modifier = Modifier.padding(start = 10.dp, end = 30.dp, top = 10.dp)
            )
            Box(
                modifier = Modifier.fillMaxWidth().offset(y = (-10).dp).padding(end = 2.dp),
                contentAlignment = Alignment.CenterEnd,
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.dots_blue),
                        modifier = Modifier
                            .size(15.dp)
                            .align(Alignment.End),
                        contentDescription = null
                    )

                    Text(
                        "more",
                        fontFamily = truenorgFontFamily,
                        color = Color(0xFF223754),
                    )
                }
            }
        }
    }
}