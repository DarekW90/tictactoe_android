package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity // <-- Make sure this import exists

var singleUser = false

class MainActivity : AppCompatActivity() { // <-- Corrected the class inheritance

    lateinit var singlePlayerBtn: Button
    lateinit var multiPlayerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) { // <-- Corrected the method signature
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // <-- Corrected setContentView

        singlePlayerBtn = findViewById(R.id.idBtnSinglePlayer) // <-- Corrected findViewById typo
        multiPlayerBtn = findViewById(R.id.idBtnMultiPlayer) // <-- Corrected findViewById typo

        singlePlayerBtn.setOnClickListener {
            // TODO: Implement single-player logic
            singleUser = true
            startActivity(Intent(this, GamePlayActivity::class.java))
        }

        multiPlayerBtn.setOnClickListener {
            // TODO: Implement single-player logic
            singleUser = false
            startActivity(Intent(this, GamePlayActivity::class.java))
        }
    }
}
