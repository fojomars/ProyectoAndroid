package com.example.proyectoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculo.*

class Calculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        // Botón para resolver el cálculo
        btnSuma.setOnClickListener{
            // Variable numero1 donde se almacena el primer número intrducido por teclado
            val numero1 = Integer.parseInt(Numero1.text.toString())
            // Variable numero2 donde se almacena el segundo número introducido por teclado
            val numero2 = Integer.parseInt(Numero2.text.toString())
            // calculo es la variable donde se almacena el cálculo para después poder mostrar si el resultado es correcto
            val calculo = (numero1 + 4)- numero2
            txtResultado.setText(calculo.toString())
        }
    }
}
