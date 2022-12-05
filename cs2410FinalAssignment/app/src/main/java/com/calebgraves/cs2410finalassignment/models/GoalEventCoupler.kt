package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class GoalEventCoupler(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var goalId: Long,
    @ColumnInfo var eventId: Long,
)