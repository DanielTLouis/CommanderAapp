package com.example.commander

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.lang.Math.random
import kotlin.random.Random

class PlayerSquares : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playersquares)

        val firstOneTextView : TextView = findViewById(R.id.firstOneTextView)
        val firstTwoTextView : TextView = findViewById(R.id.firstTwoTextView)
        val firstThreeTextView : TextView = findViewById(R.id.firstThreeTextView)
        val firstFourTextView : TextView = findViewById(R.id.firstFourTextView)
        val rand : Int = (1..4).random()
        when(rand){
            1-> {
                firstOneTextView.isVisible = true
                firstTwoTextView.isVisible = false
                firstThreeTextView.isVisible = false
                firstFourTextView.isVisible = false
            }
            2-> {
                firstOneTextView.isVisible = false
                firstTwoTextView.isVisible = true
                firstThreeTextView.isVisible = false
                firstFourTextView.isVisible = false
            }
            3->{
                firstOneTextView.isVisible = false
                firstTwoTextView.isVisible = false
                firstThreeTextView.isVisible = true
                firstFourTextView.isVisible = false
            }
            4->{
                firstOneTextView.isVisible = false
                firstTwoTextView.isVisible = false
                firstThreeTextView.isVisible = false
                firstFourTextView.isVisible = true
            }

        }
        /**
         * Buttons
         */
        val decreaseSquareOneButton : ImageButton = findViewById(R.id.decreaseSquareOneButton)
        decreaseSquareOneButton.setOnClickListener{
            val squareOneText : TextView = findViewById(R.id.squareOneTextView)
            val temp : String = squareOneText.text as String
            val tempInt : Int = temp.toInt() - 1
            squareOneText.text = (tempInt).toString()
        }
        val increaseSquareOneButton : ImageButton = findViewById(R.id.increaseSquareOneButton)
        increaseSquareOneButton.setOnClickListener{
            val squareOneText : TextView = findViewById(R.id.squareOneTextView)
            val temp : String = squareOneText.text as String
            val tempInt : Int = temp.toInt() + 1
            squareOneText.text = (tempInt).toString()
        }
        val decreaseSquareTwoButton : ImageButton = findViewById(R.id.decreaseSquareTwoButton)
        decreaseSquareTwoButton.setOnClickListener{
            val squareTwoText : TextView = findViewById(R.id.squareTwoTextView)
            val temp : String = squareTwoText.text as String
            val tempInt : Int = temp.toInt() - 1
            squareTwoText.text = (tempInt).toString()
        }
        val increaseSquareTwoButton : ImageButton = findViewById(R.id.increaseSquareTwoButton)
        increaseSquareTwoButton.setOnClickListener{
            val squareTwoText : TextView = findViewById(R.id.squareTwoTextView)
            val temp : String = squareTwoText.text as String
            val tempInt : Int = temp.toInt() + 1
            squareTwoText.text = (tempInt).toString()
        }
        val decreaseSquareThreeButton : ImageButton = findViewById(R.id.decreaseSquareThreeButton)
        decreaseSquareThreeButton.setOnClickListener{
            val squareThreeText : TextView = findViewById(R.id.squareThreeTextView)
            val temp : String = squareThreeText.text as String
            val tempInt : Int? = temp.toInt() - 1
            squareThreeText.text = (tempInt).toString()
        }
        val increaseSquareThreeButton : ImageButton = findViewById(R.id.increaseSquareThreeButton)
        increaseSquareThreeButton.setOnClickListener{
            val squareThreeText : TextView = findViewById(R.id.squareThreeTextView)
            val temp : String = squareThreeText.text as String
            val tempInt : Int = temp.toInt() + 1
            squareThreeText.text = (tempInt).toString()
        }
        val decreaseSquareFourButton : ImageButton = findViewById(R.id.decreaseSquareFourButton)
        decreaseSquareFourButton.setOnClickListener{
            val squareFourText : TextView = findViewById(R.id.squareFourTextView)
            val temp : String = squareFourText.text as String
            val tempInt : Int = temp.toInt() - 1
            squareFourText.text = (tempInt).toString()
        }
        val increaseSquareFourButton : ImageButton = findViewById(R.id.increaseSquareFourButton)
        increaseSquareFourButton.setOnClickListener{
            val squareFourText : TextView = findViewById(R.id.squareFourTextView)
            val temp : String = squareFourText.text as String
            val tempInt : Int = temp.toInt() + 1
            squareFourText.text = (tempInt).toString()
        }
        val menuButton : Button = findViewById(R.id.menuButton)
        menuButton.setOnClickListener(){
            val menuView : View = findViewById(R.id.menuView)
            menuView.isVisible = true
            val backButtonX : Button = findViewById(R.id.backButtonX)
            backButtonX.isEnabled = true
            backButtonX.isVisible = true
            val resetButton : Button = findViewById(R.id.resetButton)
            resetButton.isEnabled = true
            resetButton.isVisible = true
            val homeButton : Button = findViewById(R.id.homeButton)
            homeButton.isEnabled = true
            homeButton.isVisible = true
            val menuTextView : TextView = findViewById(R.id.menuTextView)
            menuTextView.isVisible = true

            increaseSquareOneButton.isEnabled = false
            decreaseSquareOneButton.isEnabled = false
            increaseSquareTwoButton.isEnabled = false
            decreaseSquareTwoButton.isEnabled = false
            increaseSquareThreeButton.isEnabled = false
            decreaseSquareThreeButton.isEnabled = false
            increaseSquareFourButton.isEnabled = false
            decreaseSquareFourButton.isEnabled = false

            menuButton.isEnabled = false
            menuButton.isVisible = false
        }
        val backButtonX : Button = findViewById(R.id.backButtonX)
        backButtonX.setOnClickListener(){
            val menuButton : Button = findViewById(R.id.menuButton)
            menuButton.isEnabled = true
            menuButton.isVisible = true
            val menuView : View = findViewById(R.id.menuView)
            menuView.isVisible = false
            val resetButton : Button = findViewById(R.id.resetButton)
            resetButton.isEnabled = false
            resetButton.isVisible = false
            val homeButton : Button = findViewById(R.id.homeButton)
            homeButton.isEnabled = false
            homeButton.isVisible = false
            val menuTextView : TextView = findViewById(R.id.menuTextView)
            menuTextView.isVisible = false

            increaseSquareOneButton.isEnabled = true
            decreaseSquareOneButton.isEnabled = true
            increaseSquareTwoButton.isEnabled = true
            decreaseSquareTwoButton.isEnabled = true
            increaseSquareThreeButton.isEnabled = true
            decreaseSquareThreeButton.isEnabled = true
            increaseSquareFourButton.isEnabled = true
            decreaseSquareFourButton.isEnabled = true

            backButtonX.isEnabled = false
            backButtonX.isVisible = false
        }
        val homeButton : Button = findViewById(R.id.homeButton)
        homeButton.setOnClickListener(){
            val switchActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(switchActivityIntent)
        }
        val resetButton : Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener(){
            val switchActivityIntent = Intent(this, PlayerSquares::class.java)
            startActivity(switchActivityIntent)
        }
    }
}