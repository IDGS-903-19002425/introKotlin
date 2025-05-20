package com.aaronrocha.introkotlin903.practica2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aaronrocha.introkotlin903.R


class OperasActivity : AppCompatActivity() {
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: EditText
    private lateinit var radioGroup: RadioGroup

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)
        radioGroup = findViewById(R.id.radioGroup)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calcular(view: android.view.View) {
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        if(radioGroup.checkedRadioButtonId == R.id.rbSumar){
            val suma = num1 + num2
            val result1 = "Resultado: $suma"
            tv1.setText(result1)
        }else if (radioGroup.checkedRadioButtonId == R.id.rbRestar){
            val resta = num1 - num2
            val  result1 = "Resultado: $resta"
            tv1.setText(result1)
        }else if(radioGroup.checkedRadioButtonId == R.id.rbMultiplicar){
            val multiplicar = num1 * num2
            val result1 = "Resultado: $multiplicar"
            tv1.setText(result1)
        }else if(radioGroup.checkedRadioButtonId == R.id.rbDividir){
            val dividir = num1/num2
            val resultado = "Resultado: $dividir"
            tv1.setText(resultado)
        }
    }
}


