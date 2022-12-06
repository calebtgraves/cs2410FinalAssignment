package com.calebgraves.cs2410finalassignment.viewModels

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.calebgraves.cs2410finalassignment.models.GoalEventCoupler

@Dao
interface GoalsToEventsDao {
    @Insert
    fun addGoal(coupler: GoalEventCoupler)

    @Query("SELECT goalId FROM GoalEventCoupler WHERE eventId = :id")
    fun goalsForEvent(id: Long): List<Long>

    @Query("SELECT eventId FROM GoalEventCoupler WHERE goalId = :id")
    fun eventsForGoal(id: Long): List<Long>

    @Delete
    fun removeGoal(coupler: GoalEventCoupler)
}