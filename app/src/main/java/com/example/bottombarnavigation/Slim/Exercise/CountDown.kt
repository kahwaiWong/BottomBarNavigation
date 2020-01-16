package com.example.bottombarnavigation.Slim.Exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_count_down.*

class CountDown : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_down)

        button_start.setOnClickListener {
            simpleChronometer.start()
        }

        button_stop.setOnClickListener {
            simpleChronometer.stop()
        }

        button_restart.setOnClickListener {
            simpleChronometer.setBase(SystemClock.elapsedRealtime())
        }

    }
}
