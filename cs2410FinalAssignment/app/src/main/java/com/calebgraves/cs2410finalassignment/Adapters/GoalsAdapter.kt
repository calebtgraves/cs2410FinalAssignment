package com.calebgraves.cs2410finalassignment.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.GoalListItemBinding
import com.calebgraves.cs2410finalassignment.models.Goal
import java.time.LocalDate

class GoalsAdapter (val goals: ObservableArrayList<Goal>): RecyclerView.Adapter<GoalsAdapter.ViewHolder>() {

    class ViewHolder(val binding: GoalListItemBinding): RecyclerView.ViewHolder(binding.root)

    init {
        goals.addOnListChangedCallback(object : ObservableList.OnListChangedCallback<ObservableArrayList<Goal>>(){
            override fun onChanged(sender: ObservableArrayList<Goal>?) {
                notifyDataSetChanged()
            }

            override fun onItemRangeChanged(
                sender: ObservableArrayList<Goal>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemChanged(positionStart)
            }

            override fun onItemRangeInserted(
                sender: ObservableArrayList<Goal>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemInserted(positionStart)
            }

            override fun onItemRangeMoved(
                sender: ObservableArrayList<Goal>?,
                fromPosition: Int,
                toPosition: Int,
                itemCount: Int
            ) {

            }

            override fun onItemRangeRemoved(
                sender: ObservableArrayList<Goal>?,
                positionStart: Int,
                itemCount: Int
            ) {
               notifyItemRemoved(positionStart)
            }

        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GoalListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val goal = goals[position]
        holder.binding.eventTitle.text = goal.title.toString()
        val startDate = "${LocalDate.ofEpochDay(goal.startDate).month.toString().slice(IntRange(0,2))} ${LocalDate.ofEpochDay(goal.startDate).dayOfMonth}"
        val endDate = "${LocalDate.ofEpochDay(goal.endDate).month.toString().slice(IntRange(0,2))} ${LocalDate.ofEpochDay(goal.endDate).dayOfMonth}"
        holder.binding.eventDate.text = "${startDate} - ${endDate}"
    }

    override fun getItemCount(): Int {
        return goals.size
    }
}