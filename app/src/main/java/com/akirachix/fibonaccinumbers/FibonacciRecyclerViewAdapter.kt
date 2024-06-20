package com.akirachix.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder

  class FibonacciRecyclerViewAdapter(val fibonacciNumbers: List<Int>):
    RecyclerView.Adapter<FibonacciRecyclerViewAdapter.ViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fibonacciseries,parent,false)
            return ViewHolder(view)
        }
     override fun onBindViewHolder(holder:ViewHolder,position: Int){
        holder.tvName.text=fibonacciNumbers[position].toString()
    }
    override fun getItemCount():Int{
        return fibonacciNumbers.size
    }
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var tvName = view.findViewById<TextView>(R.id.tvName)
    }
}











