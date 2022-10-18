package dgu.app.youtube

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R

class VideoAdapter internal constructor(private val vContext: Context, private val youTubeVideosList: List<YouTubeVideos>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder?>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view: View = LayoutInflater.from(vContext).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val youTubeVideos = youTubeVideosList[position]
        holder.webView.loadData(youTubeVideos.videoUrl, "text/html", "utf-8")
        holder.button.setOnClickListener {
            val i = Intent(vContext, VideoFullScreen::class.java)
            i.putExtra("link", youTubeVideos.videoUrl)
            vContext.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return youTubeVideosList.size
    }

    class VideoViewHolder @SuppressLint("SetJavaScriptEnabled") constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var webView: WebView
        var button: Button

        init {
            webView = itemView.findViewById(R.id.videoWebView)
            button = itemView.findViewById(R.id.fullscreen)
            webView.webChromeClient = WebChromeClient()
            webView.settings.javaScriptEnabled = true
        }
    }
}