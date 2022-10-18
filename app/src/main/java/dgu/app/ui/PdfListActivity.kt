package dgu.app.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.appbar.CollapsingToolbarLayout
import dgu.app.R
import dgu.app.adapters.DGUAdapter
import java.io.IOException

class PdfListActivity : AppCompatActivity() {

    var key: String = ""

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
        when (key) {
            "file" -> {
                colToolBar.title = "Ma'ruzalar"
                listBookmarks.setBackgroundColor(Color.parseColor("#C0C0C0"))
            }
            "lide" -> {
                colToolBar.title = "Taqdimotlar"
                listBookmarks.setBackgroundColor(Color.parseColor("#FFEFD5"))
            }
            "amal" -> {
                colToolBar.title = "Amaliy mashg'ulotlar"
                listBookmarks.setBackgroundColor(Color.parseColor("#EFFFD5"))
            }
            else -> {
                colToolBar.title = "Nomalum xarakart"
                listBookmarks.setBackgroundColor(Color.parseColor("#FF0000"))
            }
        }

        val adapter = DGUAdapter(this, getFiles() as ArrayList<String>)
        listBookmarks.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        listBookmarks.adapter = adapter

    }

    private fun getFiles(): List<String> {
        val files: MutableList<String> = ArrayList()
        val list: Array<String>?
        try {
            list = assets.list("")
            if (list!!.isNotEmpty()) for (file in list) if (file.startsWith(key))
                files.add(file.replace(".pdf", "").substring(4))
        } catch (e: IOException) {
            return files
        }
        return files
    }

}