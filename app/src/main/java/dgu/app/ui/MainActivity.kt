package dgu.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.appbar.CollapsingToolbarLayout
import dgu.app.R
import dgu.app.adapters.FileAdapter
import dgu.app.utils.getMainFiles

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val colToolBar = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)
        colToolBar.title = getString(R.string.title)
        colToolBar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar)
        colToolBar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val list = this@MainActivity.getMainFiles().sortedByDescending { it.isFolder }
        val sortedList = list.sortedWith(compareBy { if (it.fileName?.lowercase()?.contains("muallif") == true) 1 else 0 })

        findViewById<RecyclerView>(R.id.listDGU).apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = FileAdapter {
                if (it.isFolder == true) {
                    startActivity(
                        Intent(this@MainActivity, PdfListActivity::class.java)
                            .putExtra("key", it.path)
                            .putExtra("title", it.fileName)
                    )
                } else startActivity(
                    Intent(this@MainActivity, PDFActivity::class.java)
                        .putExtra("title", it.fileName)
                        .putExtra("key", it.path)
                )
            }.apply { items = ArrayList(sortedList) }
        }
    }

}