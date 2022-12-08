package com.calebgraves.cs2410finalassignment.repository

import androidx.room.Room
import com.calebgraves.cs2410finalassignment.AppDatabase
import com.calebgraves.cs2410finalassignment.PlannerApplication
import com.calebgraves.cs2410finalassignment.models.GoalEventCoupler

object GoalEventCouplerRepository {
    private val db: AppDatabase;
    private var cacheInitialized = false;
    private val couplerCache = mutableListOf<GoalEventCoupler>()
    init {
        db = Room.databaseBuilder(
            PlannerApplication.getInstance(),
            AppDatabase::class.java,
            "coupler-database"
        ).build()
    }

    suspend fun createCoupler(coupler: GoalEventCoupler) {
        db.getCouplersDao().createCoupler(coupler)
        couplerCache.add(coupler)
    }

    suspend fun getAllCouplers(): List<GoalEventCoupler> {
        if (!cacheInitialized) {
            couplerCache.addAll(db.getCouplersDao().allCouplers())
            cacheInitialized = true
        }
        return couplerCache
    }

    suspend fun goalIdsForEvent(id: Long): List<Long> {
        return db.getCouplersDao().goalsForEvent(id)
    }

    suspend fun eventIdsForGoal(id: Long): List<Long> {
        return db.getCouplersDao().eventsForGoal(id)
    }

    suspend fun deleteCoupler(coupler: GoalEventCoupler) {
        couplerCache.remove(coupler)
        db.getCouplersDao().deleteCoupler(coupler)
    }
}