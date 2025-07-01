package com.example.myfefufit

sealed class UsersSportsItem {
    data class Header(val date: String) : UsersSportsItem()
    data class Activity(
        val id: Int,
        val typeCaption: String,
        val progressCaption: String,
        val timeProgressCaption: String,
        val dateCaption: String,
        val username: String
    ) : UsersSportsItem()
}


object UsersSportsList {
    val activity = listOf(
        UsersSportsItem.Activity(
            0,
            "Серфинг",
            "14.32 км",
            "2 часа 46 минут",
            "14 часов назад",
            "@van_darkholme"
        ),
        UsersSportsItem.Activity(
            1,
            "Качели",
            "228 м",
            "14 часов 48 минут",
            "14 часов назад",
            "@techniquepasha"
        ),
        UsersSportsItem.Activity(
            2,
            "Езда на кадилак",
            "10 км",
            "1 час 10 минут",
            "14 часов назад",
            "@morgen_shtern"
        )
    )
}