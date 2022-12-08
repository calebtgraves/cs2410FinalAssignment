package com.calebgraves.cs2410finalassignment.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.EventListItemBinding
import com.calebgraves.cs2410finalassignment.models.Event
import java.time.LocalDateTime
import java.time.ZoneOffset

class EventsAdapter (val events: ObservableArrayList<Event>): RecyclerView.Adapter<EventsAdapter.ViewHolder>() {

    class ViewHolder(val binding: EventListItemBinding): RecyclerView.ViewHolder(binding.root)

    init {
        events.addOnListChangedCallback(object : ObservableList.OnListChangedCallback<ObservableArrayList<Event>>(){
            override fun onChanged(sender: ObservableArrayList<Event>?) {
                notifyDataSetChanged()
            }

            override fun onItemRangeChanged(
                sender: ObservableArrayList<Event>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemChanged(positionStart)
            }

            override fun onItemRangeInserted(
                sender: ObservableArrayList<Event>?,
                positionStart: Int,
                itemCount: Int
            ) {
                notifyItemInserted(positionStart)
            }

            override fun onItemRangeMoved(
                sender: ObservableArrayList<Event>?,
                fromPosition: Int,
                toPosition: Int,
                itemCount: Int
            ) {

            }

            override fun onItemRangeRemoved(
                sender: ObservableArrayList<Event>?,
                positionStart: Int,
                itemCount: Int
            ) {
               notifyItemRemoved(positionStart)
            }

        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = EventListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entry = events[position]
        holder.binding.eventTitle.text = entry.title
        holder.binding.eventDate.text = LocalDateTime.ofEpochSecond(entry.startDate,0, ZoneOffset.of("Z+07:00")).toString()
    }

    override fun getItemCount(): Int {
        return events.size
    }
}