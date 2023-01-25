package dgu.app.quiz

import android.view.View
import androidx.viewpager.widget.ViewPager

class ParallaxTransformer : ViewPager.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        val pageWith = page.width
//        val image = page.findViewById<ImageView>(R.id.imgCarousel)
//        image.translationX = -position*(pageWith/2)

//        val bottomBar = page.findViewById<LinearLayout>(R.id.bottomBar)
//        bottomBar.translationX = -position*pageWith

    }
}