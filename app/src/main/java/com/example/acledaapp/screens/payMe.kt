package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
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
fun PayMeScreenPreview() {
    val navController = rememberNavController()
    ComposePayMe(navController = navController)
}


@Composable
fun PayMeScreen(navController: NavController) {
    ComposePayMe(navController = navController)
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Preview(showSystemUi = true)
@Composable
fun ComposePayMe(navController: NavController) {
    Surface {
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.height(60.dp),
                    title = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 25.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "PAY ME",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                fontFamily = montyFontFamily,
                                fontSize = 18.sp,
                                color = Color.White,
                                modifier = Modifier
                            )
                        }
                    },
                    backgroundColor = Color(0xFF173a67),
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back", modifier = Modifier.size(20.dp))
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
        ) {
            // Content of the scaffold
        }
    }
}