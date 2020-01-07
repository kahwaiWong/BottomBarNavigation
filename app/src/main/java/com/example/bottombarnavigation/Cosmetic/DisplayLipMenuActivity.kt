package com.example.bottombarnavigation.Cosmetic

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.bottombarnavigation.R

class DisplayLipMenuActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_lipmenu)
        findViewById<ImageView>(R.id.imageViewLipMenu1).setOnClickListener {
            showLipMenu1Detail()
        }
    }

    private fun showLipMenu1Detail(){
        //val intent = Intent(this, DisplayLip1::class.java)
        //startActivity(intent)
        setContentView(R.layout.activity_display_lipdetail)
    }
}