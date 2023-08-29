package com.example.lanzardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtener el btn de la pantalla
        val lanzarDado = findViewById<MaterialButton>(R.id.btnLanzar)
        //Listener para el btn
        lanzarDado.setOnClickListener{
            fnLanzarDado()
        }
    }

    fun fnLanzarDado() {
        try {
            //Comprobar que el boton funciona
            Log.i("Dados","Esta funcionando el boton")
            //Generar numero aleatorio
            val numero: Int = (1..6).random()
            Log.i("Dados","$numero")
            val dado: ImageView = findViewById(R.id.imgDado)

            when(numero){
                1 -> dado.setImageResource(R.drawable.dado1)
                2 -> dado.setImageResource(R.drawable.dado2)
                3 -> dado.setImageResource(R.drawable.dado3)
                4 -> dado.setImageResource(R.drawable.dado4)
                5 -> dado.setImageResource(R.drawable.dado5)
                6 -> dado.setImageResource(R.drawable.dado6)
            }


        } catch (e : Exception) {
            Log.e("Error LanzarDado", e.message.toString())
        }

    }
}