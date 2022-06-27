package com.example.nestedrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NestedRecyclerAdapter(var list:List<Nested_Item> , contex: Context) : RecyclerView.Adapter<NestedRecyclerAdapter.ViewHolder>()    {

    var context: Context = contex

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var list1=list.get(position)
        holder.header.text=list1.title

        holder.items_view.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)

        holder.items_view.adapter=childAdapter(context,list1.list)

    }


    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var header = itemView.findViewById<TextView>(R.id.type)
        var items_view = itemView.findViewById<RecyclerView>(R.id.nested_recycler)
        override fun onClick(p0: View?) {

        }

    }



}