package com.example.bottombarnavigation.Slim.Daily.History

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast

import com.example.bottombarnavigation.R
import com.example.bottombarnavigation.Slim.SlimMenu
import kotlinx.android.synthetic.main.activity_task_history.*


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class TaskHistory : AppCompatActivity() {


    var  date : String = ""
    var  noTask : String = ""
    var  mark : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_history)

        val intent: Intent = getIntent()
        date = intent.getStringExtra("date")
        noTask = getIntent().getStringExtra("noTask")
        mark = getIntent().getStringExtra("mark")

        val databaseHandler: DatabaseHandler =
            DatabaseHandler(this)
        if (date.trim() != "" && noTask.trim() != "" && mark.trim() != "") {
            val status = databaseHandler.addTaskHistory(
                ModelClass(
                    date,
                    noTask,
                    mark
                )
            )
            if (status > -1) {
                Toast.makeText(applicationContext, "record save", Toast.LENGTH_LONG).show()
            }

            viewRecord()

        }


        buttonClear.setOnClickListener {

            val databaseHandler: DatabaseHandler =
                DatabaseHandler(this)

            val status = databaseHandler.clearAll(
                ModelClass(
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
        val databaseHandler: DatabaseHandler =
            DatabaseHandler(this)
        val task : List<ModelClass> = databaseHandler.viewTask()
        val arrayDate = Array<String>(task.size){"null"}
        val arrayTaskNo = Array<String>(task.size){"null"}
        val arrayMark = Array<String>(task.size){"null"}

        var index = 0
        for(e in task){
            arrayDate[index] = e.date
            arrayTaskNo[index] = e.noTask
            arrayMark[index] = e.mark
            index++
        }

        val  myListAdapter = MyListAdapter(
            this,
            arrayDate,
            arrayTaskNo,
            arrayMark
        )
        taskList.adapter = myListAdapter

    }

    fun cancel(){

        val intent : Intent = Intent(this, SlimMenu::class.java)
        startActivity(intent)

    }

}
