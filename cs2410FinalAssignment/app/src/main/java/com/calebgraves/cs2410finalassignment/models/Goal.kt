package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "goals")
data class Goal(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var title: String,
    @ColumnInfo var category: String,
    @ColumnInfo var description: String,
    @ColumnInfo var startDate: Long,
    @ColumnInfo var endDate: Long,
)