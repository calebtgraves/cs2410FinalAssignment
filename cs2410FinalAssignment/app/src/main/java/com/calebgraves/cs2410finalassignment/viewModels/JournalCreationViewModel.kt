package com.calebgraves.cs2410finalassignment.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.JournalEntry
import com.calebgraves.cs2410finalassignment.repository.JournalEntriesRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class JournalCreationViewModel: ViewModel() {
    val errorMessage = MutableLiveData("")
    val done = MutableLiveData(false)

    fun createJournalEntry(date: Long, title: String, content: String) {
        if (content.isEmpty()) {
            errorMessage.value = "Journal Entry Content field must not be empty."
            viewModelScope.launch {
                delay(6000)
                errorMessage.value = ""
            }
        }
        else {
            viewModelScope.launch {
                val entry = JournalEntry(0, date, title, content)
                JournalEntriesRepository.createJournalEntry(entry)
                done.value = true
            }
        }
        return
    }
}