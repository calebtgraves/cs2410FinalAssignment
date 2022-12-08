package com.calebgraves.cs2410finalassignment

import android.app.Application

class PlannerApplication: Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: Application? = null

        fun getInstance(): Application {
            return instance!!
        }
    }
}