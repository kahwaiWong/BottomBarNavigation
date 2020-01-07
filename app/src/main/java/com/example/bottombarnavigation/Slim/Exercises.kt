package com.example.bottombarnavigation.Slim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_exercises.*

class Exercises : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)

        button_exercise_start1.setOnClickListener {
            val intent: Intent = Intent(this, Walking_lunge::class.java)
            startActivity(intent)

        }

        button_exercise_start2.setOnClickListener {
            val intent: Intent = Intent(this, Backward_lunge::class.java)
            startActivity(intent)

        }

        button_exercise_start3.setOnClickListener {
            val intent: Intent = Intent(this, Air_squat::class.java)
            startActivity(intent)

        }
        button_exercise_start4.setOnClickListener {
            val intent: Intent = Intent(this, Shoulder_bridge::class.java)
            startActivity(intent)

        }
    }
}
