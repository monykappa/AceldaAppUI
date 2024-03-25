package com.example.acledaapp.models

import com.example.acledaapp.R


data class PaymentData(
    val iconId: Int,
    val title: String,
)


val paymentDataList = listOf(
    PaymentData(
        iconId = R.drawable.ic_water_supply,
        title = "WATER SUPPLY BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_electricity,
        title = "ELECTRICITY BILL",

        ),
    PaymentData(
        iconId = R.drawable.ic_ewp,
        title = "ENTERPRISE FOR MANAGING MUNICIPAL SOLID WASTE IN PHNOM PENH (EWP)",
    ),
    PaymentData(
        iconId = R.drawable.ic_share,
        title = "SHARE BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_financial,
        title = "FINANCIAL BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_mobile_bill,
        title = "MOBILE OPERATOR BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_internet,
        title = "INTERNET & TV BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_school_bill,
        title = "SCHOOL BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_insurance,
        title = "INSURANCE BILL",
    ),  PaymentData(
        iconId = R.drawable.ic_agriculture,
        title = "AGRICULTURE BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_real_estate,
        title = "REAL ESTATE BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_private_bill,
        title = "PRIVATE SOLID WASTE BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_b24,
        title = "B24 BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_membership,
        title = "MEMBERSHIP",
    ),
    PaymentData(
        iconId = R.drawable.ic_charity,
        title = "CHARITY & DONATION",
    ),
    PaymentData(
        iconId = R.drawable.ic_pending_bill,
        title = "PENDING PAYMENTS",
    ),
    PaymentData(
        iconId = R.drawable.ic_public_bill,
        title = "PUBLIC SERVICES BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_trading_bill,
        title = "TRADING & DISTRIBUTION BILL",
    ),
    PaymentData(
        iconId = R.drawable.ic_entertainment,
        title = "ENTERTAINMENT",
    ),
    PaymentData(
        iconId = R.drawable.ic_ecommerce,
        title = "E-COMMERCE",
    ),


    )
