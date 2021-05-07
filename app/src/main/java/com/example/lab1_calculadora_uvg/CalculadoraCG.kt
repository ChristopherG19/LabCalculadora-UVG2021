package com.example.lab1_calculadora_uvg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CalculadoraCG : AppCompatActivity() {

    private var Num1: Double = 0.0
    private var Num2: Double = 0.0
    private var Ope: Int = 0

    lateinit var txtOperacion: TextView
    lateinit var txtResultado: TextView

    lateinit var res: String
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
        res = ""
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
        btnDivision = findViewById(R.id.btnDivision)
        btnPoint = findViewById(R.id.btnPoint)
        btnDeleteAll = findViewById(R.id.btnDeleteAll)

        btnNine.setOnClickListener {
            res += "9"
            txtResultado.text = res
        }
        btnEight.setOnClickListener {
            res += "8"
            txtResultado.text = res
        }
        btnSeven.setOnClickListener {
            res += "7"
            txtResultado.text = res
        }
        btnSix.setOnClickListener {
            res += "6"
            txtResultado.text = res
        }
        btnFive.setOnClickListener {
            res += "5"
            txtResultado.text = res
        }
        btnFour.setOnClickListener {
            res += "4"
            txtResultado.text = res
        }
        btnThree.setOnClickListener {
            res += "3"
            txtResultado.text = res
        }
        btnTwo.setOnClickListener {
            res += "2"
            txtResultado.text = res
        }
        btnOne.setOnClickListener {
            res += "1"
            txtResultado.text = res
        }
        btnZero.setOnClickListener {
            res += "0"
            txtResultado.text = res
        }


        btnMul.setOnClickListener {
            
        }
        btnMin.setOnClickListener {

        }
        btnSum.setOnClickListener {

        }
        btnDivision.setOnClickListener {

        }
        btnResu.setOnClickListener {

        }
        btnPoint.setOnClickListener {

        }
        btnDeleteAll.setOnClickListener {

        }


    }
}