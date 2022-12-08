package com.calebgraves.cs2410finalassignment.repository

import androidx.room.Room
import com.calebgraves.cs2410finalassignment.AppDatabase
import com.calebgraves.cs2410finalassignment.PlannerApplication
import com.calebgraves.cs2410finalassignment.models.JournalEntry
import java.time.LocalDate

object JournalEntriesRepository {
    private val db: AppDatabase;
    private var cacheInitialized = false;
    private val journalEntriesCache = mutableListOf<JournalEntry>()
    init {
        db = Room.databaseBuilder(
            PlannerApplication.getInstance(),
            AppDatabase::class.java,
            "journal-entries-database"
        ).build()
    }

    suspend fun createJournalEntry(journalEntry: JournalEntry) {
        journalEntry.id = db.getJournalEntriesDao().createJournalEntry(journalEntry)
        journalEntriesCache.add(journalEntry)
    }

    suspend fun getAllJournalEntries(): List<JournalEntry> {
        if (!cacheInitialized) {
            journalEntriesCache.addAll(db.getJournalEntriesDao().allJournalEntries())
            cacheInitialized = true
        }
        return journalEntriesCache
    }

    suspend fun update(journalEntry: JournalEntry) {
        db.getJournalEntriesDao().updateJournalEntry(journalEntry)
        journalEntriesCache[journalEntriesCache.indexOfFirst {
            it.id == journalEntry.id
        }] = journalEntry
    }

    suspend fun deleteJournalEntry(journalEntry: JournalEntry) {
        journalEntriesCache.remove(journalEntry)
        db.getJournalEntriesDao().deleteJournalEntry(journalEntry)
    }
}