package com.varand.varandkotlinpjo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.recycler
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(),TestRecyclerClickListener {
    private val listItem: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val listItem= arrayListOf(" Name","Family","Gender","Nationality","Setting","....","....","....","....","....")

        recycler.layoutManager = LinearLayoutManager(this)
        val adapter=ListAdapter(listItem,this)
        recycler.adapter=adapter
//        val button1 = button1
        button1.setOnClickListener()
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
    override fun onClick(name: String?) {
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
    }

}
