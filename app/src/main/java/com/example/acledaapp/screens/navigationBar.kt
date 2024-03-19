package com.example.acledaapp.screens

import androidx.compose.material.BottomAppBar
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import com.example.acledaapp.R
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.acledaapp.models.FavoriteItem
import com.example.acledaapp.models.MenuItems
import com.example.acledaapp.models.drawerItems
import com.example.acledaapp.models.favoriteItems
import com.example.acledaapp.models.menuRow1
import com.example.acledaapp.models.menuRow2
import com.example.acledaapp.models.menuRow3
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.poppinsFontFamily
import com.example.acledaapp.models.truenorgFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.*


//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
////@Preview(showSystemUi = true)
//@Composable
//fun navigationBar(navController: NavController) {
//    Surface {
//        Scaffold(
//            topBar = {
//                TopAppBar(
//                    modifier = Modifier.height(80.dp),
//                    title = {
//                        Box(
//                            modifier = Modifier.fillMaxWidth().padding(end = 25.dp),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text(
//                                text = "A C C O U N T S",
//                                textAlign = TextAlign.Center,
//                                fontFamily = montyFontFamily,
//                                fontSize = 16.sp,
//                                color = Color.White,
//                                modifier = Modifier
//                            )
//                        }
//                    },
//                    backgroundColor = Color(0xFF173a67),
//                    navigationIcon = {
//                        IconButton(onClick = { navController.navigate("home") }) {
//                            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back", modifier = Modifier.size(20.dp))
//                        }
//                    },
//                    actions = {
//                        Box(
//                            modifier = Modifier.padding(end = 16.dp)
//                        ) {
//                            IconButton(
//                                onClick = { /* Handle logo image click */ },
//                                modifier = Modifier.size(40.dp),
//                            ) {
//                                Image(
//                                    painter = painterResource(id = R.drawable.ac_logo),
//                                    contentDescription = "Account"
//                                )
//                            }
//                        }
//                    },
//                    elevation = AppBarDefaults.TopAppBarElevation
//                )
//
//            }
//        ) {
//            // Content of the scaffold
//        }
//    }
//}

