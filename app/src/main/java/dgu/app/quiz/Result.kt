package dgu.app.quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import dgu.app.R

@SuppressLint("SetTextI18n")
class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setTitle(R.string.result)
        val correct: Int = intent.getIntExtra("correct", 0)
        val finish: CardView = findViewById(R.id.finish)
        val text: TextView = findViewById(R.id.text)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        text.text = "$correct\t\t\t/\t\t\t10"
        progressBar.max = 10
        progressBar.progress = correct
        finish.setOnClickListener { finish() }
    }
}