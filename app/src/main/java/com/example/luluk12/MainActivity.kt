package com.example.luluk12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.ok)
        val btn2 = findViewById<Button>(R.id.Ya)

        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)

        }
        btn2.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)

        }
    }
}