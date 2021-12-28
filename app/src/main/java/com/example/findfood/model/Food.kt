package com.example.findfood.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    val imgFood: Int,
    val titleFood: String,
    val priceFood: String
) : Parcelable
