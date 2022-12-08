package com.calebgraves.cs2410finalassignment.dataAccessObjects

import androidx.room.*
import com.calebgraves.cs2410finalassignment.models.GoalEventCoupler

@Dao
interface GoalsToEventsDao {
    @Insert
    suspend fun createCoupler(coupler: GoalEventCoupler)

    @Query("SELECT * FROM goaleventcoupler")
    suspend fun allCouplers(): List<GoalEventCoupler>

    @Query("SELECT goalId FROM GoalEventCoupler WHERE eventId = :id")
    suspend fun goalsForEvent(id: Long): List<Long>

    @Query("SELECT eventId FROM GoalEventCoupler WHERE goalId = :id")
    suspend fun eventsForGoal(id: Long): List<Long>

    @Delete
    suspend fun deleteCoupler(coupler: GoalEventCoupler)
}