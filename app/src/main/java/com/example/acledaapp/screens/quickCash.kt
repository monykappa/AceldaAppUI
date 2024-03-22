package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily


@Preview(showSystemUi = true)
@Composable
fun QuickCashScreenPreview(){
    val navController = rememberNavController()
    ComposeQuickCash(navController = navController)
}

@Composable
fun QuickCashScreen(navController: NavController) {
    ComposeQuickCash(navController = navController)
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ComposeQuickCash(navController: NavController) {
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
                                text = "QUICK CASH",
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
            Column (modifier = Modifier.background(Color(0xFFececec))){
                ComposeQuickCashImage()
                ComposeInputQuickCash()
                Spacer(modifier = Modifier.weight(1f))
                ComposeGenerateButton()
            }
        }
    }
}

@Composable
fun ComposeQuickCashImage() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 0.2.dp,
                color = Color.Gray,
            )
            .shadow(
                ambientColor = Color(0xFFb9b9b9),
                elevation = 20.dp,

                )
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.background(Color.White)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_quick_cash_blue),
                    contentDescription = "Centered Image",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(top = 15.dp)
                )
                Text(
                    text = "QUICK CASH",
                    style = TextStyle(
                        color = Color(0Xff1d406b),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    fontFamily = montyFontFamily,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 20.dp, top = 10.dp)
                )
            }
        }
    }
}

@Composable
fun ComposeInputQuickCash() {
    Surface(
        color = Color(0xFFececec),
        modifier = Modifier
            .fillMaxWidth()


    ) {

        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().background(Color(0xFFececec)).padding(start = 10.dp, end =10.dp)
            )
            {
                Spacer(modifier = Modifier.height(56.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .background(Color.White)
                        .border(0.5.dp, Gray),


                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "012 123 123",
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFa3a3a3),
                        fontFamily = montyFontFamily,
                        fontSize = 15.sp
                    )

                    Text(
                        text = "17.28 USD",
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 8.dp),
                        fontWeight = FontWeight.Bold,
                        fontFamily = montyFontFamily,
                        color = Color(0xFF173a67),
                        fontSize = 15.sp,
                        textAlign = TextAlign.End
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_wallet),
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(horizontal = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .height(40.dp)
                        .border(0.5.dp, Gray),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "Amount",
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF6b6b6b),
                        fontFamily = montyFontFamily,
                        fontSize = 14.sp
                    )

                    Text(
                        text = "USD",
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFcea530),
                        fontFamily = montyFontFamily,
                        fontSize = 15.sp,
                        textAlign = TextAlign.End
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_down),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(horizontal = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_remark),
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp)
                            .padding(start = 8.dp)
                    )
                    Text(
                        text = "Remark",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF173a67),
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Switch(
                        checked = false,
                        onCheckedChange = { },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            uncheckedThumbColor = Color(0xFF173a67),
                        ),
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeGenerateButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(0.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23324f)),
    ) {
        Text(
            text = "GENERATE",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            color = Color(0XFFcea530),
            fontFamily = montyFontFamily,
        )
    }
}
