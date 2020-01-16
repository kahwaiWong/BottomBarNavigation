package com.example.bottombarnavigation.Slim.Exercise


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.Air_squat
import com.example.bottombarnavigation.Slim.Backward_lunge
import com.example.bottombarnavigation.Slim.Shoulder_bridge
import com.example.bottombarnavigation.Slim.Walking_lunge
import kotlinx.android.synthetic.main.activity_exercises.*


/**
 * A simple [Fragment] subclass.
 */
class Exercise : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_exercise, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_exercise_start1.setOnClickListener {
            val intent: Intent = Intent(activity, Walking_lunge::class.java)
            startActivity(intent)

        }

        button_exercise_start2.setOnClickListener {
            val intent: Intent = Intent(activity, Backward_lunge::class.java)
            startActivity(intent)

        }

        button_exercise_start3.setOnClickListener {
            val intent: Intent = Intent(activity, Air_squat::class.java)
            startActivity(intent)

        }
        button_exercise_start4.setOnClickListener {
            val intent: Intent = Intent(activity, Shoulder_bridge::class.java)
            startActivity(intent)

        }
    }
}// Required empty public constructor
