package dgu.app.quiz

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import dgu.app.R
import dgu.app.databinding.ActivityQuizBinding
import dgu.app.utils.SharedPrefs
import dgu.app.utils.getMainList
import dgu.app.utils.getQuizzes

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private var id: Int = 0
    private var incorrects: Int = 0
    private var corrects: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        SharedPrefs(this).removeAllAnswer(this.getQuizzes().size)

        id = intent.getIntExtra("id", 0)
        binding.tvQuizTitle.text = getMainList()[id].title
        binding.tvQuizTitle.isSelected = true

        binding.back.setOnClickListener { finish() }

        binding.pager.adapter = QuizAdapter(this.getQuizzes(), supportFragmentManager)
        binding.pager.setCurrentItem(0, false)
        binding.pager.setPageTransformer(false, ParallaxTransformer())
        binding.tabs.setupWithViewPager(binding.pager)

        setUpAllTab()

        binding.pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                setUp()
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                setUp()
            }

            override fun onPageSelected(position: Int) {
                setUp()
            }
        })

        setUp()
        binding.bnLast.setOnClickListener {
            if (binding.pager.currentItem == 0) finish()
            else binding.pager.setCurrentItem(binding.pager.currentItem - 1, true)
            setUp()
        }

        binding.bnNext.setOnClickListener {
            if (binding.pager.currentItem == this.getQuizzes().size - 1) finish()
            else binding.pager.setCurrentItem(binding.pager.currentItem + 1, true)
            setUp()
        }

    }

    @SuppressLint("InflateParams", "SetTextI18n")
    private fun setUpAllTab() {
        val answers = SharedPrefs(this).getAllAnswer(this.getQuizzes().size)
        val size = answers.size
        incorrects = 0
        corrects = 0
        for (pos in 0 until size) {
            val view: View = layoutInflater.inflate(R.layout.item_tab, null)
            when (answers[pos]) {
                0 -> view.findViewById<CardView>(R.id.cv_item)
                    .setCardBackgroundColor(Color.parseColor("#FF4444"))
                1 -> view.findViewById<CardView>(R.id.cv_item)
                    .setCardBackgroundColor(Color.parseColor("#44DD44"))
                else -> view.findViewById<TextView>(R.id.tv_item)
                    .setTextColor(Color.parseColor("#000000"))
            }
            view.findViewById<TextView>(R.id.tv_item).text = "${pos + 1}"
            binding.tabs.getTabAt(pos)?.customView = null
            binding.tabs.getTabAt(pos)?.customView = view
            if (answers[pos] == 0) incorrects++
            if (answers[pos] == 1) corrects++
        }
        binding.tvAnswers.text = "To'g'ri: $corrects ta\nNoto'g'ri: $incorrects ta"
    }

    @SuppressLint("InflateParams", "SetTextI18n")
    fun setUpTab(pos: Int) {
        val answer = SharedPrefs(this).getAnswer(pos)
        val view: View = layoutInflater.inflate(R.layout.item_tab, null)
        when (answer) {
            0 -> view.findViewById<CardView>(R.id.cv_item)
                .setCardBackgroundColor(Color.parseColor("#FF4444"))
            1 -> view.findViewById<CardView>(R.id.cv_item)
                .setCardBackgroundColor(Color.parseColor("#44DD44"))
            else -> view.findViewById<TextView>(R.id.tv_item)
                .setTextColor(Color.parseColor("#000000"))
        }
        view.findViewById<TextView>(R.id.tv_item).text = "${pos + 1}"
        binding.tabs.getTabAt(pos)?.customView = null
        binding.tabs.getTabAt(pos)?.customView = view
        if (answer == 0) incorrects++
        if (answer == 1) corrects++
        binding.tvAnswers.text = "To'g'ri: $corrects ta\nNoto'g'ri: $incorrects ta"
    }

    @SuppressLint("SetTextI18n")
    private fun setUp() {
        val size = this.getQuizzes().size
        binding.bnLast.text = "Oldingi"
        binding.bnNext.text = "Keyingi"
        if (binding.pager.currentItem == 0) binding.bnLast.text = "Chiqish"
        else if (binding.pager.currentItem == size - 1) binding.bnNext.text = "Chiqish"
    }
}