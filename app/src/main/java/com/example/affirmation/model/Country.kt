package com.example.affirmation.model

import androidx.annotation.DrawableRes

data class Country(
    val name: String,
    val capital: String,
    val code: String,
    @DrawableRes val flagResourceId: Int
)
