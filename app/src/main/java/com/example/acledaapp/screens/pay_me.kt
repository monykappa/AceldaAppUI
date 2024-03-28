package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Divider
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
fun PayMeScreenPreview() {
    val navController = rememberNavController()
    PayMeScreen(navController = navController)
}

@Composable
fun PayMeScreen(navController: NavController) {
    Column(modifier = Modifier.background(Color.White)){
        ComposeNavbar(navController = navController, "PAY ME")
        ComposePayMe()
        ComposeOkayButton()
    }
}

@Composable
fun ComposePayMe() {
    Column(
        modifier = Modifier
            .background(color = White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .background(color = White)
                .padding(horizontal = 16.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp),
                        text = "KHR 085 316 892 ",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
                        color = Color(28, 51, 82),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.down),
                        contentDescription = "Down",
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                            .padding(top = 15.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.setting),
                    contentDescription = "Setting",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(top = 20.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 90.dp, start = 90.dp, bottom = 70.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 10.dp, end = 15.dp),
                    text = "$",
                    fontFamily = montyFontFamily,
                    style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold),
                    color = Color(205, 205, 205),
                )
                Text(
                    modifier = Modifier,
                    text = "0.00",
                    fontFamily = montyFontFamily,
                    style = TextStyle(fontSize = 60.sp, fontWeight = FontWeight.Bold),
                    color = Color(205, 205, 205),
                )
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "edit",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(top = 20.dp)
                )
                Text(
                    text = "Remark",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold),
                    fontFamily = montyFontFamily,
                    color = Color(205, 205, 205),
                    modifier = Modifier
                        .padding(top = 30.dp)
                )
            }
            Divider(
                color =  Color(205, 205, 205),
                modifier = Modifier
                    .height(2.dp)
                    .width(500.dp)
            )
            Column(
                modifier = Modifier
                    .background(color = White)
                    .padding(horizontal = 30.dp)
                    .padding(top = 25.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "1",
                        style = TextStyle(fontSize = 30.sp),
                        fontFamily = montyFontFamily,
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "2",
                        style = TextStyle(fontSize = 30.sp),
                        fontFamily = montyFontFamily,
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "3",
                        style = TextStyle(fontSize = 30.sp),
                        fontFamily = montyFontFamily,
                        color = Color(28, 51, 82),
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "4",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "5",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "6",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "7",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "8",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "9",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = ".",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "0",
                        fontFamily = montyFontFamily,
                        style = TextStyle(fontSize = 30.sp),
                        color = Color(28, 51, 82),
                        modifier = Modifier
                            .padding(start = 40.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.delete),
                        contentDescription = "Delete",
                        modifier = Modifier
                            .size(45.dp)
                            .padding(start = 8.dp)
                    )
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .height(15.dp)
            .padding(top = 740.dp)
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

@Composable
fun ComposeOkayButton() {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier.fillMaxWidth().padding(top = 45.dp)
    ) {
        Surface(
            shape = RoundedCornerShape(50.dp),
            color = Color(0xFF15334e),
            modifier = Modifier
                .padding(bottom = 20.dp, end = 20.dp)
                .align(Alignment.End)
                .clickable{}

        ) {}
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth().height(70.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23324f)),
        ) {
            Text(
                text = "OK",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                color = Color(0XFFcea530),
                fontFamily = montyFontFamily,
            )
        }
    }
}