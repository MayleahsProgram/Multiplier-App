package com.example.multiplierapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var editNum1 = findViewById<TextView>(R.id.editNum1)
        var editNum2 = findViewById<TextView>(R.id.editNum2)
        var btnCalc = findViewById<Button>(R.id.btnCalc)
        var txtResult = findViewById<TextView>(R.id.txtResult)


        btnCalc.setOnClickListener {
            val inputNum1 = editNum1.text.toString().toInt()
            val inputNum2 = editNum2.text.toString().toInt()
            val result = num1 * num2
            txtResult.text = result.toString()
        }











}