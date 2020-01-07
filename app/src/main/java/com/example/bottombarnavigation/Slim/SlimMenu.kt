package com.example.bottombarnavigation.Slim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_slim_menu.*

class SlimMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slim_menu)


        imageButton_task.setOnClickListener {
            val intent : Intent = Intent(this, DailyTask::class.java)

            startActivity(intent)
        }

        imageViewExecise.setOnClickListener{
            val intent:Intent = Intent(this , Exercises::class.java)
            startActivity(intent)
        }
    }
}
