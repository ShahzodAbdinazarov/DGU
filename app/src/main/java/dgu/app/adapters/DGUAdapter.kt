package dgu.app.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R
import dgu.app.ui.PDFActivity
import dgu.app.ui.PdfListActivity

@SuppressLint("SetTextI18n")
class DGUAdapter(private val activity: PdfListActivity, private val files: ArrayList<String>) :
    RecyclerView.Adapter<DGUAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder =
        BookmarksHolder(
            LayoutInflater.from(activity).inflate(R.layout.item_dgu, parent, false)
        )

    override fun onBindViewHolder(holder: BookmarksHolder, position: Int) {
        holder.bindItems(files[position])
    }

    override fun getItemCount() = files.size

    inner class BookmarksHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val txtDGU: TextView = v.findViewById(R.id.txtDGU)

        fun bindItems(name: String) {
            txtDGU.text = name.substring(2)
        }

        init {
            txtDGU.setOnClickListener {
                val intent = Intent(activity, PDFActivity::class.java).apply {
                    putExtra("title", getItem(adapterPosition))
                    putExtra("key", activity.key)
                }
                activity.startActivity(intent)
            }
        }

    }

    private fun getItem(index: Int): String {
        return files[index]
    }

}