package com.calebgraves.cs2410finalassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toCalendar = findViewById<ConstraintLayout>(R.id.toCalendar)
        val toJournal = findViewById<ConstraintLayout>(R.id.toJournal)
        val toGoals = findViewById<ConstraintLayout>(R.id.toGoals)
        val toSettings = findViewById<ConstraintLayout>(R.id.toSettings)

        toCalendar.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_calendarFragment)
        }
        toJournal.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_journalFragment)
        }
        toGoals.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_goalsFragment)
        }
        toSettings.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_settingsFragment)
        }
    }
}