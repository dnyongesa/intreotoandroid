package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        Log.i("MainActivity","button was clicked")
        btnShowToast.setOnClickListener() {
            makeText(this, "daniel kokonya", Toast.LENGTH_LONG).show()
        }

        val userMessage: TextView = findViewById(R.id.usermessage)
        val sendtonnextact : Button = findViewById(R.id.sendtonnextact)

        sendtonnextact.setOnClickListener {
            val message: String = userMessage.text.toString()
            if (message.isNotEmpty()) {
                makeText(this, message, Toast.LENGTH_LONG).show()
            } else {
                makeText(this, "the second button was clicked", Toast.LENGTH_LONG).show()
            }

            val intent = Intent(this, Second_activity::class.java)
            startActivity(intent)
        }
    }
}
