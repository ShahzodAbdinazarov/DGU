package dgu.app.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dgu.app.R
import java.util.*

class QuizActivity : AppCompatActivity() {
    private var txtQuestion: TextView? = null
    private var txtAnswerA: TextView? = null
    private var txtAnswerB: TextView? = null
    private var txtAnswerC: TextView? = null
    private var txtAnswerD: TextView? = null
    private var data: MutableList<Quiz> = ArrayList()
    private var db: DBHelper? = null
    private var current = 0
    private var end = 0
    private var correct = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        setTitle(R.string.quiz_title)
        txtQuestion = findViewById(R.id.txtQuestion)
        txtAnswerA = findViewById(R.id.txtAnswerA)
        txtAnswerB = findViewById(R.id.txtAnswerB)
        txtAnswerC = findViewById(R.id.txtAnswerC)
        txtAnswerD = findViewById(R.id.txtAnswerD)
        db = DBHelper(this)
        data.clear()
        data = db!!.all as MutableList<Quiz>
        current = Random().nextInt(db!!.maxID - 10)
        end = current+10
        next()
        txtAnswerA?.setOnClickListener {
            if (txtAnswerA?.text.toString() == data[current - 1].answerA) correct++
            next()
        }
        txtAnswerB?.setOnClickListener {
            if (txtAnswerB?.text.toString() == data[current - 1].answerA) correct++
            next()
        }
        txtAnswerC?.setOnClickListener {
            if (txtAnswerC?.text.toString() == data[current - 1].answerA) correct++
            next()
        }
        txtAnswerD?.setOnClickListener {
            if (txtAnswerD?.text.toString() == data[current - 1].answerA) correct++
            next()
        }
    }

    @SuppressLint("SetTextI18n")
    private operator fun next() {
        if (current < end) {
            txtQuestion?.text = data[current].question
            rand()
            current++
        } else {
            txtQuestion!!.text = "Finish!"
            txtAnswerA!!.text = "To'gri javob $correct ta"
            txtAnswerB!!.text = "Noto'g'ri javob " + (db!!.maxID - correct) + " ta"
            txtAnswerC!!.text = "Jami savollar " + db!!.maxID + " ta"
            txtAnswerD!!.text = "Savollar tugadi"
            startActivity(Intent(this, Result::class.java).putExtra("correct", correct))
            finish()
        }
    }

    private fun rand() {
        val n = (Calendar.getInstance().timeInMillis % 10).toInt()
        var k = 1
        for (i in 0 until n) {
            k = (k * (Random().nextInt() % 10 + 1))
        }
        when (k % 4) {
            0 -> {
                txtAnswerB?.text = data[current].answerA
                txtAnswerA?.text = data[current].answerB
                txtAnswerC?.text = data[current].answerC
                txtAnswerD?.text = data[current].answerD
            }
            1 -> {
                txtAnswerC?.text = data[current].answerA
                txtAnswerB?.text = data[current].answerB
                txtAnswerA?.text = data[current].answerC
                txtAnswerD?.text = data[current].answerD
            }
            2 -> {
                txtAnswerD?.text = data[current].answerA
                txtAnswerB?.text = data[current].answerB
                txtAnswerC?.text = data[current].answerC
                txtAnswerA?.text = data[current].answerD
            }
            else -> {
                txtAnswerA?.text = data[current].answerA
                txtAnswerB?.text = data[current].answerB
                txtAnswerC?.text = data[current].answerC
                txtAnswerD?.text = data[current].answerD
            }
        }
    }
}