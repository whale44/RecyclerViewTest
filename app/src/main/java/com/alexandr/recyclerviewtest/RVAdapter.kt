package com.alexandr.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RVAdapter(private val persons: List<Person>, private val onClickListener: View.OnClickListener)
    : RecyclerView.Adapter<PersonViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PersonViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup,
                false)
        view.setOnClickListener(onClickListener)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int = persons.size

    override fun onBindViewHolder(personViewHolder: PersonViewHolder, i: Int) {
        with(personViewHolder) {
            personName.text = persons[i].name
            personAge.text = persons[i].age
            personPhoto.setImageResource(persons[i].photoId)
        }
    }
}