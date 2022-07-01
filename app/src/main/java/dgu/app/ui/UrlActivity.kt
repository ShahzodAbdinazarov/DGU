package dgu.app.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import dgu.app.R
import dgu.app.adapters.UrlAdapter
import dgu.app.utils.getUrlList

class UrlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_url)

        title = intent.getStringExtra("title") ?: ""
        val key = intent.getStringExtra("key") ?: ""

        findViewById<RecyclerView>(R.id.listDGU).apply {
            setBackgroundColor(
                Color.parseColor(
                    when (key) {
                        "calc" -> "#87CEEB"
                        "url" -> "#C0C0C0"
                        "web" -> "#C0C0C0"
                        else -> "#FFFFFF"
                    }
                )
            )
            layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
            adapter = UrlAdapter(this@UrlActivity, getUrlList(key))
        }
    }
}