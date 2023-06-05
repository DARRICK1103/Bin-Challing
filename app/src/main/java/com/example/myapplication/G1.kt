package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class G1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g1)

        val tvRndNumber = findViewById<TextView>(R.id.randomNumber)
        val subtotal = findViewById<TextView>(R.id.subtotal)
        val BinaryNum = findViewById<TextView>(R.id.BinaryNum)
        val numQ = findViewById<TextView>(R.id.numQ)

        val mediaplayer = MediaPlayer.create(this@G1,R.raw.music2 )
        //mediaplayer.stop()
        mediaplayer.setLooping(true)
        mediaplayer.start()

        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b4 = findViewById<Button>(R.id.b4)
        val b8 = findViewById<Button>(R.id.b8)
        val b16 = findViewById<Button>(R.id.b16)
        val b32 = findViewById<Button>(R.id.b32)
        val b64 = findViewById<Button>(R.id.b64)
        val b128 = findViewById<Button>(R.id.b128)

        val option = intent.getIntExtra("option", 1) //get the number of questions from choose

        var tries = 0



        fun getRandomNumber(): Int {
            return Random.nextInt(1,255)
        }

        var Question = getRandomNumber()
        tvRndNumber.text = Question.toString()

        var NumOfQuestion = option
        var times = 0
        var total = 0
        var q = 1
        val check = findViewById<Button>(R.id.Check)

        var storeQ = Question

        check.setOnClickListener {
            tries ++



            if(total == storeQ)   //correct
            {

                Toast.makeText(this@G1, "Correct Answer!!!", Toast.LENGTH_SHORT).show()
                times++ //NumOfQuestion

                if(times == NumOfQuestion)
                {
                    mediaplayer.stop()
                    val intent = Intent(this@G1,Score::class.java)
                    intent.putExtra("Tries", tries) //pass the number of question to
                    intent.putExtra("Option",option)

                    startActivity(intent)

                }

                else
                {

                    fun getRandomNumber(): Int {
                        return Random.nextInt(1,255)
                    }

                    var Question = getRandomNumber()
                    tvRndNumber.text = Question.toString()

                    total = 0
                    subtotal.text ="Subtotal: " + total.toString()
                    val binary = Integer.toBinaryString(total)
                    val numOfInterger = 8
                    BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes
                    storeQ = Question

                    q++
                    numQ.text = "Q" + q.toString()

                }




            }

            else
            {
                Toast.makeText(this@G1, "Incorrect Answer!!! Please try again!!!", Toast.LENGTH_SHORT).show()
                total = 0
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes
            }


        }
            b1.setOnClickListener{
                total+=1
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes

            }
            b2.setOnClickListener{
                total+=2
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b4.setOnClickListener{
                total+=4
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b8.setOnClickListener{
                total+=8
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b16.setOnClickListener {
                total+=16
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b32.setOnClickListener {
                total+=32
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b64.setOnClickListener {
                total+=64
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes


            }
            b128.setOnClickListener {
                total+=128
                subtotal.text ="Subtotal: " + total.toString()
                val binary = Integer.toBinaryString(total)
                val numOfInterger = 8
                BinaryNum.text = binary.padStart(numOfInterger, '0') //add leading zeroes



            }

    }



}


