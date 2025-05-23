package com.aaronrocha.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aaronrocha.introkotlin903.cinepolis.CinepolisActivity
import com.aaronrocha.introkotlin903.practica1.saludoActivity
import com.aaronrocha.introkotlin903.practica2.OperasActivity
import com.aaronrocha.introkotlin903.practica3.ejemplo3
import com.aaronrocha.introkotlin903.practica4.ArchivosActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        // instanciando el boton
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnControl = findViewById<Button>(R.id.btn2)
        val btnArchivos = findViewById<Button>(R.id.btn3)
        val btnCinepolis = findViewById<Button>(R.id.btn4)


        btnSaludo.setOnClickListener{navegateToSaludo()}
        btnControl.setOnClickListener{navegateToEjemplo3()}
        btnArchivos.setOnClickListener{navegateToArchivos()}
        btnCinepolis.setOnClickListener{navegateToCinepolis()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }


private fun MenuActivity.navegateToCinepolis() {
    val intent = Intent(this, CinepolisActivity::class.java)
    startActivity(intent)
}

private fun MenuActivity.navegateToArchivos() {
    val intent = Intent(this, ArchivosActivity::class.java)
    startActivity(intent)
}

private fun MenuActivity.navegateToEjemplo3() {
    val intent = Intent(this, ejemplo3::class.java)
    startActivity(intent)
}

private fun MenuActivity.navegateToSaludo() {
    val intent = Intent(this, saludoActivity::class.java)
    startActivity(intent)


}
}
