package com.example.acledaapp.screens


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.navigation.NavController

import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.max
import coil.annotation.ExperimentalCoilApi
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.ui.text.font.FontFamily
import com.example.acledaapp.R
import com.example.acledaapp.screens.mainScreen
import com.example.acledaapp.ui.theme.AcledaAppTheme
import com.example.acledaapp.ui.theme.Purple40


val BlueBackground = Color(0xFF2c446a)




fun Modifier.bottomBorderColor(color: Color, borderWidth: Dp) = drawBehind {
    drawLine(
        color = color,
        start = Offset(0f, size.height),
        end = Offset(size.width, size.height),
        strokeWidth = borderWidth.toPx()
    )
}

val quicksandFontFamily = FontFamily(
    Font(R.font.font_quicksand),
    // Add more font styles if needed (e.g., bold, italic)
    // Font(R.font.poppins_bold, FontWeight.Bold),
    // Font(R.font.poppins_italic, FontStyle.Italic)
)





@Preview(showBackground = true)
@Composable
fun mainScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Surface(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth(),
            color = Color(0xFF25395A)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(onClick = { /* Handle menu icon click */ }) {
                    Image(
                        painter = painterResource(id = R.drawable.menu_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
//                            .border(
//                                width = 1.dp,
//                                color = Color.Red,
//                            )
                    )
                }


                Image(
                    painter = painterResource(id = R.drawable.aclogo),
                    contentDescription = null,
                    modifier = Modifier.size(150.dp)
//                        .border(
//                            width = 1.dp,
//                            color = Color.Red,
//                        )
                )



                Spacer(modifier = Modifier.weight(1f))

                // Right side: Notification icon
                IconButton(onClick = { /* Handle notification icon click */ }) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_notification),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(modifier = Modifier.width(0.dp))

                // Right side: Dollar icon
                IconButton(onClick = { /* Handle dollar icon click */ }) {
                    Image(
                        painter = painterResource(id = R.drawable.unnamed),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)

                    )
                }
            }
        }




        // Balance section
        Surface(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .background(color = Color(0xFF21324E))
                    .bottomBorderColor(color = Color(0xFF476CB0), borderWidth = 1.dp)
            )  {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp),
                ) {
                    IconButton(onClick = { /* Payments button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.payment),
                                contentDescription = "Payments",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Payments",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 20.dp)
                ) {
                    IconButton(onClick = { /* Mobile Top-up button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mobile),
                                contentDescription = "Mobile Top-up",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Mobile Top-up",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp)
                ) {
                    IconButton(onClick = { /* Transfers button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.transfer),
                                contentDescription = "Transfers",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Transfers",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
            }
        }


        // Balance section
        Surface(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .background(color = Color(0xFF21324E))
                    .bottomBorderColor(color = Color(0xFF476CB0), borderWidth = 1.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp),
                ) {
                    IconButton(onClick = { /* Payments button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pay_me),
                                contentDescription = "Pay me",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Pay-Me",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 20.dp)
                ) {
                    IconButton(onClick = { /* Mobile Top-up button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.scan_qr),
                                contentDescription = "Scan QR",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Scan QR",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp)
                ) {
                    IconButton(onClick = { /* Transfers button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.account),
                                contentDescription = "Accounts",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Accounts",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
            }
        }

        // Balance section
        Surface(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .background(Color(0xFF21324E))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp),
                ) {
                    IconButton(onClick = { /* Payments button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.deposit),
                                contentDescription = "Deposits",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Deposits",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 20.dp)
                ) {
                    IconButton(onClick = { /* Mobile Top-up button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.loan),
                                contentDescription = "Loans",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Loans",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f).padding(20.dp)
                ) {
                    IconButton(onClick = { /* Transfers button click */ }) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.quick_cash),
                                contentDescription = "Quick Cash",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                "Quick Cash",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize= 14.sp,
                                color = Color.White,
                                fontFamily = quicksandFontFamily,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
            }
        }

    }
}



