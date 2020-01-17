package com.example.bottombarnavigation.Cosmetic

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.bottombarnavigation.R

class DisplayFoundationMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_foundationmenu)

        findViewById<ImageView>(R.id.imageViewFoundation).setOnClickListener {
            showFoundationMenu1Detail()
        }
    }

    private fun showFoundationMenu1Detail() {
        setContentView(R.layout.activity_display_foundationdetail)
    }

}
