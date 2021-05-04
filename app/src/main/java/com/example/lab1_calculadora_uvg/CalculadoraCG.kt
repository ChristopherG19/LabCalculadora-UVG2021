package com.example.lab1_calculadora_uvg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CalculadoraCG : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var Res: String
    lateinit var btnNine: Button
    lateinit var btnEight: Button
    lateinit var btnSeven: Button
    lateinit var btnSix: Button
    lateinit var btnFive: Button
    lateinit var btnFour: Button
    lateinit var btnThree: Button
    lateinit var btnTwo: Button
    lateinit var btnOne: Button
    lateinit var btnZero: Button
    lateinit var btnMul: Button
    lateinit var btnMin: Button
    lateinit var btnSum: Button
    lateinit var btnResu: Button
    lateinit var btnPoint: Button
    lateinit var btnDivision: Button
    lateinit var btnDeleteAll: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadoracg)
        Res = ""
        txtResultado = findViewById(R.id.infoPantalla)
        btnNine = findViewById(R.id.btnNine)
        btnEight = findViewById(R.id.btnEight)
        btnSeven = findViewById(R.id.btnSeven)
        btnSix = findViewById(R.id.btnSix)
        btnFive = findViewById(R.id.btnFive)
        btnFour = findViewById(R.id.btnFour)
        btnThree = findViewById(R.id.btnThree)
        btnTwo = findViewById(R.id.btnTwo)
        btnOne = findViewById(R.id.btnOne)
        btnZero = findViewById(R.id.btnZero)
        btnMul = findViewById(R.id.btnMul)
        btnMin = findViewById(R.id.btnMin)
        btnSum = findViewById(R.id.btnSum)
        btnResu = findViewById(R.id.btnResu)
        btnPoint = findViewById(R.id.btnPoint)
        btnDeleteAll = findViewById(R.id.btnDeleteAll)
        btnDivision = findViewById(R.id.btnDivision)

        btnNine.setOnClickListener {
            Res += "9"
            txtResultado.text = Res
        }
        btnEight.setOnClickListener {
            Res += "8"
            txtResultado.text = Res
        }
        btnSeven.setOnClickListener {
            Res += "7"
            txtResultado.text = Res
        }
        btnSix.setOnClickListener {
            Res += "6"
            txtResultado.text = Res
        }
        btnFive.setOnClickListener {
            Res += "5"
            txtResultado.text = Res
        }
        btnFour.setOnClickListener {
            Res += "4"
            txtResultado.text = Res
        }
        btnThree.setOnClickListener {
            Res += "3"
            txtResultado.text = Res
        }
        btnTwo.setOnClickListener {
            Res += "2"
            txtResultado.text = Res
        }
        btnOne.setOnClickListener {
            Res += "1"
            txtResultado.text = Res
        }
        btnZero.setOnClickListener {
            Res += "0"
            txtResultado.text = Res
        }
        btnMul.setOnClickListener {
            Res += "*"
            txtResultado.text = Res
        }
        btnMin.setOnClickListener {
            Res += "-"
            txtResultado.text = Res
        }
        btnSum.setOnClickListener {
            Res += "+"
            txtResultado.text = Res
        }
        btnDivision.setOnClickListener {
            Res += "/"
            txtResultado.text = Res
        }
        btnResu.setOnClickListener {
            Res = ""
            txtResultado.text = "Calculando"
        }
        btnPoint.setOnClickListener {
            Res += "."
            txtResultado.text = Res
        }
        btnDeleteAll.setOnClickListener {
            Res = ""
            txtResultado.text = Res
        }

    }
}