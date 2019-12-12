package com.example.proyectoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón cálculo matemático
        btnCalculo.setOnClickListener{
            val intent = Intent(this,Calculo::class.java)
            startActivity(intent)
        }

        // Reto 2: Botón de búsqueda en internet
        btnWeb.setOnClickListener{
            val intent2 = Intent(this,PaginaWeb::class.java)
            startActivity(intent2)
        }

        // Reto 3: Botón de capturar una imagen con la camara
        btnCamara.setOnClickListener {
            val  intent = Intent(this, Camara::class.java)
            startActivity(intent)
        }

        btnCambiar.setOnClickListener {
            val intent = Intent(this,Especial::class.java)
            startActivity(intent)
        }
    }
}
