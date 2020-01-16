package com.example.bottombarnavigation.Slim.Daily.History

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler(context: Context):SQLiteOpenHelper(context,
    DATABASE_NAME,null,
    DATABASE_VERSION
) {

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "DailyTaskDatabase"
        private val TABLE_CONTACTS = "DailyTaskTable"
        private val KEY_DATE = "date"
        private val KEY_NOTASK = "noTask"
        private val KEY_MARK = "mark"

    }

    override fun onCreate(db: SQLiteDatabase?) {

        val CREATE_CONTACTS_TABLE = ("CREATE TABLE " + TABLE_CONTACTS +
                "(" + KEY_DATE + " TEXT PRIMARY KEY, " +
                KEY_NOTASK + " TEXT, " + KEY_MARK + " TEXT )")

        db?.execSQL(CREATE_CONTACTS_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS)
        onCreate(db)
    }

    fun addTaskHistory(task: ModelClass): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_DATE, task.date)
        contentValues.put(KEY_NOTASK, task.noTask)
        contentValues.put(KEY_MARK, task.mark)

        val success = db.insert(TABLE_CONTACTS, null, contentValues)
        db.close()

        return success
    }


    fun viewTask():List<ModelClass>{
        val taskList : ArrayList<ModelClass> = ArrayList<ModelClass>()
        val selectQuery = "SELECT * FROM $TABLE_CONTACTS"
        val db = this.readableDatabase
        var cursor: Cursor? = null


        try{
            cursor = db.rawQuery(selectQuery, null)
        }catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }
        var date : String
        var noTask : String
        var mark : String

        if(cursor.moveToFirst()){
            do{
                date = cursor.getString(cursor.getColumnIndex("date"))
                noTask = cursor.getString(cursor.getColumnIndex("noTask"))
                mark = cursor.getString(cursor.getColumnIndex("mark"))
                val task = ModelClass(
                    date = date,
                    noTask = noTask,
                    mark = mark
                )
                taskList.add(task)
            }while (cursor.moveToNext())

        }

        return taskList
    }


    fun clearAll(emp: ModelClass):Int{
        val db = this.writableDatabase
        val contentValues = ContentValues()
        val success = db.delete(TABLE_CONTACTS,null,null )
        return success

    }

}















