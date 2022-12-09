package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.models.JournalEntry
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import com.calebgraves.cs2410finalassignment.repository.JournalEntriesRepository
import kotlinx.coroutines.launch
import java.time.LocalDate

class JournalCreationViewModel: ViewModel() {
    val errorMessage = MutableLiveData("")
    val done = MutableLiveData(false)

    fun createJournalEntry(date: Long, title: String, content: String) {
        errorMessage.value = ""
        viewModelScope.launch {
            val entry = JournalEntry(0, date, title, content)
            JournalEntriesRepository.createJournalEntry(entry)
            done.value = true
        }
        return
    }
}