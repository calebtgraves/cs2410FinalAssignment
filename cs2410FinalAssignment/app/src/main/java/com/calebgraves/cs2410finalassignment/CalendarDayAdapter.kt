package com.calebgraves.cs2410finalassignment

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.calebgraves.cs2410finalassignment.databinding.CalendarDayListItemBinding

class CalendarDayAdapter (): RecyclerView.Adapter<CalendarDayAdapter.ViewHolder>() {

    class ViewHolder(val binding: CalendarDayListItemBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CalendarDayListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.viewTreeObserver.addOnGlobalLayoutListener(object:
            ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                val scrollView = holder.binding.scrollView
                scrollView.scrollTo(0, 1285)

                holder.itemView.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })
    }

    override fun getItemCount(): Int {
        return 300
    }
}
