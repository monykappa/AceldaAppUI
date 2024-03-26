package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.acledaapp.R
import com.example.acledaapp.models.drawerItems
import com.example.acledaapp.models.truenorgFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch



@Preview(showSystemUi = true)
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
