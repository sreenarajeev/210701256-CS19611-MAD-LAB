package com.example.graphicalprimitives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating the bitmap
        val imageView = findViewById<ImageView>(R.id.imageView)
        val bitmap = Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565)
        imageView.setImageBitmap(bitmap)

        val canvas =  Canvas(bitmap)
        val paint = Paint()
        paint.setColor(Color.WHITE)
        paint.textSize = 50F

        //rectange
        canvas.drawText("Rectangle" ,420F, 150F,paint)
        canvas.drawRect(400F, 200F, 650F, 700F,paint)

        //circle
        canvas.drawText("Circle",120F,150F,paint)
        canvas.drawCircle(200F,350F,150F,paint)

        //square
        canvas.drawText("Square",120F,800F,paint)
        canvas.drawRect(50F,850F,350F,1150F,paint)

        //line
        canvas.drawText("Line", 480F, 800F,paint)
        canvas.drawLine(520F, 850F, 520F, 1150F,paint)

    }
}