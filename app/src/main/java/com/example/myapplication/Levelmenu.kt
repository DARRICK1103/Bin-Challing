package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Levelmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levelmenu)

        val mediaplayer = MediaPlayer.create(this@Levelmenu,R.raw.music )
        //mediaplayer.stop()
        mediaplayer.setLooping(true)
        mediaplayer.start()

        val backbutton1 = findViewById<Button>(R.id.back_button1)
        backbutton1.setOnClickListener {
            mediaplayer.stop()
            val intent = Intent(this,Titlescreen::class.java)
            startActivity(intent)
        }
        val first = findViewById<Button>(R.id.bit1)
        first.setOnClickListener{
            mediaplayer.stop()
            val intent = Intent(this,choose::class.java)
            startActivity(intent)
        }
        val second = findViewById<Button>(R.id.bit2)
        second.setOnClickListener{
            mediaplayer.stop()
            val intent = Intent(this,choose2::class.java)
            startActivity(intent)
        }

        val third = findViewById<Button>(R.id.bit3)
        third.setOnClickListener {
            mediaplayer.stop()
            val intent = Intent(this, choose3::class.java)
            startActivity(intent)
        }
    }
}