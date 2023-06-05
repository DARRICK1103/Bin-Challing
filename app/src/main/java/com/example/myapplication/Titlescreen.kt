package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Titlescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titlescreen)

        val mediaplayer = MediaPlayer.create(this@Titlescreen,R.raw.music )


            mediaplayer.setLooping(true)
            mediaplayer.start()



        val startbutton = findViewById<Button>(R.id.start_Button)
        startbutton.setOnClickListener {
            mediaplayer.stop()
            val intent = Intent(this,Levelmenu::class.java)
            startActivity(intent)
        }


        val aboutbutton = findViewById<Button>(R.id.aboutbutton)
        aboutbutton.setOnClickListener {
            mediaplayer.stop()
            val intent = Intent(this,About::class.java)
            startActivity(intent)
        }
        }
    }