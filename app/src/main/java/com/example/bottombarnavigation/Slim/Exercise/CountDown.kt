package com.example.bottombarnavigation.Slim.Exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.Daily.History.TaskHistory
import com.example.bottombarnavigation.Slim.Exercise.History.ExerciseHistory
import kotlinx.android.synthetic.main.activity_count_down.*
import java.time.LocalDateTime

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class CountDown : AppCompatActivity() {

    var date : String = ""
    var exercise : String = ""
    var duration : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_down)

        val intent: Intent = getIntent()
        exercise = getIntent().getStringExtra("activity")
        duration = getIntent().getStringExtra("duration")

        button_start.setOnClickListener {

            simpleChronometer.start()
        }

        button_stop.setOnClickListener {

            simpleChronometer.stop()

            var dateTime : LocalDateTime = LocalDateTime.now()
            date = dateTime.toString()

            val intent = Intent(this, ExerciseHistory::class.java)

            intent.putExtra("date",date)
            intent.putExtra("exercise" , exercise)
            intent.putExtra("duration" , duration)
            //start the second activity
            startActivity(intent)

        }

        button_restart.setOnClickListener {
            simpleChronometer.setBase(SystemClock.elapsedRealtime())
        }

    }
}
