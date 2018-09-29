package com.alexandr.recyclerviewtest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        with(rv) {
            layoutManager = LinearLayoutManager(applicationContext)
            setHasFixedSize(true)
            adapter = RVAdapter(Model.persons, View.OnClickListener {
                val itemPosition = getChildLayoutPosition(it)
                val intent = Intent(applicationContext, CardViewActivity::class.java)
                intent.putExtra(Model.EXTRA_PUT_NAME, itemPosition)
                startActivity(intent)
            })
        }
    }
}
