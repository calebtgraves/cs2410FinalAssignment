package com.calebgraves.cs2410finalassignment.repository

import androidx.room.Room
import com.calebgraves.cs2410finalassignment.AppDatabase
import com.calebgraves.cs2410finalassignment.PlannerApplication
import com.calebgraves.cs2410finalassignment.models.Goal
import java.time.LocalDate

object GoalsRepository {
    private val db: AppDatabase;
    private var cacheInitialized = false;
    private val goalsCache = mutableListOf<Goal>()
    init {
        db = Room.databaseBuilder(
            PlannerApplication.getInstance(),
            AppDatabase::class.java,
            "goals-database"
        ).build()
    }

    suspend fun createGoal(goal: Goal) {
        goal.id = db.getGoalsDao().createGoal(goal)
        goalsCache.add(goal)
    }

    suspend fun getAllGoals(): List<Goal> {
        if (!cacheInitialized) {
            goalsCache.addAll(db.getGoalsDao().allGoals())
            cacheInitialized = true
        }
        return goalsCache
    }

    suspend fun goalById(id: Long): Goal {
        return db.getGoalsDao().goalById(id)
    }

    suspend fun goalsForDay(date: Long): List<Goal> {
        return db.getGoalsDao().goalsForDay(date)
    }

    suspend fun update(goal: Goal) {
        db.getGoalsDao().updateGoal(goal)
        goalsCache[goalsCache.indexOfFirst {
            it.id == goal.id
        }] = goal
    }

    suspend fun deleteGoal(goal: Goal) {
        goalsCache.remove(goal)
        db.getGoalsDao().deleteGoal(goal)
    }
}