package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class G2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g2)

        val tvRndNumber2 = findViewById<TextView>(R.id.textViewRandom)
        val subtotal2 = findViewById<TextView>(R.id.textViewaddup)
        val BinaryNum2 = findViewById<TextView>(R.id.textViewbinary)
        val numQ = findViewById<TextView>(R.id.numQ2)

        val mediaplayer = MediaPlayer.create(this@G2,R.raw.music3 )
        //mediaplayer.stop()
        mediaplayer.setLooping(true)
        mediaplayer.start()

        val b1a = findViewById<Button>(R.id.b1a)
        val b2a = findViewById<Button>(R.id.b2a)
        val b4a = findViewById<Button>(R.id.b4a)
        val b8a = findViewById<Button>(R.id.b8a)

        val option = intent.getIntExtra("option1", 1) //get the number of questions from choose

        var tries = 0

        fun getRandomNumber1(): Int {
            return Random.nextInt(1, 15)
        }

        var Question1 = getRandomNumber1()
        tvRndNumber2.text = Question1.toString()

        var NumOfQuestion1 = option
        var times1 = 0
        var q = 1
        var total1 = 0

        val check1 = findViewById<Button>(R.id.checkbutton2)

        var storeQ1 = Question1

        check1.setOnClickListener {
            tries++

            if (total1 == storeQ1)   //correct
            {

                Toast.makeText(this@G2, "Correct Answer!!!", Toast.LENGTH_SHORT).show()
                times1++ //NumOfQuestion

                if (times1 == NumOfQuestion1) {
                    mediaplayer.stop()
                    val intent = Intent(this@G2, Score::class.java)

                    intent.putExtra("Tries", tries) //pass the number of question to
                    intent.putExtra("Option", option)
                    startActivity(intent)

                } else {

                    fun getRandomNumber1(): Int {
                        return Random.nextInt(1, 15)
                    }

                    var Question1 = getRandomNumber1()
                    tvRndNumber2.text = Question1.toString()

                    total1 = 0
                    subtotal2.text = "Subtotal: " + total1.toString()
                    val binary1 = Integer.toBinaryString(total1)
                    val numOfInterger1 = 4
                    BinaryNum2.text = binary1.padStart(numOfInterger1, '0') //add leading zeroes
                    storeQ1 = Question1

                    q++
                    numQ.text = "Q" + q.toString()
                }


            } else {
                Toast.makeText(
                    this@G2,
                    "Incorrect Answer!!! Please try again!!!",
                    Toast.LENGTH_SHORT
                ).show()
                total1 = 0
                subtotal2.text = "Subtotal: " + total1.toString()
                val binary1 = Integer.toBinaryString(total1)
                val numOfInterger1 = 4
                BinaryNum2.text = binary1.padStart(numOfInterger1, '0') //add leading zeroes
            }
        }
            b1a.setOnClickListener{
                total1+=1
                subtotal2.text ="Subtotal: " + total1.toString()
                val binary1 = Integer.toBinaryString(total1)
                val numOfInterger1 = 4
                BinaryNum2.text = binary1.padStart(numOfInterger1, '0') //add leading zeroes

            }
            b2a.setOnClickListener{
                total1+=2
                subtotal2.text ="Subtotal: " + total1.toString()
                val binary1 = Integer.toBinaryString(total1)
                val numOfInterger1 = 4
                BinaryNum2.text = binary1.padStart(numOfInterger1, '0') //add leading zeroes


            }
            b4a.setOnClickListener{
                total1+=4
                subtotal2.text ="Subtotal: " + total1.toString()
                val binary = Integer.toBinaryString(total1)
                val numOfInterger1 = 4
                BinaryNum2.text = binary.padStart(numOfInterger1, '0') //add leading zeroes


            }
            b8a.setOnClickListener{
                total1+=8
                subtotal2.text ="Subtotal: " + total1.toString()
                val binary = Integer.toBinaryString(total1)
                val numOfInterger1 = 4
                BinaryNum2.text = binary.padStart(numOfInterger1, '0') //add leading zeroes


            }


        }
    }