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
    Main(0, R.drawable.doc01, "Qiziqarli matematika", "file"),
    Main(0, R.drawable.doc02, "Oraliq nazorat 1-semestr", "fayl01 "),
    Main(0, R.drawable.glossary, "Oraliq nazorat 2-semestr", "fayl01 "),
    Main(0, R.drawable.doc03, "Sillabus", "fayl01 "),
    Main(0, R.drawable.docs, "Tipik masalalar to'plami 1-qism", "fayl01 "),
    Main(0, R.drawable.doc, "Tipik masalalar to'plami 2-qism", "fayl01 "),
    Main(0, R.drawable.doces, "Topshiriqlar To'plami", "fayl01 "),
    Main(0, R.drawable.documents, "Yakuniy nazorat bahorgi semestr", "fayl01 "),
    Main(0, R.drawable.quiz, "yakuniy nazorat variantlari Kuzgi", "fayl01 "),
    Main(0, R.drawable.about, "МАЪЛУМОТНОМА", "fayl01 "),
)

/*
fayl01 Oraliq nazorat 1-semestr.pdf
fayl01 Oraliq nazorat 2-semestr.pdf
fayl01 Sillabus.pdf
fayl01 Tipik masalalar to'plami 1-qism.pdf
fayl01 Tipik masalalar to'plami 2-qism.pdf
fayl01 Topshiriqlar To'plami.pdf
fayl01 Yakuniy nazorat bahorgi semestr.pdf
fayl01 yakuniy nazorat variantlari Kuzgi.pdf
fayl01 МАЪЛУМОТНОМА.pdf
*/

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
