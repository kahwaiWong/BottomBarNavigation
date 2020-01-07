package com.example.bottombarnavigation.Slim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_walking_lunge.*

class Walking_lunge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walking_lunge)

        button.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent : Intent = Intent(this , CountDown::class.java)
            startActivity(intent)
        }
    }
}
