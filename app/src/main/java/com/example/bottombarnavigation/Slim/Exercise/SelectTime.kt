package com.example.bottombarnavigation.Slim.Exercise


import android.content.Intent
import android.os.Bundle

import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bottombarnavigation.R
import kotlinx.android.synthetic.main.fragment_select_time.*


/**
 * A simple [Fragment] subclass.
 */
class SelectTime : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_time, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            val intent : Intent = Intent(activity , CountDown::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent : Intent = Intent(activity , CountDown::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent : Intent = Intent(activity , CountDown::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent : Intent = Intent(activity , CountDown::class.java)
            startActivity(intent)
        }
    }
}// Required empty public constructor
