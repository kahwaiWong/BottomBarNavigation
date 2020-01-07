package com.example.bottombarnavigation.Slim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_daily_task.*

class DailyTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_task)

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
            Toast.makeText(this,"Total mark is " + mark.toString() , Toast.LENGTH_SHORT ).show()
        }

    }
}
