package dgu.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.appbar.CollapsingToolbarLayout
import dgu.app.R
import dgu.app.adapters.MainAdapter
import dgu.app.utils.getMainList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val colToolBar = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)
        colToolBar.title = getString(R.string.title)
        colToolBar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar)
        colToolBar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar)

        findViewById<RecyclerView>(R.id.listDGU).apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = MainAdapter(this@MainActivity, getMainList())
        }
    }

}