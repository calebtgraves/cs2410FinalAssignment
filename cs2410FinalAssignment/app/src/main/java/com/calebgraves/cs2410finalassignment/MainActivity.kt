package com.calebgraves.cs2410finalassignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentPage = findViewById<TextView>(R.id.currentPage)
        val toCalendar = findViewById<ConstraintLayout>(R.id.toCalendar)
        val toJournal = findViewById<ConstraintLayout>(R.id.toJournal)
        val toGoals = findViewById<ConstraintLayout>(R.id.toGoals)
        val toSettings = findViewById<ConstraintLayout>(R.id.toSettings)

        currentPage.setText("Calendar")

        toCalendar.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_calendarFragment)
            currentPage.setText("Calendar")
        }
        toJournal.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_journalFragment)
            currentPage.setText("Journal")
        }
        toGoals.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_goalsFragment)
            currentPage.setText("Goals")
        }
        toSettings.setOnClickListener {
            findNavController(R.id.fragmentContainerView).navigate(R.id.action_global_settingsFragment)
            currentPage.setText("Settings")
        }
    }
}