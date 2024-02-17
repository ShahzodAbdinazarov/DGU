package dgu.app.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.appbar.CollapsingToolbarLayout
import dgu.app.R
import dgu.app.adapters.PdfAdapter
import dgu.app.utils.getMainFiles

class PdfListActivity : AppCompatActivity() {

    private var key: String = ""

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_list)
        setSupportActionBar(findViewById(R.id.toolbar))
        val colToolBar = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        colToolBar.title = getString(R.string.title)
        colToolBar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar)
        colToolBar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar)

        val listBookmarks = findViewById<RecyclerView>(R.id.listDGU)
        key = intent.getStringExtra("key").toString()

        colToolBar.title = intent.getStringExtra("title") ?: "Ma'lumotlar"
        listBookmarks.setBackgroundColor(Color.parseColor("#FFEFD5"))

        val path = if (key.startsWith("/")) key.substringAfter("/") else key
        val list = this@PdfListActivity.getMainFiles(path).sortedByDescending { it.isFolder }

        listBookmarks.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        listBookmarks.adapter = PdfAdapter {
            if (it.isFolder == true) {
                startActivity(
                    Intent(this@PdfListActivity, PdfListActivity::class.java)
                        .putExtra("key", it.path)
                        .putExtra("title", it.fileName)
                )
            } else startActivity(
                Intent(this@PdfListActivity, PDFActivity::class.java)
                    .putExtra("title", it.fileName)
                    .putExtra("key", it.path)
            )
        }.apply { items = ArrayList(list) }

    }

}