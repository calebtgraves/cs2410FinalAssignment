package com.calebgraves.cs2410finalassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.databinding.FragmentJournalBinding

class JournalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentJournalBinding.inflate(inflater, container, false)


        binding.journalRecyclerView.adapter = JournalAdapter()
        binding.journalRecyclerView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }
}