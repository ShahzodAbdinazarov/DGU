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
    Main(0, R.drawable.doc01, "Foydalanish uchun adabiyotlar", "file"),
    Main(0, R.drawable.doc02, "MENEJMENT Amaliy mavzular 60 soatlik", "leks"),
    Main(0, R.drawable.doc03, "Menejment fan dasturi", "fayl01 "),
    Main(0, R.drawable.doc04, "MENEJMENT fanida izohli lug'at", "fayl01 "),
    Main(0, R.drawable.doc, "Menejment fanidan ma'ruza mavzulari", "fayl01 "),
    Main(0, R.drawable.doces, "Menejment kalendar reja (amaliy)", "fayl01 "),
    Main(0, R.drawable.docs, "Menejmentdan Savollar to'plami", "fayl01 "),
    Main(0, R.drawable.docs, "Ochiq dars uchun kanspekt", "fayl01 "),
    Main(0, R.drawable.docs, "Менежмент ишчи дастур", "fayl01 "),
    Main(0, R.drawable.about, "Muallif haqida", "fayl02 "),
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
