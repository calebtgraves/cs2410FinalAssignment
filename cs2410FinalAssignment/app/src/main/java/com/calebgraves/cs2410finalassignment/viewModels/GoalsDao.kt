package com.calebgraves.cs2410finalassignment.viewModels

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.calebgraves.cs2410finalassignment.models.Goal
import java.time.LocalDate

@Dao
interface GoalsDao {
    @Insert
    fun addGoal(goal: Goal)

    @Query("SELECT * FROM events")
    fun allGoals(): List<Goal>

    @Query("SELECT * FROM goals WHERE Id = :id")
    fun goalById(id: Long): Goal

    @Query("SELECT * FROM goals WHERE startDate <= :day AND endDate >= :day")
    fun goalsForDay(day: LocalDate): List<Goal>

    @Delete
    fun removeGoal(goal: Goal)
}