package com.calebgraves.cs2410finalassignment.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "journalEntries")
data class JournalEntry(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var date: Long,
    @ColumnInfo var title: String,
    @ColumnInfo var content: String,
)