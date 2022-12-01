package com.calebgraves.cs2410finalassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.CalendarDayListItemBinding

class CalendarDayAdapter (): RecyclerView.Adapter<CalendarDayAdapter.ViewHolder>() {

    class ViewHolder(val binding: CalendarDayListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CalendarDayListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val targetView = binding.constraintLayout40
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 300
    }
}