package com.alexandr.recyclerviewtest

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.item.*

class CardViewActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        val itemPosition = intent?.getIntExtra(Model.EXTRA_PUT_NAME, 0) ?: 0
        with(Model.persons[itemPosition]){
            personName.text = name
            personAge.text = age
            personPhoto.setImageResource(photoId)
        }
    }
}
