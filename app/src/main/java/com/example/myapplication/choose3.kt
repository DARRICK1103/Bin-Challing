package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView

class choose3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose3)

        val Text3 = findViewById<TextView>(R.id.showQ3)
        val numberPicker3 = findViewById<NumberPicker>(R.id.nP3)

        val next = findViewById<Button>(R.id.nextpage3)

        numberPicker3.maxValue = 99
        numberPicker3.minValue = 1

        var option3 = 1



        numberPicker3.setOnValueChangedListener { picker, oldVal, newVal ->

            Text3.text = "Questions selected now is $newVal"
            option3 = newVal


        }

        val backbutton30 = findViewById<Button>(R.id.back3)
        backbutton30.setOnClickListener {
            val intent = Intent(this,Levelmenu::class.java)
            startActivity(intent)}

        next.setOnClickListener {
            val intent = Intent(this@choose3, G3::class.java)
            intent.putExtra("option", option3) //pass the number of question to G3
            startActivity(intent)
        }

    }
}