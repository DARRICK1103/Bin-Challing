package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class G3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g3)

        val tvRndNumber3 = findViewById<TextView>(R.id.question)
        val subtotal3 = findViewById<TextView>(R.id.showdecimal)
        val BinaryNum3 = findViewById<TextView>(R.id.showbinary)
        val numQ = findViewById<TextView>(R.id.Q3)

        val mediaplayer = MediaPlayer.create(this@G3,R.raw.music4 )
        //mediaplayer.stop()
        mediaplayer.setLooping(true)
        mediaplayer.start()

        val bin1 = findViewById<Button>(R.id.one)
        val bin2 = findViewById<Button>(R.id.two)
        val bin4 = findViewById<Button>(R.id.four)
        val bin8 = findViewById<Button>(R.id.eight)
        val bin16 = findViewById<Button>(R.id.sixteen)
        val bin32 = findViewById<Button>(R.id.thirtytwo)
        val bin64 = findViewById<Button>(R.id.sixty)
        val bin128 = findViewById<Button>(R.id.onetwoeight)

        val option3 = intent.getIntExtra("option", 1) //get the number of questions from choose

        var tries3 = 0



        fun getRandomNumber3(): Int {
            return Random.nextInt(1,255)
        }

        var Question3 = getRandomNumber3()
        val Binary = Integer.toBinaryString(Question3)
        val num8 = 8
        tvRndNumber3.text = Binary.padStart(num8, '0') //add leading zeroes



        var NumOfQuestion = option3
        var times = 0
        var total = 0
        var q = 1
        val check = findViewById<Button>(R.id.check3)

        var storeQ = Question3

        check.setOnClickListener {
            tries3 ++



            if(total == storeQ)   //correct
            {

                Toast.makeText(this@G3, "Correct Answer!!!", Toast.LENGTH_SHORT).show()
                times++ //NumOfQuestion

                if(times == NumOfQuestion)
                {
                    mediaplayer.stop()
                    val intent = Intent(this@G3,Score::class.java)
                    intent.putExtra("Tries", tries3) //pass the number of question to
                    intent.putExtra("Option",option3)
                    startActivity(intent)

                }

                else
                {

                    fun getRandomNumber(): Int {
                        return Random.nextInt(1,255)
                    }

                    var Question = getRandomNumber()
                    val Binary = Integer.toBinaryString(Question)
                    val num8 = 8
                    tvRndNumber3.text = Binary.padStart(num8, '0') //add leading zeroes



                    total = 0
                    subtotal3.text ="Subtotal: " + total.toString()
                    val binary = Integer.toBinaryString(total)
                    val numOfInterger = 8
                    BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes
                    storeQ = Question

                    q++
                    numQ.text = "Q" + q.toString()

                }




            }

            else
            {
                Toast.makeText(this@G3, "Incorrect Answer!!! Please try again!!!", Toast.LENGTH_SHORT).show()
                total = 0
                subtotal3.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes
            }


        }
        bin1.setOnClickListener{
            total+=1
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes

        }
        bin2.setOnClickListener{
            total+=2
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin4.setOnClickListener{
            total+=4
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin8.setOnClickListener{
            total+=8
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin16.setOnClickListener {
            total+=16
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin32.setOnClickListener {
            total+=32
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin64.setOnClickListener {
            total+=64
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes


        }
        bin128.setOnClickListener {
            total+=128
            subtotal3.text ="Subtotal: " + total.toString()
            val binary = Integer.toBinaryString(total)
            val numOfInterger = 8
            BinaryNum3.text = binary.padStart(numOfInterger, '0') //add leading zeroes



        }



    }



}