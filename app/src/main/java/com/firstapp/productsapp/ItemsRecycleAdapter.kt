package com.firstapp.productsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsRecycleAdapter(val context: Context, val items: List <Items>) : RecyclerView.Adapter<ItemsRecycleAdapter.ViewHolder>() {

        val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =layoutInflater.inflate(R.layout.list_products, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.nameTextView.text = item.name
        holder.priceTextView.text = item.price.toString()
        holder.imageView.setImageResource(item.picture)
        holder.checkButton.isChecked = item.have

    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        val priceTextView = itemView.findViewById<TextView>(R.id.priceTextView)
        val checkButton = itemView.findViewById<CheckBox>(R.id.checkBox)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView2)

       }
    }

