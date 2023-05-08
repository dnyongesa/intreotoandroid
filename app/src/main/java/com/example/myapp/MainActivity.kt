package com.example.myapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        Log.i("MainActivity","button was clicked")
        btnShowToast.setOnClickListener() {
            Toast.makeText(this, "daniel kokonya", Toast.LENGTH_LONG).show()
        }
    }
}
