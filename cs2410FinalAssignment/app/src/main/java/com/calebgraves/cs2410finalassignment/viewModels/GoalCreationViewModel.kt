package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDate

class GoalCreationViewModel: ViewModel() {
    val errorMessage = MutableLiveData("")
    val done = MutableLiveData(false)

    fun createGoal(title: String, category: String, description: String, startDate: Long, endDate: Long) {
        if (title.isEmpty()) {
            errorMessage.value = "Title field must not be empty"
            viewModelScope.launch {
                delay(6000)
                errorMessage.value = ""
            }
        }
        else {
            viewModelScope.launch {
                val goal = Goal(0, title, category, description, startDate.toLong(), endDate.toLong())
                GoalsRepository.createGoal(goal)
                done.value = true
            }
        }
        return
    }
}