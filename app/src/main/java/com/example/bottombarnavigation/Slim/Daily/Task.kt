package com.example.bottombarnavigation.Slim.Daily


import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_daily_task.*


/**
 * A simple [Fragment] subclass.
 */
class Task : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        check()

    }

    fun check(){

        var mark : Int = 0

        checkBox_done1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done1.isChecked){
                mark = mark + 1
            }
        }

        checkBox_done2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done2.isChecked){
                mark = mark + 1
            }
        }

        checkBox_done3.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done3.isChecked){
                mark = mark + 1
            }
        }

        checkBox_done4.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done4.isChecked){
                mark = mark + 1
            }
        }

        checkBox_done5.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done5.isChecked){
                mark = mark + 1
            }
        }


        button_done.setOnClickListener {
            Toast.makeText(getActivity(),"Total mark is " + mark.toString() , Toast.LENGTH_SHORT ).show()

        }

    }
}// Required empty public constructor
