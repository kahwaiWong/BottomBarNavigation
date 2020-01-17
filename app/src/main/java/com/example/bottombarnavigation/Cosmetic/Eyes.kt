package com.example.bottombarnavigation.Cosmetic

import androidx.room.Entity

@Entity(tableName = "eye")

data class Eyes(
    val imageId: Int,
    val imageName: String

)