package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView

class choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val Text = findViewById<TextView>(R.id.Text)
        val numberPicker = findViewById<NumberPicker>(R.id.numberPicker)

        val next = findViewById<Button>(R.id.next)

        numberPicker.maxValue = 99
        numberPicker.minValue = 1

        var option = 1



        numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->

            Text.text = "Questions selected now is $newVal"
            option = newVal


        }

        val backbutton = findViewById<Button>(R.id.backbutton3)
        backbutton.setOnClickListener {
            val intent = Intent(this,Levelmenu::class.java)
            startActivity(intent)}

        next.setOnClickListener {
            val intent = Intent(this@choose, G1::class.java)
            intent.putExtra("option", option) //pass the number of question to G1
            startActivity(intent)
        }




    }
}