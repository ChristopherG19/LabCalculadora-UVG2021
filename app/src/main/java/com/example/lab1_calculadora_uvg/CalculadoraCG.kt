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
            Accion("9")
        }
        btnEight.setOnClickListener {
            Accion("8")
        }
        btnSeven.setOnClickListener {
            Accion("7")
        }
        btnSix.setOnClickListener {
            Accion("6")
        }
        btnFive.setOnClickListener {
            Accion("5")
        }
        btnFour.setOnClickListener {
            Accion("4")
        }
        btnThree.setOnClickListener {
            Accion("3")
        }
        btnTwo.setOnClickListener {
            Accion("2")
        }
        btnOne.setOnClickListener {
            Accion("1")
        }
        btnZero.setOnClickListener {
            Accion("0")
        }
        btnPoint.setOnClickListener {
            Accion(".")
        }
        btnMul.setOnClickListener {
            Oper(Mul)
        }
        btnMin.setOnClickListener {
            Oper(Resta)
        }
        btnSum.setOnClickListener {
            Oper(Suma)
        }
        btnDivision.setOnClickListener {
            Oper(Div)
        }
        btnResu.setOnClickListener {
            var ResOperacion =
                when(Ope){
                Suma -> Num1 + Num2
                Resta -> Num1 - Num2
                Mul -> Num1 * Num2
                Div -> Num1 / Num2
                else -> 0
            }
            txtResultado.text = ResOperacion.toString()
        }
        btnDeleteAll.setOnClickListener {
            Num1 = 0.0
            Num2 = 0.0
            txtResultado.text= ""
            Ope = SinValor
        }
    }

    private fun Oper(Ope : Int){
        this.Ope = Ope
        txtResultado.text = " "
    }

    private fun Accion(Dato : String){
        txtResultado.text = "${txtResultado.text}$Dato"

        if(Ope == SinValor){
            Num1 = txtResultado.text.toString().toDouble()
        } else {
            Num2 = txtResultado.text.toString().toDouble()
        }
    }

    companion object {
        const val Suma = 1
        const val Resta = 2
        const val Mul = 3
        const val Div = 4
        const val SinValor = 0
    }
}