package com.example.assignment20app5100

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set status bar color
        window.statusBarColor = ContextCompat.getColor(this, R.color.coffee_dark)

        // Order button click listener
        val orderButton: Button = findViewById(R.id.orderButton)
        orderButton.setOnClickListener {
            Toast.makeText(
                this,
                "☕ Your order has been placed! Preparing your perfect brew...",
                Toast.LENGTH_LONG
            ).show()
        }

        // Menu button click listener
        val menuButton: Button = findViewById(R.id.menuButton)
        menuButton.setOnClickListener {
            Toast.makeText(
                this,
                "📖 Opening our menu of handcrafted beverages...",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}