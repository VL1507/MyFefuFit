package com.example.myfefufit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class lab4_MySportsAdapter(
    private val items: List<lab4_MySportsItem>,
    private val onItemClick: (Int) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_HEADER = 0
        private const val TYPE_ITEM = 1
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is lab4_MySportsItem.Header -> TYPE_HEADER
            is lab4_MySportsItem.Activity -> TYPE_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HEADER -> HeaderViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.lab4_list_item_heading_text, parent, false)
            )

            else -> ActivityViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.lab4_list_item_my_sports, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = items[position]) {
            is lab4_MySportsItem.Header -> (holder as HeaderViewHolder).bind(item)
            is lab4_MySportsItem.Activity -> (holder as ActivityViewHolder).bind(item, onItemClick)
        }
    }

    override fun getItemCount(): Int = items.size

    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val dateText: TextView = view.findViewById(R.id.date_text)

        fun bind(item: lab4_MySportsItem.Header) {
            dateText.text = item.date
        }
    }

    class ActivityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val typeCaption: TextView = view.findViewById(R.id.TypeCaption)
        private val progressCaption: TextView = view.findViewById(R.id.ProgressCaption)
        private val timeProgressCaption: TextView = view.findViewById(R.id.TimeProgressCaption)
        private val dateCaption: TextView = view.findViewById(R.id.DateCaption)

        fun bind(item: lab4_MySportsItem.Activity, onItemClick: (Int) -> Unit) {
            typeCaption.text = item.typeCaption
            progressCaption.text = item.progressCaption
            timeProgressCaption.text = item.timeProgressCaption
            dateCaption.text = item.dateCaption

            itemView.setOnClickListener { onItemClick(item.id) }
        }
    }
}