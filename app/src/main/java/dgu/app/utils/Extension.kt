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
    Main(0, R.drawable.doc03, "Amaliy mashg'ulotlar", "fayl01 "),
    Main(0, R.drawable.doc04, "Baholash mezonlari", "fayl01 "),
    Main(0, R.drawable.lab, "Laboratoriya ishlari", "fayl01 "),
    Main(0, R.drawable.glossary, "Maruzalar matni", "fayl01 "),
    Main(0, R.drawable.doc, "Mustaqil ta'lim mashg'ulotlari", "fayl01 "),
    Main(0, R.drawable.docs, "Oraliq nazorat savollari", "fayl01 "),
    Main(0, R.drawable.doces, "Ta'lim texnologiyasi", "fayl01 "),
    Main(0, R.drawable.savol, "Yakuniy savollari", "fayl01 "),
    Main(0, R.drawable.quiz, "Test", "fayl01 "),
    Main(0, R.drawable.about, "Muallif haqida", "fayl01 "),
)

/*



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

fun Activity.getFiles(newFolder: String = ""): ArrayList<MyFile> {
    val folderName = newFolder.trimStart('/')
    val fileList = mutableListOf<MyFile>()

    try {
        var i = 0
        assets.list(folderName)?.forEach { asset ->
            val filePath = "$folderName/$asset"
            val isFolder = !asset.contains(".")
            val image = if (folderName == "DGU" && imageList.size > i) if (asset.startsWith("Muallif")) R.drawable.about else imageList[i++] else null
            val fileName = if (!isFolder) asset.substringBeforeLast(".") else asset
            fileList.add(MyFile(fileName, isFolder, filePath, image))
            if (isFolder) fileList.addAll(this.getFiles(filePath))
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }

    return ArrayList(fileList)
}

data class MyFile(
    val fileName: String? = null,
    val isFolder: Boolean? = null,
    val path: String? = null,
    val image: Int? = R.drawable.about
)

fun Activity.getMainFiles(parent: String? = "DGU") = ArrayList(this.getFiles().filter { it.path?.substringBeforeLast("/") == parent })

val imageList = arrayListOf(
    R.drawable.doc,
    R.drawable.doc01,
    R.drawable.doc02,
    R.drawable.doc03,
    R.drawable.doc04,
    R.drawable.doces,
    R.drawable.docs,
    R.drawable.documents,
    R.drawable.glossary,
    R.drawable.lab,
    R.drawable.loho,
    R.drawable.questions,
    R.drawable.quiz,
    R.drawable.savol,
    R.drawable.taqdimot,
    R.drawable.calculator,
)