package com.varand.varandkotlinpjo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DisneyRecyclerClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = arrayListOf<String>("  Charecters", "  Cartoons List", "  Pixar", "  About Disney")

        val adapter = TestKotlinRecyclerAdapter(list, this)
        recycler.adapter = adapter


    }

    override fun onclick(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}

