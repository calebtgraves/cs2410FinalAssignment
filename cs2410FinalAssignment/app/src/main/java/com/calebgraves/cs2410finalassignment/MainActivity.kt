package com.calebgraves.cs2410finalassignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentPage = 0 // page 0 is calendar
        val toCalendar = findViewById<ConstraintLayout>(R.id.toCalendar)
        val toJournal = findViewById<ConstraintLayout>(R.id.toJournal)
        val toGoals = findViewById<ConstraintLayout>(R.id.toGoals)
        val toSettings = findViewById<ConstraintLayout>(R.id.toSettings)

        toCalendar.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_calendarFragment)
            currentPage = 0
        }
        toJournal.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_journalFragment)
            currentPage = 1
        }
        toGoals.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_goalsFragment)
            currentPage = 2
        }
        toSettings.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_settingsFragment)
            currentPage = 3
        }
    }
}