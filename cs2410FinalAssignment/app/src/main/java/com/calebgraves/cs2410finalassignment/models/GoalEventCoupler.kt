package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(primaryKeys = ["goalId", "eventId"])
data class GoalEventCoupler(
    val goalId: Long,
    val eventId: Long,
)