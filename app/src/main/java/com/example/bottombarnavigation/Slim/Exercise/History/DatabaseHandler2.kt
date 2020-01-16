package com.example.bottombarnavigation.Slim.Exercise.History

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler2(context: Context):SQLiteOpenHelper(context,
    DATABASE_NAME,null,
    DATABASE_VERSION
) {

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "ExerciseDatabase"
        private val TABLE_CONTACTS = "ExerciseTable"
        private val KEY_DATE = "date"
        private val KEY_EXERCISE = "exercise"
        private val KEY_DURATION = "duration"

    }

    override fun onCreate(db: SQLiteDatabase?) {

        val CREATE_CONTACTS_TABLE = ("CREATE TABLE " + TABLE_CONTACTS +
                "(" + KEY_DATE + " TEXT PRIMARY KEY, " +
                KEY_EXERCISE + " TEXT, " + KEY_DURATION + " TEXT )")

        db?.execSQL(CREATE_CONTACTS_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS)
        onCreate(db)
    }

    fun addExerciseHistory(exercises: ModelClass2): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_DATE, exercises.date)
        contentValues.put(KEY_EXERCISE, exercises.exercise)
        contentValues.put(KEY_DURATION, exercises.duration)

        val success = db.insert(TABLE_CONTACTS, null, contentValues)
        db.close()

        return success
    }


    fun viewExercise():List<ModelClass2>{
        val exerciseList : ArrayList<ModelClass2> = ArrayList<ModelClass2>()
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
        var exercise : String
        var duration : String

        if(cursor.moveToFirst()){
            do{
                date = cursor.getString(cursor.getColumnIndex("date"))
                exercise = cursor.getString(cursor.getColumnIndex("exercise"))
                duration = cursor.getString(cursor.getColumnIndex("duration"))
                val exercises = ModelClass2(
                    date = date,
                    exercise = exercise,
                    duration = duration
                )
                exerciseList.add(exercises)
            }while (cursor.moveToNext())

        }

        return exerciseList
    }


    fun clearAll(emp: ModelClass2):Int{
        val db = this.writableDatabase
        val contentValues = ContentValues()
        val success = db.delete(TABLE_CONTACTS,null,null )
        return success

    }

}















