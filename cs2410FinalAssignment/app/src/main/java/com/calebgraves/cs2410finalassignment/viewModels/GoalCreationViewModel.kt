package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import kotlinx.coroutines.launch
import java.time.LocalDate

class GoalCreationViewModel: ViewModel() {
    val errorMessage = MutableLiveData("")
    val done = MutableLiveData(false)

    fun createGoal(title: String, category: String, description: String, startDate: Long, endDate: Long) {
        errorMessage.value = ""
        viewModelScope.launch {
            val goal = Goal(0, title, category, description, startDate.toLong(), endDate.toLong())
            GoalsRepository.createGoal(goal)
            done.value = true
        }
        return
    }
}