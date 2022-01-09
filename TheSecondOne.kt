package com.example.threeinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class TheSecondOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_second_one)

        var clicked:Boolean = true;
        var counts:Int = 0;
        var counts2:Int = 0;

        val rollButton: Button = findViewById(R.id.rollBtn);
        val textview: TextView = findViewById(R.id.count1);
        val imageview: ImageView = findViewById(R.id.imageView);
        var c1:Int = 0;

        val rollButton2: Button = findViewById(R.id.rollBtn2);
        val textview2: TextView = findViewById(R.id.counter2);
        val imageview2: ImageView = findViewById(R.id.imageView2);
        var c2:Int = 0;

        val replay: Button = findViewById(R.id.replayBtn);
        replay.isVisible = false;

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

            counts += c1;

            textview.text = counts.toString();

            if (counts >= 10) {
                textview.text = "WON!!";
                textview2.text = "LOST!!";

                replay.isVisible = true;



                rollButton.setEnabled(false);
                rollButton2.setEnabled(false);
            }



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

            counts2 += c2;

            textview2.text = counts2.toString();

            rollButton2.setEnabled(false);
            rollButton.setEnabled(true);



            if (counts2 >= 10) {
                textview.text = "LOST!!";
                textview2.text = "WON!!";

                replay.isVisible = true;

                rollButton.setEnabled(false);
                rollButton2.setEnabled(false);
            }
//            else {
//                textview.text = "DRAW!!";
//                textview2.text = "DRAW!!";
//            }

        }

        replay.setOnClickListener {

            rollButton.setEnabled(true);
            rollButton2.setEnabled(false);

            counts = 0;

            counts2 = 0;

            textview.text = "START";
            textview2.text = "START";

            imageview.setImageResource(R.drawable.dice_1);
            imageview2.setImageResource(R.drawable.dice_1);

            replay.isVisible = false;

        }



    }
}