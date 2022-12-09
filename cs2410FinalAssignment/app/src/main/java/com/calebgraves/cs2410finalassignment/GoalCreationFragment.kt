package com.calebgraves.cs2410finalassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter
import com.calebgraves.cs2410finalassignment.databinding.FragmentGoalCreationBinding
import com.calebgraves.cs2410finalassignment.viewModels.GoalCreationViewModel
import com.calebgraves.cs2410finalassignment.viewModels.GoalsViewModel
import java.time.LocalDate
import java.time.LocalTime

class GoalCreationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentGoalCreationBinding.inflate(inflater, container, false)
        val viewModel = GoalCreationViewModel()

        binding.createGoalButton.setOnClickListener {
            val title = binding.goalTitleField.text.toString()
            val category = binding.goalCategoryField.text.toString()
            val description =  "Value"//binding.goalDescriptionField.text.toString()
            viewModel.createGoal(title, category, description, LocalDate.now().toEpochDay(), LocalDate.now().toEpochDay())
            findNavController().navigate(R.id.goal_creation_to_goals)
        }

        return binding.root
    }
}