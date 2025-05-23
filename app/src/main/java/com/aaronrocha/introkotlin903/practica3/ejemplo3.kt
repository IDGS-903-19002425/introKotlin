package com.aaronrocha.introkotlin903.practica3

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aaronrocha.introkotlin903.R

class ejemplo3 : AppCompatActivity() {
    private lateinit var tv1: EditText
    private lateinit var edt1: EditText
    private lateinit var button: EditText
    private var num =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo3)
        tv1 = findViewById(R.id.tv1)
        edt1 = findViewById(R.id.edt1)
        button = findViewById(R.id.button)
        num = (Math.random() * 1000001).toInt()
        val cadena = num.toString()
        val notificacion = Toast.makeText(this,cadena,Toast.LENGTH_SHORT)
        notificacion.show()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun controlar(view: android.view.View){
        val valorIngresado = edt1.text.toString().toInt()
        val valor = valorIngresado.toInt()
        if(valor == num){
            val notificacion = Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT)
            notificacion.show()
        }else{
            Toast.makeText(this,"El numero es incorrecto incorrecto",Toast.LENGTH_SHORT).show()
        }
    }
}