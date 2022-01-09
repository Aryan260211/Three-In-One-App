package com.example.threeinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TheFirstOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_first_one)

        var clicked:Boolean = true;

        val rollButton: Button = findViewById(R.id.rollBtn);
        val textview: TextView = findViewById(R.id.count1);
        val imageview: ImageView = findViewById(R.id.imageView);
        var c1:Int = 0;

        val rollButton2: Button = findViewById(R.id.rollBtn2);
        val textview2: TextView = findViewById(R.id.counter2);
        val imageview2: ImageView = findViewById(R.id.imageView2);
        var c2:Int = 0;

        rollButton2.setEnabled(false);

        rollButton.setOnClickListener {

            rollButton2.setEnabled(true);
            rollButton.setEnabled(false);

            c1 = (1..6).random();

            when(c1){

                1->imageview.setImageResource(R.drawable.dice_1);
                2->imageview.setImageResource(R.drawable.dice_2);
                3->imageview.setImageResource(R.drawable.dice_3);
                4->imageview.setImageResource(R.drawable.dice_4);
                5->imageview.setImageResource(R.drawable.dice_5);
                6->imageview.setImageResource(R.drawable.dice_6);

            }

            textview.text = c1.toString();


        }

        rollButton2.setOnClickListener {



            c2 = (1..6).random();

            when(c2){

                1->imageview2.setImageResource(R.drawable.dice_1);
                2->imageview2.setImageResource(R.drawable.dice_2);
                3->imageview2.setImageResource(R.drawable.dice_3);
                4->imageview2.setImageResource(R.drawable.dice_4);
                5->imageview2.setImageResource(R.drawable.dice_5);
                6->imageview2.setImageResource(R.drawable.dice_6);

            }

            textview2.text = c2.toString();

            rollButton2.setEnabled(false);
            rollButton.setEnabled(true);


            if (c1 > c2) {
                textview.text = "WON!!";
                textview2.text = "LOST!!";
            } else if (c1 < c2) {
                textview.text = "LOST!!";
                textview2.text = "WON!!";
            } else {
                textview.text = "DRAW!!";
                textview2.text = "DRAW!!";
            }

        }


    }
}