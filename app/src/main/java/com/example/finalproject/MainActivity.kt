package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.R
import com.google.android.material.button.MaterialButton
import android.content.Intent
import com.example.finalproject.activity_main2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<MaterialButton>(R.id.loginbtn)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, activity_main2::class.java)
            startActivity(intent)
        }
    }
}