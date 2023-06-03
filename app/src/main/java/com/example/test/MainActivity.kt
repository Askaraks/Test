package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val math = MyMath()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        logicListener()

    }
    private fun logicListener(){
        binding.btnPlus.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = math.add(num1, num2)
            binding.tvResult.text = result.toString()
            binding.tvResult.isVisible = true
        }

        binding.btnMinus.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = math.sub(num1, num2)
            binding.tvResult.text = result.toString()
            binding.tvResult.isVisible = true
        }
        binding.btnMultiply.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = math.mult(num1, num2)
            binding.tvResult.text = result.toString()
            binding.tvResult.isVisible = true
        }
        binding.btnDivision.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            val result = math.div(num1, num2)
            binding.tvResult.text = result.toString()
            binding.tvResult.isVisible = true
        }
    }
}