package dgu.app.quiz

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

@Suppress("DEPRECATION")
class QuizAdapter(private val quizzes: ArrayList<Quiz>, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment = QuizFragment.newInstance(position, quizzes)

    override fun getCount(): Int = quizzes.size

    override fun getPageTitle(position: Int): CharSequence? = null

}