package com.example.bottombarnavigation.Cosmetic

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.activity_eyes_main.*

class DisplayEyesMenuActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_eyemenu)

        findViewById<ImageView>(R.id.imageViewEyeMenu1).setOnClickListener {
            showEyesMenu1Detail()
        }
    }

    private fun showEyesMenu1Detail() {
        setContentView(R.layout.activity_display_eyedetail)
    }
}