package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.models.JournalEntry
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import com.calebgraves.cs2410finalassignment.repository.JournalEntriesRepository
import kotlinx.coroutines.launch

class JournalViewModel: ViewModel() {
    val entries = ObservableArrayList<JournalEntry>()
    init {
        loadEntries()
    }

    private fun loadEntries() {
        viewModelScope.launch {
            val loadedEntries = JournalEntriesRepository.getAllJournalEntries()
            entries.addAll(loadedEntries)
        }
    }
}