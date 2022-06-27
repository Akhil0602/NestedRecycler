package com.example.nestedrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class childAdapter(contex: Context,var list: List<MainChild>) : RecyclerView.Adapter<childAdapter.ViewHolder>() {


    var context: Context = contex

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item=list.get(position)
        holder.src.setImageResource(item.image)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var src = itemView.findViewById<ImageView>(R.id.image)

    }

}