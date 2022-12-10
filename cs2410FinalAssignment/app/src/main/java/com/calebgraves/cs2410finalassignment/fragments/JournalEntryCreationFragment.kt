package com.calebgraves.cs2410finalassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.calebgraves.cs2410finalassignment.R
import com.calebgraves.cs2410finalassignment.databinding.FragmentJournalEntryCreationBinding
import com.calebgraves.cs2410finalassignment.viewModels.JournalCreationViewModel
import java.time.LocalDate


class JournalEntryCreationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentJournalEntryCreationBinding.inflate(inflater, container, false)
        val viewModel = JournalCreationViewModel()
        binding.journalEntryDate.text = LocalDate.now().toString()

        viewModel.errorMessage.observe(viewLifecycleOwner) {
            binding.journalEntryCreationError.text = viewModel.errorMessage.value
        }

        binding.saveJournalEntry.setOnClickListener {
            viewModel.createJournalEntry(LocalDate.now().toEpochDay(), binding.journalEntryCreationTitle.text.toString(), binding.journalEntryCreationContent.text.toString())
        }

        viewModel.done.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigate(R.id.journal_entry_creation_to_journal)
            }
        }
        return binding.root
    }
}