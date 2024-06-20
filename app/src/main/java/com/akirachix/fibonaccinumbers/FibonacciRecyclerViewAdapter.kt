package com.akirachix.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonacciRecyclerViewAdapter(private val fibonacciNumbers: List<Int>):
    RecyclerView.Adapter<FibonacciRecyclerViewAdapter.viewHolder>(){
        override fun onCreateViewHolder(parent:viewGroup,viewType:Int):viewHolder{
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.fibonacciseries,parent,false)
            return ViewHolder(view)
        }
    override fun onBindViewHolder(holder:ViewHolder,position: Int){
        holder.bind(fibonacciNumbers[position])
    }
    override fun getItemCount():Int{
        return fibonacciNumbers.size
    }
    class viewHolder(view: View):RecyclerView.ViewHolder(view){
        private val textView:TextView = view.findViewById(R.id.fibonacci_text_view)
        fun  bind(fibonacciNumber: Int){
            textView.text = fibonacciNumber.toString()
        }
    }
}











