package dgu.app.youtube

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dgu.app.R
import java.util.*

@SuppressLint("Registered")
class ListVideos : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var youtubeVideos = Vector<YouTubeVideos>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_videos)
        title = "Videolar (Internetni yoqing!)"
        recyclerView = findViewById(R.id.rec_listVideo)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        setData()
        val videoAdapter = VideoAdapter(this, youtubeVideos)
        recyclerView?.setAdapter(videoAdapter)
    }

    private fun setData() {
        youtubeVideos.clear()
        add("cO9sWD6-DZg")
        add("92AkHECyVes")
        add("5dt5rO3fmDY")
        add("8yC5NIGsQfs")
    }

    private fun add(url: String) {
        youtubeVideos.add(
            YouTubeVideos(
                "<iframe width=\"100%\" height=\"100%\" " +
                        "src=\"https://www.youtube.com/embed/" + url + "\" title=\"YouTube video player\" " +
                        "frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; " +
                        "gyroscope; picture-in-picture\" allowfullscreen></iframe>"
            )
        )
    }
}