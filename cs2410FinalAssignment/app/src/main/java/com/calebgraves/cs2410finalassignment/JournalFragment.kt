package com.calebgraves.cs2410finalassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.Adapters.JournalAdapter
import com.calebgraves.cs2410finalassignment.databinding.FragmentJournalBinding
import com.calebgraves.cs2410finalassignment.viewModels.JournalViewModel

class JournalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentJournalBinding.inflate(inflater, container, false)
        val viewModel = JournalViewModel()

        binding.journalRecyclerView.adapter = JournalAdapter(viewModel.entries)
        binding.journalRecyclerView.layoutManager = LinearLayoutManager(context)

        binding.addJournalEntry.setOnClickListener {
            findNavController().navigate(R.id.journal_to_journal_entry_creation)
        }

        return binding.root
    }
}