package com.example.top10downloaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter (private val items:ArrayList<FeedEntry>): RecyclerView.Adapter<RVAdapter.RVViewHolder>() {
    class RVViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_row,
            parent,
            false
        )
        return RVViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RVViewHolder, position: Int) {

        holder.itemView.apply {
            textView.text=items[position].name
        }

    }

    override fun getItemCount()=items.size


}