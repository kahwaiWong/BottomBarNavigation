package com.example.bottombarnavigation.Cosmetic

import android.content.Intent
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.LinearLayout
import android.widget.ListView
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_cosmetic_menu.*
import kotlinx.android.synthetic.main.activity_eyes_main.*

class CosmeticMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cosmetic_menu)

        val button1 = findViewById<ImageView>(R.id.imageViewLip)
        val button2 = findViewById<ImageView>(R.id.imageViewEyes)
        val button3 = findViewById<ImageView>(R.id.imageViewFoundation)

        imageViewLip.setOnClickListener {
            val intent = Intent(this, DisplayLipMenuActivity::class.java)
               startActivity(intent)
        }

        button1.setOnClickListener {
            Toast.makeText(this, "Lip selected", Toast.LENGTH_SHORT).show()
            onClick(button1) }
        button2.setOnClickListener {
            Toast.makeText(this, "Eyes selected", Toast.LENGTH_SHORT).show()
            onClick(button2) }
        button3.setOnClickListener {
            Toast.makeText(this, "Foundation selected", Toast.LENGTH_SHORT).show()
            onClick(button3) }

    }

    fun onClick(v: View?) {
        when(v?.id) {
            R.id.imageViewEyes -> {
                val intent = Intent(this, DisplayEyesMenuActivity::class.java)
                startActivity(intent)
            }
            R.id.imageViewLip -> {
                val intent = Intent(this, DisplayLipMenuActivity::class.java)
                startActivity(intent)
            }else -> {
            val intent = Intent(this, DisplayFoundationMenuActivity::class.java)
            startActivity(intent)
        }

        }
    }

}
