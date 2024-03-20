package com.example.acledaapp.screens
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.draw.shadow
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
import com.example.acledaapp.models.truenorgFontFamily
import com.example.acledaapp.models.truenorgbdFontFamily


@Preview(showSystemUi = true)
@Composable
fun LoanScreenPreview(){
    val navController = rememberNavController()
    ComposeLoan(navController = navController)
}
@Composable
fun LoanScreen(navController: NavController) {
    ComposeLoan(navController = navController)
}

data class LoanData(
    val iconId: Int,
    val title: String,
    val description: String,
)

val loanDataList = listOf(
    LoanData(
        iconId = R.drawable.ic_request_loan,
        title = "REQUEST LOAN",
        description = "Banks officer will assist your requirement",
    ),
    LoanData(
        iconId = R.drawable.ic_loan_term,
        title = "LOAN AGAINST TERM DEPOSIT",
        description = "Required valid term deposit",

        ),
    LoanData(
        iconId = R.drawable.ic_loan_summary,
        title = "LOAN SUMMARY",
        description = "View all active loans and termination",
    ),
    LoanData(
        iconId = R.drawable.ic_credit_report,
        title = "CBC CREDIT REPORT",
        description = "Your personal financial health checking, power by CBC",
    ),
)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ComposeLoan(navController: NavController) {
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
                                text = "LOANS",
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
            ComposeLoansCards()
        }
    }
}

@Composable
fun ComposeLoansCards() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.background(Color.White)) {
            loanDataList.forEachIndexed { index, LoanData ->
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .shadow(
                            ambientColor = Color(0xFFb9b9b9),
                            elevation = (0.5.dp)

                )
                        .clickable { }
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = LoanData.iconId),
                        contentDescription = "Icon Image",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 8.dp),
                    )
                    Column {
                        // Title
                        Text(
                            text = LoanData.title,
                            fontSize = 14.sp,
                            color = Color(0xFF1d2f4b),
                            fontFamily = truenorgbdFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .offset(x = 10.dp),
                        )
                        // Description
                        Text(
                            text = LoanData.description,
                            fontSize = 13.sp,
                            fontFamily = truenorgFontFamily,
                            color = Color(0xFF2f404a),
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .offset(x = 10.dp)
                        )
                    }
                }
            }
        }
    }
}