package com.example.expression

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var btCal : Button
    lateinit var tvResult : TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etA = findViewById(R.id.etA)
        etB = findViewById(R.id.etB)
        btCal = findViewById(R.id.btCal)
        tvResult = findViewById(R.id.tvResult)
        btCal.setOnClickListener {
            val a : Double = (etA.text.toString().toDouble()) + (etB.text.toString().toDouble())
            tvResult.text = a.toString()
        }
    }


}