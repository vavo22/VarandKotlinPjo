package com.varand.varandkotlinpjo

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.disney_items.view.*

public class TestKotlinRecyclerAdapter(val names : List<String>, val clickListener: DisneyRecyclerClickListener) : RecyclerView.Adapter<TestKotlinRecyclerAdapter.TestRecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestRecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.disney_items,parent,false)
        return TestRecyclerViewHolder(v,clickListener)
    }

    override fun getItemCount() = names.size

    override fun onBindViewHolder(holder: TestRecyclerViewHolder, position: Int) {
        holder.onBind(names[position])

    }

    class TestRecyclerViewHolder(val item: View, val  clickListener: DisneyRecyclerClickListener) : RecyclerView.ViewHolder(item) {

        fun onBind(name: String){
            if (adapterPosition == 0)
                item.txtItem.setCompoundDrawablesWithIntrinsicBounds(R.drawable.charecter,0,0,0)
            else if (adapterPosition == 1)
                item.txtItem.setCompoundDrawablesWithIntrinsicBounds(R.drawable.cartoonlist,0,0,0)
            else if (adapterPosition == 2)
                item.txtItem.setCompoundDrawablesWithIntrinsicBounds(R.drawable.pixcel,0,0,0)
            else if (adapterPosition == 3)
                item.txtItem.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aboutus,0,0,0)


            item.txtItem.text = name
            item.setOnClickListener{
                clickListener.onclick(name)
            }


        }

    }

}