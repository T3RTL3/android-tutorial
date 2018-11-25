package com.example.kotlinapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinapplication.R.id.parent
import kotlinx.android.synthetic.main.list_item.view.*

//HobbiesAdapter contructor context Context and name of list(Hobbies)
class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
         //To change body of created functions use File | Settings | File Templates.

        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false )

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  hobbies.size//To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val hobby = hobbies[position]
        holder.setData(hobby)

    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun setData(hobby: Hobby?){
            itemView.txvTitle.text = hobby!!.title
        }
    }
}