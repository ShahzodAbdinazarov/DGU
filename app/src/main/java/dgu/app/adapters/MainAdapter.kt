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
import dgu.app.ui.*

@SuppressLint("SetTextI18n")
class MainAdapter(private val activity: MainActivity, private val files: ArrayList<Main>) :
    RecyclerView.Adapter<MainAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder =
        BookmarksHolder(
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
                    "file" -> activity.startActivity(Intent(activity, PdfListActivity::class.java).putExtra("key", main.action))
                    "lide" -> activity.startActivity(Intent(activity, PdfListActivity::class.java).putExtra("key", main.action))
                    "fayl" -> activity.startActivity(Intent(activity, PdfListActivity::class.java).putExtra("key", main.action))
                    "llll" -> activity.startActivity(Intent(activity, PdfListActivity::class.java).putExtra("key", main.action))
                    "quiz" -> activity.startActivity(Intent(activity, QuizActivity::class.java))
                    "url" -> activity.startActivity(
                        Intent(activity, UrlActivity::class.java)
                            .putExtra("title", main.title)
                            .putExtra("key", main.action)
                    )
                    "calc" -> activity.startActivity(
                        Intent(activity, UrlActivity::class.java)
                            .putExtra("title", main.title)
                            .putExtra("key", main.action)
                    )
                    "web" -> activity.startActivity(
                        Intent(activity, UrlActivity::class.java)
                            .putExtra("title", main.title)
                            .putExtra("key", main.action)
                    )
                    "avol" -> activity.startActivity(
                        Intent(activity, PDFActivity::class.java)
                            .putExtra("title", "01 ${main.title}")
                            .putExtra("key", main.action)
                    )
                    "author" -> activity.startActivity(
                        Intent(activity, PDFActivity::class.java)
                            .putExtra("title", "01 ${main.title}")
                            .putExtra("key", main.action)
                    )
                    else -> activity.startActivity(Intent(activity, PDFActivity::class.java).putExtra("title", getItem(adapterPosition).title))

                }
            }

        }

    }

    private fun getItem(index: Int): Main {
        return files[index]
    }

}