package com.calebgraves.cs2410finalassignment.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.models.Event
import com.calebgraves.cs2410finalassignment.repository.EventsRepository
import com.calebgraves.cs2410finalassignment.repository.GoalsRepository
import com.calebgraves.cs2410finalassignment.repository.JournalEntriesRepository
import kotlinx.coroutines.launch

class EventsViewModel: ViewModel() {
    val events = ObservableArrayList<Event>()
    init {
        loadEntries()
    }

    private fun loadEntries() {
        viewModelScope.launch {
            val loadedEvents = EventsRepository.getAllEvents()
            events.addAll(loadedEvents)
        }
    }
}