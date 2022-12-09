package com.calebgraves.cs2410finalassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.Adapters.EventsAdapter
import com.calebgraves.cs2410finalassignment.databinding.FragmentEventsBinding
import com.calebgraves.cs2410finalassignment.viewModels.EventsViewModel

class EventsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentEventsBinding.inflate(inflater, container, false)
        val viewModel = EventsViewModel()

        binding.eventRecyclerView.adapter = EventsAdapter(viewModel.events)
        binding.eventRecyclerView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }
}