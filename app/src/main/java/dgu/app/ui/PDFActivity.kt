package dgu.app.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView
import dgu.app.R

class PDFActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val text: String? = intent.getStringExtra("title")
        val key: String? = intent.getStringExtra("key")
        title = when (key) {
            "file", "labo", "lide", "amal", "leks", "data", "maqo", "free" -> text?.substring(2) ?: ""
            else -> text
        }

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        try {
            pdfView.fromAsset("$key$text.pdf").show()
        } catch (e: Exception) {
            Toast.makeText(this, "Fayl topilmadi!", Toast.LENGTH_SHORT).show()
        }

    }
}