package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.acledaapp.R
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.models.FavoriteItem
import com.example.acledaapp.models.MenuItems
import com.example.acledaapp.models.drawerItems
import com.example.acledaapp.models.favoriteItems
import com.example.acledaapp.models.menuRow1
import com.example.acledaapp.models.menuRow2
import com.example.acledaapp.models.menuRow3
import com.example.acledaapp.models.montyFontFamily
import com.example.acledaapp.models.truenorgFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


fun Modifier.bottomBorderColor(color: Color, borderWidth: Dp) = drawBehind {
    drawLine(
        color = color,
        start = Offset(0f, size.height),
        end = Offset(size.width, size.height),
        strokeWidth = borderWidth.toPx()
    )
}

fun Modifier.rightBorderColor(color: Color, borderWidth: Dp) = drawBehind {
    drawLine(
        color = color,
        start = Offset(size.width, 0f),
        end = Offset(size.width, size.height),
        strokeWidth = borderWidth.toPx()
    )
}


@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview(){
    val navController = rememberNavController()
    MainScreen(navController = navController)
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerContent(navController = navController)
        },
        drawerBackgroundColor = Color.White,
        drawerContentColor = Color.Black,
        topBar = {
            ComposeTopNavBar(navController = navController, scaffoldState = scaffoldState, scope = scope)
        },
        content = {
            Column(modifier = Modifier.fillMaxSize()) {
                ComposeMenuSection(menuRow1, height = 118.dp, navController = navController)
                ComposeMenuSection(menuRow2, height = 120.dp, navController = navController)
                ComposeMenuSection(menuRow3, height = 122.dp, navController = navController)

                ComposeFavoriteBoxes(favoriteItems)

                ComposeBottomBackground()
            }
        }
    )
}

@Composable
fun DrawerContent(navController: NavController = rememberNavController()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF153251))
    ) {
        Column {
            ComposeTopDrawer()
            ComposeDrawerItemsContent()
            ComposeDrawerBottomContent()
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ComposeTopNavBar(navController: NavController, scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Surface(
        modifier = Modifier
            .height(85.dp)
            .fillMaxWidth(),
        color = Color(0xFF25395A)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_menu1),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_acleda_logo),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            IconButton(onClick = {  navController.navigate("notification_page") }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }
            Spacer(modifier = Modifier.width(0.dp))
            IconButton(onClick = {
                navController.navigate("bakong")
            }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_bakong),
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                )
            }
        }
    }
}

@Composable
fun ComposeTopDrawer() {
    TopAppBar(
        backgroundColor = Color(0xFF112032),
        modifier = Modifier.height(97.dp),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.offset(x= 15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pfp),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(50.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Ouddommony Kim",
                        color = Color(0xFFc9a02b),
                        fontFamily = truenorgFontFamily,
                        style = MaterialTheme.typography.subtitle1,
                    )
                    Text(
                        text = "012 345 6789",
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.subtitle1,
                        color = Color.White,
                        fontFamily = truenorgFontFamily,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
            }
        }
    )
}

@Composable
fun ComposeDrawerItemsContent() {
    Column(modifier = Modifier
        .padding(start = 6.dp)
        .fillMaxWidth()
        .offset(y = (-15).dp)) {
        Spacer(modifier = Modifier.height(16.dp))
        drawerItems.forEach { item ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(12.dp)
                ) {
                    Image(
                        painter = painterResource(id = item.imageResourceId),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = item.text,
                        fontSize = 12.sp,
                        color = Color.White,
                        fontFamily = truenorgFontFamily,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}



@Composable
fun ComposeDrawerBottomContent() {
    Column(
        modifier = Modifier
            .offset(y = 35.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Version 6.22",
            color = Color(0xFFababab),
            fontSize = 12.sp,
            fontFamily = truenorgFontFamily
        )
        Text(
            "Released Date: March 11, 2024",
            color = Color(0xFFababab),
            fontSize = 12.sp,
            fontFamily = truenorgFontFamily
        )
        Text(
            "Your ACLEDA mobile version is up to date",
            color = Color(0xFFababab),
            fontSize = 12.sp,
            fontFamily = truenorgFontFamily
        )
    }
}

@Composable
fun ComposeMenuSection(
    menuItems: List<MenuItems>,
    height: Dp,
    navController: NavController
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = Color(0xFF21324E)
    ) {
        Row(
            modifier = Modifier
                .background(color = Color(0xFF21324E))
                .fillMaxWidth()
//                .height(height)
                .padding(0.dp)
//                .border(1.dp, Color.White),
        ) {
            menuItems.forEach { item ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .height(height),

                ) {
                    IconButton(onClick = {navController.navigate(item.destination)},
                            modifier = Modifier.fillMaxWidth().fillMaxHeight().bottomBorderColor(Color(0xFF345883),1.dp,).rightBorderColor(Color(0xFF345883), 1.dp))  {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                            Image(
                                painter = painterResource(id = item.imageResourceId),
                                contentDescription = item.text,
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                item.text,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                color = Color.White,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ComposeFavoriteBoxes(favoriteItems: List<FavoriteItem>) {
    LazyRow(
        modifier = Modifier
            .height(180.dp)
            .offset(y = 0.dp)
    ) {
        items(favoriteItems) { item ->
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp),
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    elevation = 10.dp,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .clickable {},
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = item.imageResourceId),
                            contentDescription = item.contentDescription,
                            modifier = Modifier
                                .size(40.dp)
                                .align(Alignment.Start)
                                .offset(y = 10.dp, x = 10.dp)
                        )

                        Text(
                            text = item.text,
                            color = Color(0xFF22355d),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.ExtraBold,
                            textAlign = TextAlign.Start,
                            fontFamily = montyFontFamily,
                            style = TextStyle(
                                lineHeight = 15.sp
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .offset(y = 7.dp)
                        )

                        Text(
                            text = item.description,
                            color = Color(0xFF848796),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            fontFamily = truenorgFontFamily,
                            style = TextStyle(
                                lineHeight = 15.sp
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ComposeBottomBackground() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 0.dp),
        color = Color(0xFF21324E)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}
