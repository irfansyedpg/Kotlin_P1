package me.irfansyed.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {


    var randomInt : Int = 0
    val drawableRsource = null

     lateinit var DiceImage_Image: ImageView
     lateinit var DiceImage2_Image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
         DiceImage_Image = findViewById(R.id.dice_image)
        DiceImage2_Image = findViewById(R.id.dice2_image)


        rollButton.setOnClickListener{rollDice()}




    }

    private fun rollDice() {
        randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage_Image.setImageResource(drawableResource)


        randomInt = Random().nextInt(6) + 1

        val drawableResource2 = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage2_Image.setImageResource(drawableResource2)


    }


}
