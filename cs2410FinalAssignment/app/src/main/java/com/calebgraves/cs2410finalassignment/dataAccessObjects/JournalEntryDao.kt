package com.calebgraves.cs2410finalassignment.dataAccessObjects

import androidx.room.*
import com.calebgraves.cs2410finalassignment.models.JournalEntry

@Dao
interface JournalEntriesDao {
    @Insert
    suspend fun createJournalEntry(entry: JournalEntry): Long

    @Query("SELECT * FROM journalEntries")
    suspend fun allJournalEntries(): List<JournalEntry>

    @Update
    suspend fun updateJournalEntry(entry: JournalEntry)

    @Delete
    suspend fun deleteJournalEntry(entry: JournalEntry)
}