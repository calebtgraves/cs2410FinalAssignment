package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import kotlinx.coroutines.launch

class GoalsViewModel: ViewModel() {
    val goals = ObservableArrayList<Goal>()
    init {
        loadGoals()
    }

    private fun loadGoals() {
        viewModelScope.launch {
            val loadedGoals = GoalsRepository.getAllGoals()
            goals.addAll(loadedGoals)
        }
    }
}