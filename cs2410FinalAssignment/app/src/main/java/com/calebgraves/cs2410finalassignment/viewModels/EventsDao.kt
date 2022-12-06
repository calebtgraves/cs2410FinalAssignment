package com.calebgraves.cs2410finalassignment.viewModels

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.calebgraves.cs2410finalassignment.models.Event
import java.time.LocalDate
import java.time.LocalDateTime

@Dao
interface EventsDao {
    @Insert
    fun addEvent(event: Event)

    @Insert
    fun addEvents(events: List<Event>)

    @Query("SELECT * FROM events")
    fun allEvents(): List<Event>

    @Query("SELECT * FROM events WHERE repeatingSeries = :repeatingSeriesId")
    fun getAllRepeats(repeatingSeriesId: Int): List<Event>

    @Query("SELECT * FROM events WHERE repeatingSeries = :repeatingSeriesId AND (:allInSeries OR startDate > :eventDate)")
    fun getFollowingRepeats(repeatingSeriesId: Int, allInSeries: Boolean, eventDate: LocalDateTime): List<Event>

    @Query("SELECT * FROM events WHERE id = :id")
    fun eventById(id: Long): Event

    @Query("SELECT * FROM events WHERE startDate <= :day AND endDate >= :day")
    fun eventsForDay(day: LocalDate): List<Event>

    @Delete
    fun removeGoal(event: Event)
}