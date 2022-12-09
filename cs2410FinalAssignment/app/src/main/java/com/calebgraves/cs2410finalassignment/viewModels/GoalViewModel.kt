package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import kotlinx.coroutines.launch

class GoalViewModel: ViewModel() {
    val goal = MutableLiveData(Goal(0,"","","",0,0))
    val done = MutableLiveData(false)

    fun goalById(id: Long) {
        done.value = false
        viewModelScope.launch {
            goal.value = GoalsRepository.goalById(id)
            done.value = true
        }
        return
    }
}