package com.example.acledaapp.screens

import android.annotation.SuppressLint
import android.util.Log.v
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
fun MobileScreenPreview() {
    val navController = rememberNavController()
    MobileScreen(navController = navController)
}

@Composable
fun MobileScreen(navController: NavController) {
    ComposeNavbar(navController = navController, navName = "MOBILE TOP-UP" )
}

