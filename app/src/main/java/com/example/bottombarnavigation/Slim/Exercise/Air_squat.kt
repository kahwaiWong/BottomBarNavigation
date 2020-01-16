package com.example.bottombarnavigation.Slim.Exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_air_squat.*


class Air_squat : AppCompatActivity() {

    var exercise : String =  ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_squat)

        val intent: Intent = getIntent()
        exercise = intent.getStringExtra("exercise")

        button.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            intent.putExtra("activity" , exercise)
            intent.putExtra("duration" , "15")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent : Intent = Intent(this
                , CountDown::class.java)
            intent.putExtra("activity" , exercise)
            intent.putExtra("duration" , "30")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent : Intent = Intent(this
                , CountDown::class.java)
            intent.putExtra("activity" , exercise)
            intent.putExtra("duration" , "45")
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            intent.putExtra("activity" , exercise)
            intent.putExtra("duration" , "60")
            startActivity(intent)
        }


    }
}
