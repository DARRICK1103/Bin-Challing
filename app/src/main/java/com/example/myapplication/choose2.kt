package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView

class choose2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose2)

        val Text = findViewById<TextView>(R.id.Text4)
        val numberPicker = findViewById<NumberPicker>(R.id.numberPicker4)

        val next = findViewById<Button>(R.id.nextbutton3)

        numberPicker.maxValue = 99
        numberPicker.minValue = 1

        var option1 = 1



        numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->

            Text.text = "Questions selected now is $newVal"
            option1 = newVal


        }

        val backbutton = findViewById<Button>(R.id.backbutton5)
        backbutton.setOnClickListener {
            val intent = Intent(this,Levelmenu::class.java)
            startActivity(intent)}

        next.setOnClickListener {
            val intent = Intent(this@choose2, G2::class.java)
            intent.putExtra("option1", option1) //pass the number of question to G1
            startActivity(intent)
        }




    }
}