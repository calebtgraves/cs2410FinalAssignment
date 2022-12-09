package com.calebgraves.cs2410finalassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.calebgraves.cs2410finalassignment.R
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalBinding
import com.calebgraves.cs2410finalassignment.viewModels.GoalViewModel
import java.time.LocalDate

class GoalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGoalBinding.inflate(inflater, container, false)
        val viewModel = GoalViewModel()
        viewModel.goalById(arguments?.get("goalId") as Long)

        viewModel.done.observe(viewLifecycleOwner) {
            val goal = viewModel.goal.value!!
            binding.goalTitleField.text = goal.title
            binding.goalCategoryField.text = goal.category
            binding.goalStartDateField.text = LocalDate.ofEpochDay(goal.startDate).toString()
            binding.goalEndDateField.text = LocalDate.ofEpochDay(goal.endDate).toString()
            binding.goalDescriptionField.text = goal.description
            binding.editGoal.setOnClickListener {

                val bundle = bundleOf("goal" as)
                findNavController().navigate(R.id.goal_to_goal_editor)
            }
        }

        binding.backToGoals.setOnClickListener {
            findNavController().navigate(R.id.goal_to_goals)
        }

        return binding.root
    }
}