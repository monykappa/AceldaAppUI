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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color.Companion.Gray
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


        Spacer(modifier = Modifier.height(8.dp))
        // Balance section
        Spacer(modifier = Modifier.height(8.dp))
        // Feature buttons section
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            Button(onClick = { /* Payments button click */ }) {
                androidx.compose.material.Text("Payments")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /* Mobile Top-up button click */ }) {
                androidx.compose.material.Text("Mobile Top-up")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /* Transfers button click */ }) {
                androidx.compose.material.Text("Transfers")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        // Service buttons section
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Button(onClick = { /* Pay-Me button click */ }) {
                androidx.compose.material.Text("Pay-Me")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /* Scan QR button click */ }) {
                androidx.compose.material.Text("Scan QR")
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(onClick = { /* Accounts button click */ }) {
                androidx.compose.material.Text("Accounts")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        // More features section
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Button(onClick = { /* Deposits button click */ }) {
                androidx.compose.material.Text("Deposits")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /* Loans button click */ }) {
                androidx.compose.material.Text("Loans")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { /* Quick Cash button click */ }) {
                androidx.compose.material.Text("Quick Cash")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        // Bottom section with favorites, exchange rate, etc.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                androidx.compose.material.Text("FAVORITES")
                androidx.compose.material.Text("Save recipient information for quick transaction.")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                androidx.compose.material.Text("EXCHANGE RATE")
                androidx.compose.material.Text("4,110")
            }
            Spacer(modifier = Modifier.width(16.dp))
            androidx.compose.material.Text("OTHER SER")
        }
    }
}



