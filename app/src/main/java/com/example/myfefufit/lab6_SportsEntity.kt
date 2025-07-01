package com.example.myfefufit

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "activity")
class lab6_SportsEntity(

    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val typeCaption: TypeCaption,
    val startTime: Date,
    val endTime: Date,
    val distance: Double
) {
    enum class TypeCaption {
        BIKING, RUNNING, WALKING
    }
}