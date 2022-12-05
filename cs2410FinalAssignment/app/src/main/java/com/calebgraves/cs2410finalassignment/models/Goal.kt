package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Goal(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var title: String,
    @ColumnInfo var category: String,
    @ColumnInfo var description: String,
    @ColumnInfo var startDate: Date,
    @ColumnInfo var endDate: Date,
)