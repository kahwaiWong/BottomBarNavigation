package com.example.bottombarnavigation.Slim

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.Daily.Task
import com.example.bottombarnavigation.Slim.Diet.Diet
import com.example.bottombarnavigation.Slim.Exercise.Exercise
import com.google.android.material.tabs.TabLayout

class SlimMenu : AppCompatActivity() {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slim_menu)

        var toolbar : androidx.appcompat.widget.Toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        var toolbarTab :androidx.appcompat.widget.Toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbartab)
        var viewPager : ViewPager = findViewById<ViewPager>(R.id.viewpager)
        var tabLayout : TabLayout = findViewById<TabLayout>(R.id.tablayout)

        setSupportActionBar(toolbar)

        var  pageAdapter = PageAdapter(supportFragmentManager)
        pageAdapter.addFragment(Task(), "Daily Task")
        pageAdapter.addFragment(Exercise(), "Exercise")
        pageAdapter.addFragment(Diet(), "Diet")


        viewPager.adapter = pageAdapter

        tabLayout.setupWithViewPager(viewPager)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        window.statusBarColor = Color.RED
                        toolbar.setBackgroundColor(Color.RED)
                        toolbarTab.setBackgroundColor(Color.RED)
                        tabLayout.setBackgroundColor(Color.RED)
                    }

                    1 -> {
                        window.statusBarColor = Color.GREEN
                        toolbar.setBackgroundColor(Color.GREEN)
                        toolbarTab.setBackgroundColor(Color.GREEN)
                        tabLayout.setBackgroundColor(Color.GREEN)
                    }

                    2 -> {
                        window.statusBarColor = Color.BLUE
                        toolbar.setBackgroundColor(Color.BLUE)
                        toolbarTab.setBackgroundColor(Color.BLUE)
                        tabLayout.setBackgroundColor(Color.BLUE)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }
}
