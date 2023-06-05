package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        val mediaplayer = MediaPlayer.create(this@Score,R.raw.music5 )
        //mediaplayer.stop()
        mediaplayer.setLooping(true)
        mediaplayer.start()

        val tries = intent.getIntExtra("Tries", 1)
        val option = intent.getIntExtra("Option", 1)

        val scoring = findViewById<TextView>(R.id.Scoring)

        val marks = 100*option/tries



        val word = findViewById<TextView>(R.id.Word)
        scoring.text=marks.toString()+"%"




        if(marks < 60)
        {

            word.text = "Haiyaa! But, dont worry ! There is always a stupid person in the world."


        }
        else
        {
            word.text = "Well done! You reached Asian average!"

        }


        val tryagain = findViewById<Button>(R.id.tryagainbutton)
        tryagain.setOnClickListener{
            mediaplayer.stop()
            val intent = Intent(this,Levelmenu::class.java)
            startActivity(intent)}

        val mainmenu = findViewById<Button>(R.id.mainmenubutton)
        mainmenu.setOnClickListener{
            mediaplayer.stop()
            val intent = Intent(this,Titlescreen::class.java)
            startActivity(intent)}


    }
}