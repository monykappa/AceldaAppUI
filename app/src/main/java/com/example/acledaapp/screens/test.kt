package com.example.acledaapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.MenuItems
import com.example.acledaapp.models.favoriteItems
import com.example.acledaapp.models.menuRow1
import com.example.acledaapp.models.menuRow2
import com.example.acledaapp.models.menuRow3
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.truenorgFontFamily

//@Preview(showSystemUi = true)
//@Composable
//fun MenuSectionPreview(){
//    Column(modifier = Modifier.fillMaxSize()) {
//        ComposeMenuSection(menuRow1, height = 118.dp)
//        ComposeMenuSection(menuRow2, height = 120.dp)
//        ComposeMenuSection(menuRow3, height = 122.dp)
//    }
//}


//@Composable
//fun ComposeMenuSection(
//    menuItems: List<MenuItems>,
//    height: Dp,
//) {
//    Surface(
//        modifier = Modifier
//            .fillMaxWidth(),
//        color = Color(0xFF21324E)
//    ) {
//        Row(
//            modifier = Modifier
//                .background(color = Color(0xFF21324E))
//                .fillMaxWidth()
//                .padding(0.dp)
//                .border(1.dp, Color.White),
//        ) {
//            menuItems.forEach { item ->
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier
//                        .weight(1f) // Equal weight for each column
//                        .fillMaxWidth()
//
//                ) {
//                    IconButton(onClick = {
//                        // Handle button click
//                    }) {
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                        ) {
//                            Image(
//                                painter = painterResource(id = item.imageResourceId),
//                                contentDescription = item.text,
//                                modifier = Modifier.size(40.dp)
//                            )
//                            Text(
//                                item.text,
//                                textAlign = TextAlign.Center,
//                                fontWeight = FontWeight.Normal,
//                                fontSize = 14.sp,
//                                color = Color.White,
//                                modifier = Modifier.padding(top = 8.dp)
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}


