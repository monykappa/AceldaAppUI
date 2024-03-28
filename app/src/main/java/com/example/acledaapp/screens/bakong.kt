package com.example.acledaapp.screens

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily

@Preview(showSystemUi = true)
@Composable
fun BakongScreenPreview(){
    val navController = rememberNavController()
    BakongScreen(navController = navController)
}
@Composable
fun BakongScreen(navController: NavController){
    Column(){
        ComposeNavbar(navController = navController, "MY KHQR")
        ComposeBakong()
    }
}
@Composable
fun ComposeBakong(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(7, 36, 66)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                .width(285.dp)
                .height(435.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(
                        color = Color(224, 35, 45),
                        shape = RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 16.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_khqr),
                    contentDescription = "KHQR",
                    modifier = Modifier
                        .width(80.dp)
                        .height(50.dp)
                        .padding(8.dp),
                )
            }
            Column(
                modifier = Modifier.padding(start = 36.dp, top = 15.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Devit Heng", style = TextStyle(fontSize = 20.sp), fontFamily = montyFontFamily)
                Text(text = "0 USD", style = TextStyle(fontSize = 20.sp,fontFamily = montyFontFamily))
            }
            DotDivider(modifier = Modifier.fillMaxWidth())
            Column(
                modifier = Modifier.padding(start = 16.dp, top = 35.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter=painterResource(id=R.drawable.img_1),contentDescription = "QRCODE",modifier = Modifier
                    .width(250.dp)
                    .height(200.dp))
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 25.dp, bottom = 15.dp)
                .background(color = Color(26, 59, 90), shape = RoundedCornerShape(16.dp))
                .width(285.dp)
                .height(55.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Wallet Account KHR | 085 316 892",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = montyFontFamily,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_down),
                    contentDescription = "ICON",
                )
            }
        }
        Row(
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_save),
                    contentDescription = "SAVE",
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .clickable {  }
                        .size(50.dp)
                        .background(color = Color(28, 88, 138), shape = RoundedCornerShape(100.dp))
                        .padding(15.dp),
                )
                Text(text = "SAVE",style = TextStyle( fontSize = 14.sp), fontFamily = montyFontFamily,color = Color.White,modifier = Modifier.padding(top = 8.dp))
            }
            Column( horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.padding(horizontal = 26.dp).offset(x = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_set_amount),
                    contentDescription = "SetAmount",
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .clickable {  }
                        .size(50.dp)
                        .background(color = Color(28, 88, 138), shape = RoundedCornerShape(100.dp))
                        .padding(15.dp),
                )
                Text(text = "SET AMOUNT",style = TextStyle( fontSize = 14.sp) ,fontFamily = montyFontFamily,color = Color.White,modifier = Modifier.padding(top = 8.dp))
            }
            Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.offset(x = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_share_qr),
                    contentDescription = "SHARE LINK",
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .clickable {  }
                        .size(50.dp)
                        .background(color = Color(28, 88, 138), shape = RoundedCornerShape(100.dp))
                        .padding(15.dp),
                )
                Text(text = "SHARE LINK",style = TextStyle( fontSize = 14.sp), fontFamily = montyFontFamily,color = Color.White,modifier = Modifier.padding(top = 8.dp))
            }
        }
    }
}
@Composable
fun DotDivider(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .height(1.dp)
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val dotRadius = 2.dp.toPx()
            val dotSpacing = 4.dp.toPx()
            val dotCount = size.width / (dotRadius * 2 + dotSpacing)
            val startX = 0f
            val startY = size.height / 2

            drawIntoCanvas { canvas ->
                val paint = Paint().apply {
                    isAntiAlias = true
                    color = Color.DarkGray.toArgb()
                }
                repeat(dotCount.toInt()) { index ->
                    val centerX = startX + dotRadius + (2 * dotRadius + dotSpacing) * index
                    canvas.nativeCanvas.drawCircle(centerX, startY, dotRadius, paint)
                }
            }
        }
    }
}