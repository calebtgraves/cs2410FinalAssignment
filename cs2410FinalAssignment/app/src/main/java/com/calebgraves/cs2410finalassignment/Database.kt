package com.calebgraves.cs2410finalassignment

import androidx.room.Database
import androidx.room.RoomDatabase
import com.calebgraves.cs2410finalassignment.dataAccessObjects.*
import com.calebgraves.cs2410finalassignment.models.Event
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.models.GoalEventCoupler
import com.calebgraves.cs2410finalassignment.models.JournalEntry

@Database(entities = [Event::class, Goal::class, GoalEventCoupler::class, JournalEntry::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getEventsDao(): EventsDao
    abstract fun getGoalsDao(): GoalsDao
    abstract fun getCouplersDao(): GoalsToEventsDao
    abstract fun getJournalEntriesDao(): JournalEntriesDao
}