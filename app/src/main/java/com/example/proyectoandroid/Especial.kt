package com.example.proyectoandroid

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_especial.*

class Especial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_especial)

        // Botón del verde azulado
        btnVerdeAzulado.setOnClickListener {
            onClick(it)
        }

        // Boton Verde
        btnVerde.setOnClickListener {
            onClick(it)
        }

        // Boton Verde Claro
        btnVerdeClaro.setOnClickListener {
            onClick(it)
        }

        // Boton Lima
        btnLima.setOnClickListener {
            onClick(it)
        }


    }
    // Creo una función para cambiar de color el fondo de la app cada vez que pulso un de los botones
    fun onClick(v:View) {
        val color:Int
        val contenedor = v.getRootView()
        when (v.getId()) {
            R.id.btnVerdeAzulado -> color = Color.parseColor("#80CBC4") // Verde azulado
            R.id.btnVerde -> color = Color.parseColor("#A5D6A7") // Verde
            R.id.btnVerdeClaro -> color = Color.parseColor("#C5E1A5") // Verde claro
            R.id.btnLima -> color = Color.parseColor("#E6EE9C") // Lima
            else -> color = Color.WHITE // Blano
        }
        contenedor.setBackgroundColor(color)
    }
}
