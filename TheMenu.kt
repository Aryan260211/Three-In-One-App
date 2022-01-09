package com.example.threeinone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_the_menu.*



class TheMenu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_menu)

        game1.setOnClickListener {
            val intent = Intent(this, TheFirstOne::class.java)
            startActivity(intent)
            finish()
        }

        game2.setOnClickListener {
            val intent = Intent(this, TheSecondOne::class.java)
            startActivity(intent)
            finish()
        }

        game3.setOnClickListener {
            val intent = Intent(this, TheThirdOne::class.java)
            startActivity(intent)
            finish()
        }



    }
}