package se.magictechnology.pia9intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toptext = findViewById<TextView>(R.id.theTopText)
        val topbutton = findViewById<Button>(R.id.theTopButton)





        toptext.text = "Hejsan hej!!!"

        topbutton.setOnClickListener {
            toptext.text = "BANAN!!!"
        }


    }






}