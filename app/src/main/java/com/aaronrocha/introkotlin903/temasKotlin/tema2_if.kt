package com.aaronrocha.introkotlin903.temasKotlin


fun main() {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()

    if (sueldo > 3000) {
        println("Debe pagar impuestos maistro")
    } else {
        println("No debe pagar impuestos maistro")

    }




}