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
import com.example.acledaapp.R
import com.example.acledaapp.models.montyFontFamily
import androidx.navigation.compose.rememberNavController


@Preview(showSystemUi = true)
@Composable
fun ScanQrScreenPreview(){
    val navController = rememberNavController()
    ComposeScanQr(navController = navController)
}
@Composable
fun ScanQrScreen(navController: NavController) {
    ComposeScanQr(navController = navController)
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ComposeScanQr(navController: NavController) {
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
                                text = "SCAN QR",
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
                        IconButton(onClick = { navController.navigate("home") }) {
                            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "Back", modifier = Modifier.size(20.dp))
                        }
                    },
                    actions = {
                        Box(
                            modifier = Modifier.padding(end = 16.dp)
                        ) {
                            IconButton(
                                onClick = { },
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
//            composeOpenCamera()
        }
    }
}


//@Composable
//fun composeOpenCamera() {
//    val context = LocalContext.current
//    val cameraPermissionLauncher = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.RequestPermission(),
//        onResult = { isGranted: Boolean ->
//            if (isGranted) {
//                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                context.startActivity(intent)
//            } else {
//                // Handle permission denial here
//            }
//        }
//    )
//
//    Button(onClick = {
//        when (PackageManager.PERMISSION_GRANTED) {
//            ContextCompat.checkSelfPermission(
//                context,
//                Manifest.permission.CAMERA
//
//            ) -> {
//                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                context.startActivity(intent)
//            }
//            else -> {
//                cameraPermissionLauncher.launch(Manifest.permission.CAMERA
//                )
//            }
//        }
//    }) {
//        Text("Open Camera")
//    }
//}