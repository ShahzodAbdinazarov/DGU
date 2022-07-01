package dgu.app.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dgu.app.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private var open1 = true
    private var open2 = true
    private var open3 = true
    private var open4 = true
    private lateinit var binding: ActivityCalculatorBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = intent.getStringExtra("title") ?: ""
        open(intent.getStringExtra("key") ?: "")

        binding.button1.setOnClickListener {
            if (binding.edit1.text?.isNotEmpty() == true) {
                binding.percent1.text = " ${binding.edit1.text.toString().toDouble() * 0.04} sum"
                binding.residual1.text = " ${binding.edit1.text.toString().toDouble() * 0.96} sum"
            } else {
                binding.percent1.text = " 0.0 sum"
                binding.residual1.text = " 0.0 sum"
            }
        }
        binding.button2.setOnClickListener {
            if (binding.edit2.text?.isNotEmpty() == true && binding.editP2.text.isNotEmpty()) {
                binding.percent2.text = " ${binding.edit2.text.toString().toDouble() * binding.editP2.text.toString().toDouble() / 100} sum"
                binding.residual2.text = " ${binding.edit2.text.toString().toDouble() * (1 - binding.editP2.text.toString().toDouble() / 100)} sum"
            }
        }
        binding.button2.setOnClickListener {
            if (binding.editP2.text?.isNotEmpty() == true && binding.edit2.text.isNotEmpty()) {
                binding.percent2.text = " ${binding.editP2.text.toString().toDouble() * binding.edit2.text.toString().toDouble() / 100} sum"
                binding.residual2.text = " ${binding.edit2.text.toString().toDouble() * (1 - binding.editP2.text.toString().toDouble() / 100)} sum"
                binding.percentP2.text = "Davlat boji ${binding.editP2.text}%"
            }
        }
        binding.button3.setOnClickListener {
            if (binding.edit3.text?.isNotEmpty() == true) {
                binding.percent3.text = " ${binding.edit3.text.toString().toDouble() * 0.12} sum"
                binding.residual3.text = " ${binding.edit3.text.toString().toDouble() * 0.88} sum"
            } else {
                binding.percent3.text = " 0.0 sum"
                binding.residual3.text = " 0.0 sum"
            }
        }
        binding.button4.setOnClickListener {
            if (binding.edit4.text?.isNotEmpty() == true && binding.editP4.text.isNotEmpty()) {
                binding.percent4.text = " ${binding.edit4.text.toString().toDouble() * binding.editP4.text.toString().toDouble() / 100} sum"
                binding.residual4.text = " ${binding.edit4.text.toString().toDouble() * (1 - binding.editP4.text.toString().toDouble() / 100)} sum"
            }
        }
        binding.button4.setOnClickListener {
            if (binding.editP4.text?.isNotEmpty() == true && binding.edit4.text.isNotEmpty()) {
                binding.percent4.text = " ${binding.editP4.text.toString().toDouble() * binding.edit4.text.toString().toDouble() / 100} sum"
                binding.residual4.text = " ${binding.edit4.text.toString().toDouble() * (1 - binding.editP4.text.toString().toDouble() / 100)} sum"
                binding.percentP4.text = "Davlat boji ${binding.editP4.text}%"
            }
        }

    }

    private fun open(i: String) {
        when (i) {
            "one" -> {
                if (open1) binding.layout1.visibility = View.VISIBLE
                else binding.layout1.visibility = View.GONE
                open1 = !open1
            }
            "two" -> {
                if (open2) binding.layout2.visibility = View.VISIBLE
                else binding.layout2.visibility = View.GONE
                open2 = !open2
            }
            "three" -> {
                if (open3) binding.layout3.visibility = View.VISIBLE
                else binding.layout3.visibility = View.GONE
                open3 = !open3
            }
            "four" -> {
                if (open4) binding.layout4.visibility = View.VISIBLE
                else binding.layout4.visibility = View.GONE
                open4 = !open4
            }
        }
    }

}