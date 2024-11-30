package com.example.alab2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputMinIncremental = findViewById<EditText>(R.id.inputMinIncremental)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val outputResult = findViewById<TextView>(R.id.outputResult)

        calculateButton.setOnClickListener { _ ->
            val minIncremental = inputMinIncremental.text.toString().toDouble()
            outputResult.text = calculate(minIncremental).toString()
            true
        }
    }

    fun calculate(constrain: Double) : Double
    {
        var sum = 0.0
        var denominator = 1.0
        var nextTerm = 1.0
        while (nextTerm > constrain) {
            nextTerm = 1.0 / (denominator * denominator)
            sum += nextTerm
            denominator++
        }
        return sum
    }
}