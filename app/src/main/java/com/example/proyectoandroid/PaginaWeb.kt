package com.example.proyectoandroid

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pagina_web.*
import org.jetbrains.anko.browse

class PaginaWeb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_web)

        // Botón par buscar la información
        btnInformacion.setOnClickListener {
            browse("https://es.wikipedia.org/wiki/Espa%C3%B1a_en_la_Copa_Mundial_de_F%C3%BAtbol_de_2010")
        }

        // Variable en la que se guarda el año para comprobar si es correcto
        val anho = txtAnho.text
        // Botón con el que se comprueba que el año es correcto
        btnConfirmar.setOnClickListener{
            val intent = Intent()
            intent.putExtra("confirmar",anho.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
