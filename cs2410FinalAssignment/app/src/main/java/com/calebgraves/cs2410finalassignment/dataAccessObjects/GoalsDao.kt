package com.calebgraves.cs2410finalassignment.dataAccessObjects

import androidx.room.*
import com.calebgraves.cs2410finalassignment.models.Goal
import java.time.LocalDate

@Dao
interface GoalsDao {
    @Insert
    suspend fun createGoal(goal: Goal): Long

    @Query("SELECT * FROM events")
    suspend fun allGoals(): List<Goal>

    @Query("SELECT * FROM goals WHERE Id = :id")
    suspend fun goalById(id: Long): Goal

    @Query("SELECT * FROM goals WHERE startDate <= :day AND endDate >= :day")
    suspend fun goalsForDay(day: Long): List<Goal>

    @Update
    suspend fun updateGoal(goal: Goal)

    @Delete
    suspend fun deleteGoal(goal: Goal)
}