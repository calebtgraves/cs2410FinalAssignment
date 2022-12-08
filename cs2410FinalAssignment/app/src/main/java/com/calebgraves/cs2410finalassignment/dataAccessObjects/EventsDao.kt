package com.calebgraves.cs2410finalassignment.dataAccessObjects

import androidx.room.*
import com.calebgraves.cs2410finalassignment.models.Event
import java.time.LocalDate
import java.time.LocalDateTime

@Dao
interface EventsDao {
    @Insert
    suspend fun createEvent(event: Event): Long

    @Query("SELECT * FROM events")
    suspend fun allEvents(): List<Event>

    @Query("SELECT * FROM events WHERE repeatingSeries = :repeatingSeriesId")
    suspend fun getAllRepeats(repeatingSeriesId: Int): List<Event>

    @Query("SELECT * FROM events WHERE repeatingSeries = :repeatingSeriesId AND startDate >= :eventDate")
    suspend fun getFollowingRepeats(repeatingSeriesId: Int, eventDate: Long): List<Event>

    @Query("SELECT * FROM events WHERE id = :id")
    suspend fun eventById(id: Long): Event

    @Query("SELECT * FROM events WHERE startDate <= :day AND endDate >= :day")
    suspend fun eventsForDay(day: Long): List<Event>

    @Update
    suspend fun updateEvent(event: Event)

    @Delete
    suspend fun deleteEvent(event: Event)
}