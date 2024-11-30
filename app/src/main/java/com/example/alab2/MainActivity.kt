package com.example.alab2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        calculateButton.setOnClickListener { _ ->
            val minIncremental = inputMinIncremental.text.toString().toDouble()
            true
        }
    }
}