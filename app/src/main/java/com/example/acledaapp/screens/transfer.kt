package com.example.acledaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
fun TransferScreenPreview() {
    val navController = rememberNavController()
    TransferScreen(navController = navController)
}

@Composable
fun TransferScreen(navController: NavController) {
    Column(){
        ComposeNavbar(navController = navController, "TRANSFER")
        ComposeTransfer()
    }

}
@Composable
fun ComposeTransfer() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        transferItems.forEach { item ->
            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .border(width = 0.5.dp, color = Color.Gray)
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = item.icon),
                    contentDescription = item.title,
                    modifier = Modifier
                        .size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = item.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = montyFontFamily,
                        color = Color(28, 51, 82)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = item.description,
                        fontSize = 12.sp,
                        fontFamily = montyFontFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }
            }
        }
    }
}
data class TransferItem(val icon: Int, val title: String, val description: String)

val transferItems = mutableListOf(
    TransferItem(R.drawable.ic_own_acc, "OWN ACCOUNTS", "Transfer between your ACLEDA Account"),
    TransferItem(R.drawable.ic_ac_acc, "ACLEDA ACCOUNT/PHONE NUMBER", "Transfer to Bank/Wallet Account or Phone Number"),
    TransferItem(R.drawable.ic_other_banks, "OTHER LOCAL BANKS OR MFIs", "Transfer to other Local Bank Accounts, Wallets or Phone"),
    TransferItem(R.drawable.ic_int_transfer, "INTERNATIONAL TRANSFERS", "Overseas fund transfer to bank account/agent/card"),
    TransferItem(R.drawable.ic_int_card, "INTERNATIONAL CARD", "Transfer to Visa, Mastercard")
)

