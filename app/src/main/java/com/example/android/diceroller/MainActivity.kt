/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    /*private fun rollDice() {
        val randomInt = Random().nextInt(7) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.ball1
            2 -> R.drawable.ball2
            3 -> R.drawable.ball3
            4 -> R.drawable.ball4
            5 -> R.drawable.ball5
            6 -> R.drawable.ball6
            else -> R.drawable.ball7

        }
        diceImage.setImageResource(drawableResource)
    }*/
    private fun rollDice() {
        val randomInt = (1..7).shuffled().last()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.ball1
            2 -> R.drawable.ball2
            3 -> R.drawable.ball3
            4 -> R.drawable.ball4
            5 -> R.drawable.ball5
            6 -> R.drawable.ball6
            else -> R.drawable.ball7
        }
        diceImage.setImageResource(drawableResource)
    }

}
