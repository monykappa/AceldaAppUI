package com.example.acledaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
fun PreviewNavBar(){
    val navController = rememberNavController()
    ComposeNavbar(navController = navController, "ACCOUNT")
}



@Composable
fun ComposeNavbar(navController: NavController, navName : String) {
    Surface {
        Column(
            modifier = Modifier
//                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Top
        ) {
            TopAppBar(
                modifier = Modifier.height(60.dp),
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 0.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            navName,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            fontFamily = montyFontFamily,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                },
                backgroundColor = Color(0xFF173a67),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_back),
                            contentDescription = "Back",
                            modifier = Modifier.size(20.dp),
                        )
                    }
                },
                actions = {
                    Box(
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        IconButton(
                            onClick = { /* Handle logo image click */ },
                            modifier = Modifier.size(40.dp),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ac_logo),
                                contentDescription = "Account"
                            )
                        }
                    }
                },
                elevation = AppBarDefaults.TopAppBarElevation
            )


        }
    }
}
