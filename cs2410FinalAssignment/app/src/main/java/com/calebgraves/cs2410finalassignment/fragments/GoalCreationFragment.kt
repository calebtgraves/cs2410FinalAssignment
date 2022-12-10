package com.calebgraves.cs2410finalassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.calebgraves.cs2410finalassignment.R
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalCreationBinding
import com.calebgraves.cs2410finalassignment.viewModels.GoalCreationViewModel
import java.time.LocalDate

class GoalCreationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentGoalCreationBinding.inflate(inflater, container, false)
        val viewModel = GoalCreationViewModel()

        binding.goalStartDateField.setOnClickListener {

        }

        binding.goalEndDateField.setOnClickListener {

        }

        viewModel.errorMessage.observe(viewLifecycleOwner) {
            binding.goalCreationError.text = viewModel.errorMessage.value
        }

        binding.createGoal.setOnClickListener {
            val title = binding.goalTitleField.text.toString()
            val category = binding.goalCategoryField.text.toString()
            val description =  binding.goalDescriptionField.text.toString()
            viewModel.createGoal(title = title, category = category, description = description, startDate = LocalDate.now().toEpochDay(), endDate = LocalDate.now().toEpochDay())
        }

        viewModel.done.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigate(R.id.goal_creation_to_goals)
            }
        }

        return binding.root
    }
}