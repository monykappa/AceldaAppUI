package com.example.acledaapp.models

import com.example.acledaapp.R


data class FavoriteItem(
    val imageResourceId: Int,
    val text: String,
    val description: String,
    val contentDescription: String
)




val favoriteItems = listOf(
    FavoriteItem(
        R.drawable.ic_favorite,
        "FAVOTIRES",
        "Save recipient information for quick transaction.",
        "Favorite 1"
    ),
    FavoriteItem(
        R.drawable.ic_riel,
        "EXCHANGE RATE",
        "Save recipient information for quick transaction.",
        "Favorite 2"
    ),
    FavoriteItem(
        R.drawable.ic_boxes,
        "OTHER SERVICES WITH PARTNERS",
        "",
        "Favorite 2"
    ),
    FavoriteItem(
        R.drawable.ic_promotions,
        "PROMOTIONS",
        "More discount and special offer from ACLEDA's partners",
        "Favorite 2"
    ),

    )
