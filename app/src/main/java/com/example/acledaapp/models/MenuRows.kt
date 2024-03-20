package com.example.acledaapp.models

import com.example.acledaapp.R

data class MenuItems(
    val imageResourceId: Int,
    val text: String,
    val contentDescription: String,
    val destination: String,
)


val menuRow1 = listOf(
    MenuItems(R.drawable.ic_payment, "Payments", "Payment", "payments_page"),
    MenuItems(R.drawable.ic_mobile, "Mobile Top-up", "Mobile Top-up", "mobile_top_up_page"),
    MenuItems(R.drawable.ic_transfer, "Transfers", "Transfers", "transfers_page")
)

val menuRow2 = listOf(
    MenuItems(R.drawable.ic_pay_me, "Pay-Me", "Pay-Me", "pay_me_page"),
    MenuItems(R.drawable.ic_scan_qr, "Scan QR", "Scan QR", "scan_qr_page"),
    MenuItems(R.drawable.ic_account, "Accounts", "Accounts", "account_page")
)

val menuRow3 = listOf(
    MenuItems(R.drawable.ic_deposit, "Deposits", "Deposits", "deposit_page"),
    MenuItems(R.drawable.ic_loan, "Loans", "Loans", "loan_page"),
    MenuItems(R.drawable.ic_quick_cash, "Quick Cash", "Quick Cash", "quick_cash_page")
)
