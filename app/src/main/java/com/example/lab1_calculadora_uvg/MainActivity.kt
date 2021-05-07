package com.example.lab1_calculadora_uvg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculadora: Button = findViewById(R.id.btnInicio)

        btnCalculadora.setOnClickListener{
            val intent: Intent = Intent(this,CalculadoraCG::class.java)
            startActivity(intent)
            finish()
        }
    }
}