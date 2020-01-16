package com.example.bottombarnavigation.Slim.Daily


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.Daily.History.TaskHistory
import kotlinx.android.synthetic.main.activity_daily_task.*
import java.time.LocalDateTime


/**
 * A simple [Fragment] subclass.
 */
class Task : Fragment() {

    var noTask : Int = 0
    var mark : Double = 0.0



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


    fun saveRecord(){

        val dateTime = LocalDateTime.now()
        val date = dateTime.toString()
        val noTask  = noTask.toString()
        val mark = mark.toString()


        val intent = Intent(activity, TaskHistory::class.java)

        intent.putExtra("date",date)
        intent.putExtra("noTask" , noTask)
        intent.putExtra("mark" , mark)
        //start the second activity
        startActivity(intent)




    }

    fun check(){



        checkBox_done1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done1.isChecked){
                noTask = noTask + 1
            }
        }

        checkBox_done2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done2.isChecked){
                noTask = noTask + 1
            }
        }

        checkBox_done3.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done3.isChecked){
                noTask = noTask + 1
            }
        }

        checkBox_done4.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done4.isChecked){
                noTask = noTask + 1
            }
        }

        checkBox_done5.setOnCheckedChangeListener { buttonView, isChecked ->
            if(checkBox_done5.isChecked){
                noTask = noTask + 1
            }
        }


        button_done.setOnClickListener {

            mark = noTask * 12.5
            saveRecord()
        }

    }
}// Required empty public constructor
