package com.example.commander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Buttons
         */
        val startButton : Button = findViewById(R.id.startButton)
        startButton.setOnClickListener{
            startButton.isEnabled = false
            startButton.isVisible = false
            val backButton1 : Button = findViewById(R.id.backButton1)
            val threePlayerButton : Button = findViewById(R.id.threePlayerButton)
            val fourPlayerButton : Button = findViewById(R.id.fourPlayerButton)
            backButton1.isEnabled = true
            backButton1.isVisible = true
            threePlayerButton.isEnabled = true
            threePlayerButton.isVisible = true
            fourPlayerButton.isEnabled = true
            fourPlayerButton.isVisible = true
        }
        val backButton1 : Button = findViewById(R.id.backButton1)
        backButton1.setOnClickListener{
            startButton.isEnabled = true
            startButton.isVisible = true
            val backButton1 : Button = findViewById(R.id.backButton1)
            val threePlayerButton : Button = findViewById(R.id.threePlayerButton)
            val fourPlayerButton : Button = findViewById(R.id.fourPlayerButton)
            backButton1.isEnabled = false
            backButton1.isVisible = false
            threePlayerButton.isEnabled = false
            threePlayerButton.isVisible = false
            fourPlayerButton.isEnabled = false
            fourPlayerButton.isVisible = false
        }
        val fourPlayerButton : Button = findViewById(R.id.fourPlayerButton)
        fourPlayerButton.setOnClickListener{
            val switchActivityIntent = Intent(this, PlayerSquares::class.java)
            startActivity(switchActivityIntent)
        }
    }
}