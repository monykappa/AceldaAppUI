package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
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
        ComposeScanQr()

    }
}

data class ImageData(val resourceId: Int)

val images = listOf(
    ImageData(R.drawable.acleda_logo),
    ImageData(R.drawable.acleda_logo),
    ImageData(R.drawable.acleda_logo),
    ImageData(R.drawable.acleda_logo),
    ImageData(R.drawable.acleda_logo),
    ImageData(R.drawable.acleda_logo),
)
@Composable
fun ComposeScanQr() {
    Surface(
        color = Color(0xFF2a3748),
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .offset(y = 30.dp), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "Align frame with QR code",
                    color = Color.White,
                    fontFamily = montyFontFamily,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)

                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .width(300.dp)
                        .height(250.dp)

                ) {
                    Image(
                        modifier = Modifier
                            .padding(5.dp),
//                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.my_qr_code),
                        contentDescription = null,
                    )
                }
                Text(
                    "Accepted",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(top = 30.dp, bottom = 10.dp)
                )
                Row {
                    images.forEach { imageData ->
                        Box(
                            modifier = Modifier

                                .padding(start = 5.dp)
                        ) {
                            Image(
                                painter = painterResource(id = imageData.resourceId),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                                    .clip(RoundedCornerShape(20.dp))
                                    .clickable { }
                            )
                        }
                    }
                }
                    Row(modifier = Modifier.padding(top = 60.dp)) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(50.dp))
                                    .clickable { }
                                    .background(Color(0xFF536780)),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_flashlight),
                                    contentDescription = null,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Text(
                                "Flashlight",
                                fontFamily = montyFontFamily,
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(top = 15.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(40.dp))

                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(50.dp))
                                    .clickable { }
                                    .background(Color(0xFF536780)),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_select_qr),
                                    contentDescription = null,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Text(
                                "Select QR",
                                fontFamily = montyFontFamily,
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(top = 15.dp)
                            )
                        }
                    }
                }
            }
        }

    }

