package com.calebgraves.cs2410finalassignment.repository

import androidx.room.Room
import com.calebgraves.cs2410finalassignment.AppDatabase
import com.calebgraves.cs2410finalassignment.PlannerApplication
import com.calebgraves.cs2410finalassignment.models.Event
import java.time.LocalDate
import java.time.LocalDateTime

object EventsRepository {
    private val db: AppDatabase;
    private var cacheInitialized = false;
    private val eventsCache = mutableListOf<Event>()
    init {
        db = Room.databaseBuilder(
            PlannerApplication.getInstance(),
            AppDatabase::class.java,
            "events-database"
        ).build()
    }

    suspend fun createEvent(event: Event) {
        event.id = db.getEventsDao().createEvent(event)
        eventsCache.add(event)
    }

    suspend fun createEvents(events: List<Event>) {
        for (event in events) {
            createEvent(event)
        }
    }

    suspend fun getAllRepeats(repeatingSeriesId: Int): List<Event> {
        return db.getEventsDao().getAllRepeats(repeatingSeriesId)
    }

    suspend fun getFollowingRepeats(repeatingSeriesId: Int, eventDate: Long): List<Event> {
        return db.getEventsDao().getFollowingRepeats(repeatingSeriesId, eventDate)
    }

    suspend fun getAllEvents(): List<Event> {
        if (!cacheInitialized) {
            eventsCache.addAll(db.getEventsDao().allEvents())
            cacheInitialized = true
        }
        return eventsCache
    }

    suspend fun eventById(id: Long): Event {
        return db.getEventsDao().eventById(id)
    }

    suspend fun eventsForDay(date: Long): List<Event> {
        return db.getEventsDao().eventsForDay(date)
    }

    suspend fun update(event: Event) {
        db.getEventsDao().updateEvent(event)
        eventsCache[eventsCache.indexOfFirst {
            it.id == event.id
        }] = event
    }

    suspend fun deleteEvent(event: Event) {
        eventsCache.remove(event)
        db.getEventsDao().deleteEvent(event)
    }
}