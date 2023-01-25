package dgu.app.utils

import android.app.Activity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dgu.app.R
import dgu.app.model.Havola
import dgu.app.model.Main
import dgu.app.quiz.Quiz
import java.io.IOException
import java.io.InputStream

fun getMainList() = arrayListOf(
    Main(0, R.drawable.lab, "Ma'ruzalar", "file"),
    Main(0, R.drawable.taqdimot, "Taqdimotlar", "lide"),
    Main(0, R.drawable.doc, "Amaliy ishlar", "amal"),
    Main(0, R.drawable.doces, "Laboratoriya ishlari", "labo"),
    Main(0, R.drawable.docs, "Taqdimotlar", "lide"),
    Main(0, R.drawable.questions, "Leksiya", "leks"),
    Main(0, R.drawable.glossary, "Ma'lumotlar", "data"),
    Main(0, R.drawable.documents, "Maqolalar", "maqo"),
    Main(0, R.drawable.quiz, "Mustaqil ishlar", "free"),
    Main(0, R.drawable.calculator, "Ахборот тизимлари ва тармоқлари ишчи дастур", "fayl01 "),
    Main(0, R.drawable.savol, "ЯНсаволлари", "fayl02 "),
    Main(0, R.drawable.about, "Muallif haqida", "fayl03 "),
)

fun getUrlList(key: String) = when (key) {
    "url" -> arrayListOf(
        Havola(0, "Xalq banki hisobotini taqdim qilish 1 qism", "https://youtu.be/OjAqz-C_Xr8"),
        Havola(0, "Elektron soliq xizmatlari", "https://youtu.be/ZsYkrdZDHxs"),
    )
    "video" -> arrayListOf(
        Havola(0, "Daromad solig'i", "three"),
        Havola(0, "Yangi daromad solig'i", "four"),
    )
    else -> arrayListOf(
        Havola(0, "my.gov.uz", "https://my.gov.uz/oz"),
        Havola(0, "soliq.uz", "https://soliq.uz/"),
    )
}

fun Activity.getQuizzes(): ArrayList<Quiz> {
    val json: String? = try {
        val stream: InputStream = assets.open("quizzes.json")
        val size = stream.available()
        val buffer = ByteArray(size)
        stream.read(buffer)
        stream.close()
        String(buffer)
    } catch (ex: IOException) {
        ex.printStackTrace()
        return arrayListOf()
    }
    return Gson().fromJson(json, object : TypeToken<ArrayList<Quiz?>?>() {}.type)
}
