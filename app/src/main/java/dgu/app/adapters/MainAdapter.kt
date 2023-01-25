package dgu.app.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R
import dgu.app.model.Main
import dgu.app.quiz.QuizActivity
import dgu.app.ui.MainActivity
import dgu.app.ui.PDFActivity
import dgu.app.ui.PdfListActivity
import dgu.app.ui.UrlActivity

@SuppressLint("SetTextI18n")
class MainAdapter(private val activity: MainActivity, private val files: ArrayList<Main>) : RecyclerView.Adapter<MainAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder = BookmarksHolder(
        LayoutInflater.from(activity).inflate(R.layout.item_main, parent, false)
    )

    override fun onBindViewHolder(holder: BookmarksHolder, position: Int) {
        holder.bindItems(files[position])
    }

    override fun getItemCount() = files.size

    inner class BookmarksHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val title: TextView = v.findViewById(R.id.title)
        private val image: ImageView = v.findViewById(R.id.image)
        private val view = v

        fun bindItems(main: Main) {
            image.setImageResource(main.image)
            title.text = main.title

            view.setOnClickListener {
                when (main.action) {
                    "file", "labo", "lide", "amal", "leks", "data", "maqo", "free" -> activity.startActivity(
                        Intent(activity, PdfListActivity::class.java)
                            .putExtra("key", main.action)
                            .putExtra("title", main.title)
                    )
                    "video" -> activity.startActivity(Intent(activity, UrlActivity::class.java))
                    "quiz" -> activity.startActivity(Intent(activity, QuizActivity::class.java))
                    else -> activity.startActivity(
                        Intent(activity, PDFActivity::class.java).putExtra("title", main.title).putExtra("key", main.action)
                    )
                }
            }
        }

    }

}