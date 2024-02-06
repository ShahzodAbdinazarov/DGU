package dgu.app.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dgu.app.databinding.ItemDguBinding
import dgu.app.utils.MyFile

class PdfAdapter(private var onItemClick: ((MyFile) -> Unit)? = null) : RecyclerView.Adapter<PdfAdapter.ViewHolder>() {

    var items: ArrayList<MyFile> = arrayListOf()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(private val binding: ItemDguBinding, onItemClick: ((MyFile) -> Unit)? = null) : RecyclerView.ViewHolder(binding.root) {

        private lateinit var file: MyFile

        init {
            binding.txtDGU.setOnClickListener { onItemClick?.invoke(file) }
        }

        fun bind(myFile: MyFile) {
            this.file = myFile

            binding.txtDGU.text = file.fileName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(ItemDguBinding.inflate(LayoutInflater.from(parent.context), parent, false), onItemClick)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
}