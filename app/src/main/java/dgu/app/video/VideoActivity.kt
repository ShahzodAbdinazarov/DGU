package dgu.app.video

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import dgu.app.R

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        title = intent.getStringExtra("name") ?: "Virtual laboratoriyalar"
        val path: Int = intent.getIntExtra("path", 0)

        val pathFull  = "android.resource://$packageName/$path"

        val videoView = findViewById<View>(R.id.videoView) as VideoView
        videoView.setVideoURI(Uri.parse(pathFull))
        videoView.setMediaController(MediaController(this))

        videoView.start()
    }

}