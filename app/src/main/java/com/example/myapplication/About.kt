package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backbutton3 = findViewById<Button>(R.id.back_button2)
        backbutton3.setOnClickListener {
            val intent = Intent(this,Titlescreen::class.java)
            startActivity(intent)
        }
    }
}