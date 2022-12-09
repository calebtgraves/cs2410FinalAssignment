package com.calebgraves.cs2410finalassignment.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding
import com.calebgraves.cs2410finalassignment.models.JournalEntry
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset

class JournalAdapter (val entries: ObservableArrayList<JournalEntry>): RecyclerView.Adapter<JournalAdapter.ViewHolder>() {

    class ViewHolder(val binding: JournalListItemBinding): RecyclerView.ViewHolder(binding.root)

    init {
        entries.addOnListChangedCallback(object : ObservableList.OnListChangedCallback<ObservableArrayList<JournalEntry>>(){
            override fun onChanged(sender: ObservableArrayList<JournalEntry>?) {
                notifyDataSetChanged()
            }

            override fun onItemRangeChanged(
                sender: ObservableArrayList<JournalEntry>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemChanged(positionStart)
            }

            override fun onItemRangeInserted(
                sender: ObservableArrayList<JournalEntry>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemInserted(positionStart)
            }

            override fun onItemRangeMoved(
                sender: ObservableArrayList<JournalEntry>?,
                fromPosition: Int,
                toPosition: Int,
                itemCount: Int
            ) {

            }

            override fun onItemRangeRemoved(
                sender: ObservableArrayList<JournalEntry>?,
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
        val entry = entries[position]
        holder.binding.journalEntryTitle.text = entry.title
        holder.binding.entryContentPreview.text = entry.content
        holder.binding.entryDate.text = LocalDate.ofEpochDay(entry.date).toString()
    }

    override fun getItemCount(): Int {
        return entries.size
    }
}