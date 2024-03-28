package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
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
fun ScanQrScreenPreview(){
    val navController = rememberNavController()
    ScanQrScreen(navController = navController)
}
@Composable
fun ScanQrScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, "SCAN QR")
        ComposeQRScanCamera()
    }
}
@Composable
fun ComposeQRScanCamera() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(43, 54, 72)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            modifier = Modifier
                .width(350.dp)
                .height(700.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = "Align frame with QR code",
                style = TextStyle(fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                color = Color.White,
                fontFamily = montyFontFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Image(
                painter=painterResource(id=R.drawable.img_6),contentDescription = "QRCODE",modifier = Modifier
                    .width(450.dp)
                    .height(350.dp))
            Text(
                text = "Accepted",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                ),
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Image(painter=painterResource(id=R.drawable.img_7),contentDescription = "QRCODE",modifier = Modifier
                .width(450.dp)
                .height(100.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = 100.dp)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_flashlight),
                        contentDescription = "SAVE",
                        modifier = Modifier
                            .size(60.dp, 60.dp)
                            .background(
                                color = Color(81, 103, 128),
                                shape = RoundedCornerShape(100.dp)
                            )
                            .padding(15.dp),
                    )
                    Text(text = "Flashlight",style = TextStyle( fontSize = 14.sp),color = Color.White,fontFamily = montyFontFamily,modifier = Modifier.padding(top = 8.dp))
                }
                Column( horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.padding(horizontal = 16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_select_qr),
                        contentDescription = "SetAmount",
                        modifier = Modifier
                            .size(60.dp, 60.dp)
                            .background(
                                color = Color(81, 103, 128),
                                shape = RoundedCornerShape(100.dp)
                            )
                            .padding(15.dp),
                    )
                    Text(text = "Select QR",style = TextStyle( fontSize = 14.sp),fontFamily = montyFontFamily,color = Color.White,modifier = Modifier.padding(top = 8.dp))
                }
            }
        }
    }
}
