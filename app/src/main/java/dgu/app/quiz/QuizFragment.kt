package dgu.app.quiz

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dgu.app.databinding.FragmentQuizBinding
import dgu.app.utils.SharedPrefs

class QuizFragment : Fragment() {

    private lateinit var binding: FragmentQuizBinding
    private var answered = false
    private var position = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuizBinding.inflate(inflater, container, false)
        position = arguments?.getInt("position", 0) ?: 0

        val correct = quizzes[position].answers[0]
        val answers = quizzes[position].answers.toMutableList().shuffled()
        binding.tvQuestion.text = quizzes[position].question
        binding.tvAnswerA.text = answers[0]
        binding.tvAnswerB.text = answers[1]
        binding.tvAnswerC.text = answers[2]
        binding.tvAnswerD.text = answers[3]

        binding.tvAnswerA.setOnClickListener { clickA(correct) }
        binding.tvAnswerB.setOnClickListener { clickB(correct) }
        binding.tvAnswerC.setOnClickListener { clickC(correct) }
        binding.tvAnswerD.setOnClickListener { clickD(correct) }
        binding.bnAnswerA.setOnClickListener { clickA(correct) }
        binding.bnAnswerB.setOnClickListener { clickB(correct) }
        binding.bnAnswerC.setOnClickListener { clickC(correct) }
        binding.bnAnswerD.setOnClickListener { clickD(correct) }

        if (SharedPrefs(requireContext()).getAnswer(position) != -1) {
            findAnswer(SharedPrefs(requireContext()).getAnswerText(position))
            findCorrect(correct)
        }

        return binding.root
    }

    private fun clickA(correct: String) {
        if (!answered) {
            binding.cvAnswerA.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.cnAnswerA.setCardBackgroundColor(Color.parseColor("#FF4444"))
            findCorrect(correct)
            if (binding.tvAnswerA.text == correct) SharedPrefs(requireContext()).addAnswer(
                position,
                1
            )
            else SharedPrefs(requireContext()).addAnswer(position, 0)
            SharedPrefs(requireContext()).addAnswerText(position, binding.tvAnswerA.text.toString())
            (requireActivity() as QuizActivity).setUpTab(position)
        }
    }

    private fun clickB(correct: String) {
        if (!answered) {
            binding.cvAnswerB.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.cnAnswerB.setCardBackgroundColor(Color.parseColor("#FF4444"))
            findCorrect(correct)
            if (binding.tvAnswerB.text == correct) SharedPrefs(requireContext()).addAnswer(
                position,
                1
            )
            else SharedPrefs(requireContext()).addAnswer(position, 0)
            SharedPrefs(requireContext()).addAnswerText(position, binding.tvAnswerB.text.toString())
            (requireActivity() as QuizActivity).setUpTab(position)
        }
    }

    private fun clickC(correct: String) {
        if (!answered) {
            binding.cvAnswerC.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.cnAnswerC.setCardBackgroundColor(Color.parseColor("#FF4444"))
            findCorrect(correct)
            if (binding.tvAnswerC.text == correct) SharedPrefs(requireContext()).addAnswer(
                position,
                1
            )
            else SharedPrefs(requireContext()).addAnswer(position, 0)
            SharedPrefs(requireContext()).addAnswerText(position, binding.tvAnswerC.text.toString())
            (requireActivity() as QuizActivity).setUpTab(position)
        }
    }

    private fun clickD(correct: String) {
        if (!answered) {
            binding.cvAnswerD.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.cnAnswerD.setCardBackgroundColor(Color.parseColor("#FF4444"))
            findCorrect(correct)
            if (binding.tvAnswerD.text == correct) SharedPrefs(requireContext()).addAnswer(
                position,
                1
            )
            else SharedPrefs(requireContext()).addAnswer(position, 0)
            SharedPrefs(requireContext()).addAnswerText(position, binding.tvAnswerD.text.toString())
            (requireActivity() as QuizActivity).setUpTab(position)
        }
    }

    private fun findCorrect(correct: String) {
        answered = true
        when (correct) {
            binding.tvAnswerA.text -> binding.cvAnswerA.setCardBackgroundColor(Color.parseColor("#44DD44"))
            binding.tvAnswerB.text -> binding.cvAnswerB.setCardBackgroundColor(Color.parseColor("#44DD44"))
            binding.tvAnswerC.text -> binding.cvAnswerC.setCardBackgroundColor(Color.parseColor("#44DD44"))
            else -> binding.cvAnswerD.setCardBackgroundColor(Color.parseColor("#44DD44"))
        }
        when (correct) {
            binding.tvAnswerA.text -> binding.cnAnswerA.setCardBackgroundColor(Color.parseColor("#44DD44"))
            binding.tvAnswerB.text -> binding.cnAnswerB.setCardBackgroundColor(Color.parseColor("#44DD44"))
            binding.tvAnswerC.text -> binding.cnAnswerC.setCardBackgroundColor(Color.parseColor("#44DD44"))
            else -> binding.cnAnswerD.setCardBackgroundColor(Color.parseColor("#44DD44"))
        }
    }

    private fun findAnswer(answer: String) {
        answered = true
        when (answer) {
            binding.tvAnswerA.text -> binding.cvAnswerA.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.tvAnswerB.text -> binding.cvAnswerB.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.tvAnswerC.text -> binding.cvAnswerC.setCardBackgroundColor(Color.parseColor("#FF4444"))
            else -> binding.cvAnswerD.setCardBackgroundColor(Color.parseColor("#FF4444"))
        }
        when (answer) {
            binding.tvAnswerA.text -> binding.cnAnswerA.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.tvAnswerB.text -> binding.cnAnswerB.setCardBackgroundColor(Color.parseColor("#FF4444"))
            binding.tvAnswerC.text -> binding.cnAnswerC.setCardBackgroundColor(Color.parseColor("#FF4444"))
            else -> binding.cnAnswerD.setCardBackgroundColor(Color.parseColor("#FF4444"))
        }
    }

    companion object {
        private var quizzes = ArrayList<Quiz>()
        fun newInstance(position: Int, quizzes: ArrayList<Quiz>): Fragment {
            Companion.quizzes = quizzes
            val fragment = QuizFragment()
            val bundle = Bundle()
            bundle.putInt("position", position)
            fragment.arguments = bundle
            return fragment
        }
    }

}
