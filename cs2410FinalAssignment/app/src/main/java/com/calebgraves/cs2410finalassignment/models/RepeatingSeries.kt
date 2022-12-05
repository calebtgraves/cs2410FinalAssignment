package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class RepeatingSeries(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var eventId: Long,
    @ColumnInfo var period: String,
    @ColumnInfo var daysOfWeek: Byte,
    @ColumnInfo var endDate: Date,
)