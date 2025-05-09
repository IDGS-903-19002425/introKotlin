package com.aaronrocha.introkotlin903.temasKotlin


fun main() {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()

    if (sueldo > 3000) {
        println("Debe pagar impuestos maistro")
    } else {
        println("No debe pagar impuestos maistro")

    }

val mes = "1"
    when(mes){
        "1" -> println("Enero")
        "2" -> println("Febrero")
        "3" -> println("Marzo")
        "4" -> println("Abril")
        "5" -> println("Mayo")
        else -> println("Mes no valido")
    }


}