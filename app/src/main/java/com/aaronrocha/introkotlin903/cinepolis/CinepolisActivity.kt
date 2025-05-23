package com.aaronrocha.introkotlin903.cinepolis

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aaronrocha.introkotlin903.R

class CinepolisActivity : AppCompatActivity() {
    private lateinit var edtNombre: EditText
    private lateinit var edtCompradores: EditText
    private lateinit var edtBoletos: EditText
    private lateinit var btnCalcular: Button
    private lateinit var tvResultado: TextView
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)

        edtNombre = findViewById(R.id.edtNombre)
        edtCompradores = findViewById(R.id.edtCompradores)
        edtBoletos = findViewById(R.id.edtBoletos)
        tvResultado = findViewById(R.id.tvResultado)
        btnCalcular = findViewById(R.id.btnCalcular)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcularBoletos(view: android.view.View) {
        val precioBoletos = 12.00
        val descuentoTarjeta = 0.10
        val descuento2 = 0.10
        val descuento3 = 0.15
        val nombre = edtNombre.text.toString()
        val compradores = edtCompradores.text.toString().toInt()
        val boletos = edtBoletos.text.toString().toInt()
        val tarjetaCineco = rbSi.isChecked
        val noTrajetaCineco = rbNo.isChecked
        val limiteBoletos = compradores * 7

        if (boletos > limiteBoletos) {
            Toast.makeText(this, "No se pueden comprar mas de 7 boletos por persona", Toast.LENGTH_SHORT).show()
        } else if (boletos == 2 || boletos == 1) {
            if (tarjetaCineco) {
                val costoBoletos = boletos * precioBoletos
                val precioDescuento = costoBoletos * descuentoTarjeta
                val precioFinal = costoBoletos - precioDescuento
                val resultado = "El precio a pagar es: $precioFinal"
                tvResultado.text = resultado
            } else if (noTrajetaCineco) {
                val costoBoletos = boletos * precioBoletos
                val precioFinal = costoBoletos
                val resultado = "El precio a pagar es: $precioFinal"
                tvResultado.text = resultado
            }
        } else if (boletos == 3 || boletos == 4 || boletos == 5) {
            val precioTotalBoletos = boletos * precioBoletos
            val precioDescuento = precioTotalBoletos * descuento2
            var precioFinal = precioTotalBoletos - precioDescuento
            val resultado: String

            if (tarjetaCineco) {
                val descuentoCineco = precioFinal * descuentoTarjeta
                precioFinal -= descuentoCineco
                resultado = "El precio a pagar es: $precioFinal"
            } else {
                resultado = "El precio a pagar es: $precioFinal"
            }
            tvResultado.text = resultado
        } else if (boletos > 5) {
            val precioTotalBoletos = boletos * precioBoletos
            val precioDescuento = precioTotalBoletos * descuento3
            var precioFinal = precioTotalBoletos - precioDescuento

            if (tarjetaCineco) {
                val descuentoCineco = precioFinal * descuentoTarjeta
                precioFinal -= descuentoCineco
            }

            val resultado = "El precio a pagar es: $precioFinal"
            tvResultado.text = resultado
        }
    }
}