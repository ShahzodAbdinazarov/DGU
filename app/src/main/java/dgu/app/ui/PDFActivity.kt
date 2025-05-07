package dgu.app.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView
import dgu.app.R

class PDFActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val text: String = intent.getStringExtra("title").toString()
        val key: String = intent.getStringExtra("key").toString()
        title = when (key) {
            "file", "labo", "lide", "amal", "leks", "data", "maqo", "free" -> text.substring(2)
            else -> text
        }

        val path = if (key.startsWith("/")) key.substringAfter("/") else key

        Log.e("TAG", "onCreate: $key")

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        try {
            pdfView.fromAsset(path).show()
        } catch (_: Exception) {
            Toast.makeText(this, "Fayl topilmadi!", Toast.LENGTH_SHORT).show()
        }

    }
}