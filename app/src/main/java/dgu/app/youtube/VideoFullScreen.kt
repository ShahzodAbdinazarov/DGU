package dgu.app.youtube

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import dgu.app.R
import java.util.*

@SuppressLint("SetJavaScriptEnabled")
class VideoFullScreen : AppCompatActivity() {
    var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_video_full_screen)
        val actionBar: ActionBar = supportActionBar!!
        Objects.requireNonNull(actionBar).hide()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        webView = findViewById(R.id.full_video)
        val link: String = intent.getStringExtra("link")!!
        webView?.loadData(link, "text/html", "utf-8")
        webView?.webChromeClient = WebChromeClient()
        webView?.settings?.javaScriptEnabled = true
    }
}