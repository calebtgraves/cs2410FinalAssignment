package com.calebgraves.cs2410finalassignment.viewModels

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.calebgraves.cs2410finalassignment.models.JournalEntry

@Dao
interface JournalEntryDao {
    @Insert
    fun addEntry(entry: JournalEntry)

    @Delete
    fun removeEntry(entry: JournalEntry)
}