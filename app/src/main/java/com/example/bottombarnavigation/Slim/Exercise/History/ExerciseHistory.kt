package com.example.bottombarnavigation.Slim.Exercise.History

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.Exercise.Exercise
import com.example.bottombarnavigation.Slim.SlimMenu
import kotlinx.android.synthetic.main.activity_exercise_history.*


class ExerciseHistory : AppCompatActivity() {

    var date : String = ""
    var exercise : String = ""
    var duration : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_history)

        val intent: Intent = getIntent()
        exercise = getIntent().getStringExtra("exercise")
        duration = getIntent().getStringExtra("duration")
        date = getIntent().getStringExtra("date")

        val databaseHandler: DatabaseHandler2 =
            DatabaseHandler2(this)
        if (date.trim() != "" && exercise.trim() != "" && duration.trim() != "") {
            val status = databaseHandler.addExerciseHistory(
                ModelClass2(
                    date,
                    exercise,
                    duration
                )
            )
            if (status > -1) {
                Toast.makeText(applicationContext, "record save", Toast.LENGTH_LONG).show()
            }

            viewRecord()
        }

        buttonClear.setOnClickListener {

            val databaseHandler: DatabaseHandler2 =
                DatabaseHandler2(this)

            val status = databaseHandler.clearAll(
                ModelClass2(
                    "",
                    "",
                    ""
                )
            )
            if(status > -1){
                Toast.makeText(applicationContext,"record deleted",Toast.LENGTH_LONG).show()
            }

            viewRecord()
        }

        button_back.setOnClickListener {
            cancel()
        }

    }


    fun viewRecord(){
        val databaseHandler: DatabaseHandler2 =
            DatabaseHandler2(this)
        val exercises : List<ModelClass2> = databaseHandler.viewExercise()
        val arrayDate = Array<String>(exercises.size){"null"}
        val arrayExercise = Array<String>(exercises.size){"null"}
        val arrayDuration = Array<String>(exercises.size){"null"}

        var index = 0
        for(e in exercises){
            arrayDate[index] = e.date
            arrayExercise[index] = e.exercise
            arrayDuration[index] = e.duration
            index++
        }

        val  myListAdapter = MyListAdapter2(
            this,
            arrayDate,
            arrayExercise,
            arrayDuration
        )

        ExerciseList.adapter = myListAdapter
    }

    fun cancel(){

        val intent : Intent = Intent(this, SlimMenu::class.java)
        startActivity(intent)


    }

}
