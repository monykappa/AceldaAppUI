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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
//import com.example.acledaapp.ui.theme.AcledaAppTheme
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.acledaapp.R
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


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
)
val poppinsFontFamily = FontFamily(
    Font(R.font.font_poppins),
)

data class BalanceItem(
    val imageResourceId: Int,
    val text: String,
    val contentDescription: String,
)

val menuRow1 = listOf(
    BalanceItem(R.drawable.payment, "Payments", "Payment"),
    BalanceItem(R.drawable.mobile, "Mobile Top-up", "Mobile Top-up"),
    BalanceItem(R.drawable.transfer, "Transfers", "Transfers")
)

val menuRow2 = listOf(
    BalanceItem(R.drawable.pay_me, "Pay-Me", "Pay-Me"),
    BalanceItem(R.drawable.scan_qr, "Scan QR", "Scan QR"),
    BalanceItem(R.drawable.account, "Accounts", "Accounts")
)

val menuRow3 = listOf(
    BalanceItem(R.drawable.deposit, "Deposits", "Deposits"),
    BalanceItem(R.drawable.loan, "Loans", "Loans"),
    BalanceItem(R.drawable.quick_cash, "Quick Cash", "Quick Cash")
)

data class FavoriteItem(
    val imageResourceId: Int,
    val text: String,
    val description: String,
    val contentDescription: String
)

val favoriteItems = listOf(
    FavoriteItem(
        R.drawable.favorite,
        "FAVOTIRES",
        "Save recipient information for quick transaction.",
        "Favorite 1"
    ),
    FavoriteItem(
        R.drawable.riel,
        "EXCHANGE RATE",
        "Save recipient information for quick transaction.",
        "Favorite 2"
    ),
    FavoriteItem(
        R.drawable.boxes,
        "OTHER SERVICES WITH PARTNERS",
        "",
        "Favorite 2"
    ),
    FavoriteItem(
        R.drawable.promotions,
        "PROMOTIONS",
        "More discount and special offer from ACLEDA's partners",
        "Favorite 2"
    ),

)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun mainScreen(navController: NavController) {
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
            TopNavBar(navController = navController, scaffoldState = scaffoldState, scope = scope)
        },
        content = {
            Column(modifier = Modifier.fillMaxSize()) {
                // Menu Section
                MenuSection(menuRow1, height = 118.dp)
                MenuSection(menuRow2, height = 120.dp)
                MenuSection(menuRow3, height = 122.dp)

                // Favorites container boxes
                favoriteBoxes(favoriteItems)

                // Bottom background
                BottomBackground()
            }
        }
    )
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TopNavBar(navController: NavController, scaffoldState: ScaffoldState, scope: CoroutineScope) {
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
            //menu icon
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Image(
                    painter = painterResource(id = R.drawable.menu_icon),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.aclogo),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            IconButton(onClick = { /* Handle notification icon click */ }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(0.dp))

            IconButton(onClick = {
                // Navigate to the "detail" destination (bakong.kt screen)
                navController.navigate("detail")
            }) {
                Image(
                    painter = painterResource(id = R.drawable.bakong),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}


@Composable
fun DrawerContent(navController: NavController) {
    Column {
        TopAppBar(
            backgroundColor = Color(0xFF112032),
            modifier = Modifier.height(97.dp),
            content = {
                Row(
                    verticalAlignment = Alignment.CenterVertically // Align content vertically to the center
                ) {
                    // Profile picture on the left
                    Image(
                        painter = painterResource(id = R.drawable.pfp),
                        contentDescription = null,
                        modifier = Modifier
                            .size(55.dp)
                            .clip(RoundedCornerShape(50.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(16.dp)) // Spacer for spacing between profile picture and name

                    // Name and phone number on the right
                    Column {
                        Text(
                            text = "Ouddommony Kim",
                            color = Color(0xFFc9a02b),
                            style = MaterialTheme.typography.subtitle1,
                        )
                        Text(
                            text = "088 802 6678",
                            fontSize = 12.sp,
                            style = MaterialTheme.typography.subtitle1,
                            color = Color.White,
                        )
                    }
                }
            }
        )

        // Content area
        Column(modifier = Modifier.padding(16.dp)) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Drawer Item 1",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .clickable {
                        // Navigate to a destination when a drawer item is clicked
                        navController.navigate("drawer_item_1")
                    }
            )
            Text(
                text = "Drawer Item 2",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clickable {
                        // Navigate to a destination when a drawer item is clicked
                        navController.navigate("drawer_item_2")
                    }
            )
        }
    }
}







@Composable
fun MenuSection(balanceItems: List<BalanceItem>, height: Dp) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(height),
        color = Color(0xFF21324E)
    ) {
        Row(
            modifier = Modifier
                .background(color = Color(0xFF21324E))
                .bottomBorderColor(color = Color(0xFF476CB0), borderWidth = 1.dp)
        ) {
            balanceItems.forEach { item ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 20.dp),
                ) {
                    IconButton(onClick = { /* Handle button click */ }) {
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
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
    }
}



@Composable
fun favoriteBoxes(favoriteItems: List<FavoriteItem>) {
    LazyRow(
        modifier = Modifier
            .height(180.dp)
            .offset(y = 0.dp)
    ) {
        items(favoriteItems) { item ->
            Surface(
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(Color.Transparent)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
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
                            color = Color.Black,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.ExtraBold,
                            textAlign = TextAlign.Start,
                            fontFamily = poppinsFontFamily,
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
                            color = Color(0xFF3C5278),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            fontFamily = poppinsFontFamily,
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
fun BottomBackground() {
    Surface(
        modifier = Modifier.fillMaxSize().offset(y = 0.dp),
        color = Color(0xFF21324E)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}






