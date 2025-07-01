package com.example.myfefufit

sealed class lab4_MySportsItem {
    data class Header(val date: String) : lab4_MySportsItem()
    data class Activity(
        val id: Int,
        val typeCaption: String,
        val progressCaption: String,
        val timeProgressCaption: String,
        val dateCaption: String
    ) : lab4_MySportsItem()
}