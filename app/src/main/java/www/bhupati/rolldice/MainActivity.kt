package www.bhupati.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)

        rollButton.setOnClickListener{
            rollDice()
            //Toast.makeText(this, "Button is clicked ", Toast.LENGTH_LONG).show()
        }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()

        val output = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceimage : ImageView = findViewById(R.id.result_imageview)

        diceimage.setImageResource(output)



    }
}