package com.calebgraves.cs2410finalassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding

class JournalAdapter (): RecyclerView.Adapter<JournalAdapter.ViewHolder>() {

    class ViewHolder(val binding: JournalListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = JournalListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}