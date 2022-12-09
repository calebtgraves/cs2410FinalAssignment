package com.calebgraves.cs2410finalassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalsBinding
import com.calebgraves.cs2410finalassignment.viewModels.GoalsViewModel

class GoalsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentGoalsBinding.inflate(inflater, container, false)
        val viewModel = GoalsViewModel()

        binding.goalRecyclerView.adapter = GoalsAdapter(viewModel.goals)
        binding.goalRecyclerView.layoutManager = LinearLayoutManager(context)

        binding.addGoal.setOnClickListener {
            findNavController().navigate(R.id.goals_to_goal_creation)
        }

        return binding.root
    }
}