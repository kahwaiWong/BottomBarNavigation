package com.example.bottombarnavigation.Slim.Daily.History

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.bottombarnavigation.R

class MyListAdapter(private val context:Activity ,
                    private  val date:Array<String>,
                    private val  noTask : Array<String> ,
                    private val mark: Array<String>):
    ArrayAdapter<String>(context, R.layout.activity_task_list , date) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_task_list,parent,false)
        val dateText = rowView.findViewById(R.id.textViewDateTime) as TextView
        val noTaskText = rowView.findViewById(R.id.textViewExercise) as TextView
        val markText = rowView.findViewById(R.id.textViewDuration) as TextView


        dateText.text = "Date : ${date[position]}"
        noTaskText.text = "No of completed task : ${noTask[position]}"
        markText.text = "Total Mark : ${mark[position]}"



        return rowView
    }
}