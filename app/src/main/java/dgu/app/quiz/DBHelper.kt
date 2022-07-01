package dgu.app.quiz

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.*

class DBHelper(context: Context?) : SQLiteOpenHelper(context, "Test", null, 1) {
    private val db: SQLiteDatabase = this.writableDatabase
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE Quiz(" +
                    "id INTEGER PRIMARY KEY," +
                    "question TEXT," +
                    "answerA TEXT, " +
                    "answerB TEXT, " +
                    "answerC TEXT, " +
                    "answerD TEXT)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS Quiz")
        onCreate(db)
    }

    fun add(quiz: Quiz) {
        val values = ContentValues()
        values.put("question", quiz.question)
        values.put("answerA", quiz.answerA)
        values.put("answerB", quiz.answerB)
        values.put("answerC", quiz.answerC)
        values.put("answerD", quiz.answerD)
        db.insert("Quiz", null, values)
    }

    @get:SuppressLint("Recycle")
    val all: List<Quiz>
        get() {
            val data: MutableList<Quiz> = ArrayList()
            val cursor = db.rawQuery("SELECT * FROM Quiz", null)
            if (cursor != null && cursor.moveToFirst()) {
                do {
                    val quiz = Quiz(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5)
                    )
                    data.add(quiz)
                } while (cursor.moveToNext())
            }
            Objects.requireNonNull(cursor).close()
            return data
        }

    @get:SuppressLint("Recycle")
    val maxID: Int
        get() {
            var mx = -1
            return try {
                val cursor = db.rawQuery("SELECT max(ID) from Quiz ", arrayOf())
                if (cursor != null) if (cursor.moveToLast()) {
                    mx = cursor.getInt(0)
                }
                Objects.requireNonNull(cursor).close()
                mx
            } catch (e: Exception) {
                -1
            }
        }

}