package com.example.viewsdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.text)
        val bg = findViewById<ConstraintLayout>(R.id.main)
        btn.setOnClickListener {
            txt.setTextSize(TypedValue.COMPLEX_UNIT_SP,28f)
            txt.setTextColor(Color.RED)
            bg.setBackgroundColor(Color.YELLOW)
            Toast.makeText(this,"You clicked the button",Toast.LENGTH_SHORT).show()
        }
    }
}