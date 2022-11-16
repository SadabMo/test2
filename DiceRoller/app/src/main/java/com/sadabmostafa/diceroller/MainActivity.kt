package com.sadabmostafa.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * User have to predict the dice roll and see if it matches.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getting values from different views
        val rollButton: Button = findViewById(R.id.button);
        val score: TextView = findViewById(R.id.textView3);
        val diceValue: TextView = findViewById(R.id.textView4);
        val result: TextView = findViewById(R.id.textView5);
        //6 buttons to take user input for prediction
        val val1: Button = findViewById(R.id.value1)
        val val2: Button = findViewById(R.id.value3)
        val val3: Button = findViewById(R.id.value5)
        val val4: Button = findViewById(R.id.value2)
        val val5: Button = findViewById(R.id.value4)
        val val6: Button = findViewById(R.id.value6)
        val utility= Utility()
        var predict = -1;
        var roll = 0;
        rollDice()
        //click listener for different buttons
        val1.setOnClickListener { predict = 1;score.text = "1"; }
        val2.setOnClickListener { predict = 2;score.text = "2"; }
        val3.setOnClickListener { predict = 3;score.text = "3"; }
        val4.setOnClickListener { predict = 4;score.text = "4"; }
        val5.setOnClickListener { predict = 5;score.text = "5"; }
        val6.setOnClickListener { predict = 6;score.text = "6"; }
        //roll button for getting roll value.
        rollButton.setOnClickListener {
            roll = rollDice()
            diceValue.text = roll.toString();
            if (utility.checkResult(roll, predict)) {
                result.text = "You Predicted Correctly";
            } else {
                result.text = "Sorry! You were wrong"
            }
        }

    }
    private fun rollDice(): Int {
        val dice = Dice(6);
        val diceRoll = dice.roll();
        val diceView: ImageView = findViewById(R.id.imageView);
        when (diceRoll) {
            1 -> diceView.setImageResource(R.drawable.dice_1);
            2 -> diceView.setImageResource(R.drawable.dice_2);
            3 -> diceView.setImageResource(R.drawable.dice_3);
            4 -> diceView.setImageResource(R.drawable.dice_4);
            5 -> diceView.setImageResource(R.drawable.dice_5);
            6 -> diceView.setImageResource(R.drawable.dice_6);
        }
        diceView.contentDescription = diceRoll.toString()
        return diceRoll;
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
class Utility() {
    //for checking result
    fun checkResult(roll: Int, predict: Int): Boolean {
        return roll == predict
    }
    fun stringLenCalculator(string: String , Char_to_find : String): Int {
        var counter = 0
        for (c in string) {
            if (c.toString() == Char_to_find) {
                counter++
            }
        }
        return counter;
    }
    fun findIndex(string: String , Char_to_find : String):Int{
        var counter = 0
        for (c in string) {
            if (c.toString() == Char_to_find) {
               return counter
            }
            counter++
        }
        return -1
    }
    fun removeChar(string: String , Char_to_remove : String):String{
        return string.replace(Char_to_remove, "")
    }
}