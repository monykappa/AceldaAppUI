package com.example.acledaapp.models

import com.example.acledaapp.R

data class DrawerItem(val imageResourceId: Int, val text: String)

val drawerItems = mutableListOf(
    DrawerItem(R.drawable.ic_global, "Country and Language"),
    DrawerItem(R.drawable.ic_setting, "Settings"),
    DrawerItem(R.drawable.ic_location, "Location"),
    DrawerItem(R.drawable.ic_warning, "Terms and Conditions"),
    DrawerItem(R.drawable.ic_security, "Security Tips"),
    DrawerItem(R.drawable.ic_product, "Products & Services "),
    DrawerItem(R.drawable.ic_faq, "FAQs"),
    DrawerItem(R.drawable.ic_invite, "Invite Friends"),
    DrawerItem(R.drawable.ic_stock, "ACLEDA Bank's Stock"),
    DrawerItem(R.drawable.ic_cusomter, "Customer Loyalty"),
    DrawerItem(R.drawable.ic_contact, "Contact Us (24/7)"),
    DrawerItem(R.drawable.ic_help, "Help"),
)