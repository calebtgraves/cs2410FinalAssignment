package com.calebgraves.cs2410finalassignment.fragments

import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.calebgraves.cs2410finalassignment.R
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalEditorBinding
import com.calebgraves.cs2410finalassignment.models.Goal
import com.calebgraves.cs2410finalassignment.viewModels.GoalEditViewModel
import java.time.LocalDate

class GoalEditorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentGoalEditorBinding.inflate(inflater, container, false)
        val viewModel = GoalEditViewModel()

        val id = arguments?.get("goalId") as Long
        var title = arguments?.get("goalTitle") as String
        var category = arguments?.get("goalCategory") as String
        var endDate = arguments?.get("goalEndDate") as Long
        var startDate = arguments?.get("goalStartDate") as Long
        var description = arguments?.get("goalDescription") as String

        binding.goalTitleField.text = SpannableStringBuilder(title)
        binding.goalCategoryField.text = SpannableStringBuilder(category)
        binding.goalStartDateField.text = SpannableStringBuilder(LocalDate.ofEpochDay(startDate).toString())
        binding.goalEndDateField.text = SpannableStringBuilder(LocalDate.ofEpochDay(endDate).toString())
        binding.goalDescriptionField.text = SpannableStringBuilder(description)

        binding.goalStartDateField.setOnClickListener {

        }

        binding.goalEndDateField.setOnClickListener {

        }

        viewModel.errorMessage.observe(viewLifecycleOwner) {
            binding.goalEditError.text = viewModel.errorMessage.value
        }

        binding.saveGoalButton.setOnClickListener {
            title = binding.goalTitleField.text.toString()
            category = binding.goalCategoryField.text.toString()
            description =  binding.goalDescriptionField.text.toString()
            viewModel.editGoal(id = id, title = title, category = category, description = description, startDate = LocalDate.now().toEpochDay(), endDate = LocalDate.now().toEpochDay())
        }

        viewModel.done.observe(viewLifecycleOwner) {
            if (it) {
                val bundle = bundleOf("goalId" to id)
                findNavController().navigate(R.id.goal_editor_to_goal, bundle)
            }
        }

        return binding.root
    }
}