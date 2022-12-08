package com.calebgraves.cs2410finalassignment.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding
import com.calebgraves.cs2410finalassignment.models.Goal

class GoalsAdapter (val goals: ObservableArrayList<Goal>): RecyclerView.Adapter<GoalsAdapter.ViewHolder>() {

    class ViewHolder(val binding: JournalListItemBinding): RecyclerView.ViewHolder(binding.root)

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
        val binding = JournalListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entry = goals[position]
        holder.binding.journalEntryTitle.text = entry.title
    }

    override fun getItemCount(): Int {
        return goals.size
    }
}