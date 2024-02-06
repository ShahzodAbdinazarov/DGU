package dgu.app.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R
import dgu.app.databinding.ItemMainBinding
import dgu.app.utils.MyFile

class FileAdapter(private var onItemClick: ((MyFile) -> Unit)? = null) : RecyclerView.Adapter<FileAdapter.ViewHolder>() {

    var items: ArrayList<MyFile> = arrayListOf()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(private val binding: ItemMainBinding, onItemClick: ((MyFile) -> Unit)? = null) : RecyclerView.ViewHolder(binding.root) {

        private lateinit var file: MyFile

        init {
            binding.layout.setOnClickListener { onItemClick?.invoke(file) }
        }

        fun bind(myFile: MyFile) {
            this.file = myFile

            binding.image.setImageResource(file.image ?: R.drawable.about)
            binding.title.text = file.fileName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false), onItemClick)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
}