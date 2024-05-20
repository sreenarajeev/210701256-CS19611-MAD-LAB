package com.example.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.res)

        btn.setOnClickListener {
            val num1 = findViewById<EditText>(R.id.num1).text.toString()
            val num2 = findViewById<EditText>(R.id.num2).text.toString()
            val op = findViewById<EditText>(R.id.operator).text.toString()
            when(op){
                "+" ->
                {
                    val res:String = "Result = ${num1.toInt()+num2.toInt()}"
                    result.text = res
                }
                "-" ->
                {
                    val res:String = "Result = ${num1.toInt()-num2.toInt()}"
                    result.text = res
                }
                "*" ->
                {
                    val res:String = "Result = ${num1.toInt()*num2.toInt()}"
                    result.text = res
                }
                "/" ->
                {
                    val res:String = "Result = ${num1.toInt()/num2.toInt()}"
                    result.text = res
                }
            }
        }
    }

}