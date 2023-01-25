package dgu.app.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R
import dgu.app.model.Havola
import dgu.app.ui.CalculatorActivity
import dgu.app.ui.UrlActivity
import dgu.app.video.VideoActivity


@SuppressLint("SetTextI18n")
class UrlAdapter(private val activity: UrlActivity, private val files: ArrayList<Havola>) :
    RecyclerView.Adapter<UrlAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder =
        BookmarksHolder(LayoutInflater.from(activity).inflate(R.layout.item_dgu, parent, false))

    override fun onBindViewHolder(holder: BookmarksHolder, position: Int) =
        holder.bindItems(files[position])

    override fun getItemCount() = files.size

    inner class BookmarksHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val title: TextView = v.findViewById(R.id.txtDGU)

        fun bindItems(havola: Havola) {
            title.text = havola.title

            title.setOnClickListener {
                activity.startActivity(
                    when (havola.url) {
                        "one", "two", "three", "four" -> Intent(
                            activity,
                            CalculatorActivity::class.java
                        )
                            .putExtra("key", havola.url).putExtra("title", havola.title)
                        "video" ->
                            Intent(activity, VideoActivity::class.java)
                                .putExtra("name", havola.title)
                                .putExtra("path", havola.path)
                        else -> Intent(Intent.ACTION_VIEW, Uri.parse(havola.url))
                    }
                )
            }
        }

    }

}