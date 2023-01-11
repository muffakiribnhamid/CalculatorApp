package com.muffakir.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.muffakir.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var lastNumeric : Boolean = false
    var lastDot : Boolean = false

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClear.setOnClickListener{
            binding.tvInput.text = ""
        }
        binding.btnZero.setOnClickListener{
            binding.tvInput.append("0")
        }

        binding.btnOne.setOnClickListener{
            binding.tvInput.append("1")
        }
        binding.btnTwo.setOnClickListener{
            binding.tvInput.append("2")
        }
        binding.btnThree.setOnClickListener{
            binding.tvInput.append("3")
        }
        binding.btnFour.setOnClickListener{
            binding.tvInput.append("4")
        }
        binding.btnFive.setOnClickListener{
            binding.tvInput.append("5")
        }
        binding.btnSix.setOnClickListener{
            binding.tvInput.append("6")
        }
        binding.btnSeven.setOnClickListener{
            binding.tvInput.append("7")
        }
        binding.btnEight.setOnClickListener{
            binding.tvInput.append("8")
        }
        binding.btnNine.setOnClickListener{
            binding.tvInput.append("9")
        }
        binding.btnAdd.setOnClickListener {
            binding.tvInput.append("+")
        }
        binding.btnSubtract.setOnClickListener {
            binding.tvInput.append("-")
        }
        binding.btnDivide.setOnClickListener {
            binding.tvInput.append("/")
        }
        binding.btnMultiply.setOnClickListener {
            binding.tvInput.append("*")
        }
        binding.btnDecimal.setOnClickListener {
            binding.tvInput.append(".")
        }
        binding.btnClear.setOnClickListener {
            binding.tvOutput.text = ""
        }


        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.tvInput.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()){
                binding.tvOutput.text = longresult.toString()
            }
            else {
                binding.tvOutput.text = result.toString()
            }
        }


    }

}