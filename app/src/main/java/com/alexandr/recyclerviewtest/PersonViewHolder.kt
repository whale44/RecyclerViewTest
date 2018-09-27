package com.alexandr.recyclerviewtest

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cv: CardView = itemView.findViewById(R.id.cv) as CardView
    val personName: TextView = itemView.findViewById(R.id.personName) as TextView
    val personAge: TextView = itemView.findViewById(R.id.personAge) as TextView
    val personPhoto: ImageView = itemView.findViewById(R.id.personPhoto) as ImageView
}