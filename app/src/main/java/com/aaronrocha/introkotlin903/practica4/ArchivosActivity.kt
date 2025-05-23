package com.aaronrocha.introkotlin903.practica4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aaronrocha.introkotlin903.R
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.FileOutputStream

class ArchivosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_archivos)

        val btnGuardar = findViewById<Button>(R.id.saveButton)
        val btnLeer = findViewById<Button>(R.id.readButton)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val outPutText = findViewById<TextView>(R.id.outPutText)
        val inputText = findViewById<EditText>(R.id.inputText)
        val fileName = "datos.txt"


        btnGuardar.setOnClickListener {
            val text = inputText.text.toString()
            if (text.isNotEmpty()) {
                try {
                    FileOutputStream(filesDir.resolve(fileName), true).use {
                        it.write("$text\n".toByteArray())
                        Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show()
                        inputText.text.clear()
                    }
                } catch (e: Exception) {
                    Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show()
                    e.printStackTrace()
                }
            }
        }


        btnLeer.setOnClickListener {
            try {
                val file = filesDir.resolve(fileName)
                if (file.exists()) {
                    val contenido = file.readText()
                    outPutText.text = contenido
                    Toast.makeText(this, "Archivo leído", Toast.LENGTH_SHORT).show()
                } else {
                    outPutText.text = "Archivo no encontrado"
                }
            } catch (e: Exception) {
                outPutText.text = "Error al leer archivo"
                e.printStackTrace()
            }
        }


        btnBorrar.setOnClickListener {
            try {
                filesDir.resolve(fileName).delete()
                outPutText.text = ""
                Toast.makeText(this, "Archivo borrado", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Error al borrar", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}