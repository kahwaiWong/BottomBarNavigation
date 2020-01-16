package com.example.bottombarnavigation.Slim.Exercise.History

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.bottombarnavigation.R

class MyListAdapter2(private val context:Activity,
                     private  val date:Array<String>,
                     private val  exercise : Array<String>,
                     private val duration: Array<String>):
    ArrayAdapter<String>(context, R.layout.activity_exercise_list , date) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_exercise_list,parent,false)
        val dateText = rowView.findViewById(R.id.textViewDateTime) as TextView
        val exerciseText = rowView.findViewById(R.id.textViewExercise) as TextView
        val durationText = rowView.findViewById(R.id.textViewDuration) as TextView


        dateText.text = "Date : ${date[position]}"
        exerciseText.text = "Exercise : ${exercise[position]}"
        durationText.text = "Duration : ${duration[position]} minutes"


        return rowView
    }
}