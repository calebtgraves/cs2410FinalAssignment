package com.calebgraves.cs2410finalassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalsBinding
import com.calebgraves.cs2410finalassignment.databinding.FragmentJournalEntryCreationBinding
import com.calebgraves.cs2410finalassignment.viewModels.GoalsViewModel
import com.calebgraves.cs2410finalassignment.viewModels.JournalCreationViewModel
import java.time.LocalDate
import java.time.LocalDateTime


class JournalEntryCreationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentJournalEntryCreationBinding.inflate(inflater, container, false)
        val viewModel = JournalCreationViewModel()
        binding.journalEntryDate.text = LocalDate.now().toString()

        binding.saveJournalEntry.setOnClickListener {
            viewModel.createJournalEntry(LocalDate.now().toEpochDay(), binding.journalEntryCreationTitle.text.toString(), binding.journalEntryCreationContent.text.toString())
            findNavController().navigate(R.id.journal_entry_creation_to_journal)
        }

        return binding.root
    }
}