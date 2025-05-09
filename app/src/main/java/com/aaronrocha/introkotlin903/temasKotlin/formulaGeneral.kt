package com.aaronrocha.introkotlin903.temasKotlin

import kotlin.math.sqrt

/*
practica3: formula general de la serie de fibonacci for o while
 */

fun main() {

    do{
        var a : Double = 0.0
        var b : Double= 0.0
        var c : Double = 0.0
        try {
            while (true) {
                try{
                println("Dame el valor de a:")
                 a = readln().toDouble()
                if (a == 0.0) {
                    println("a no puede ser 0 o tiene que ser un numero valido")
                    continue

                }
                    break
                }catch (e: NumberFormatException){
                    println("Ingrea un formato de numeros correctos")

                }
            }
            while (true) {
                try{
                    print("Dame el valor de b: ")
                    b = readln().toDouble()
                    break
                }catch (e: NumberFormatException) {
                    println("Ingresa un formato de numeros correctos")
                }

            }
            while (true) {
                try{
                println("Dame el valor de c")
                c = readln().toDouble()
                    break
                }catch (e: NumberFormatException){
                    println("Ingresa un formato de numeros correctos")
                }
            }

            var discriminante = b * b - 4 * a * c

            when{
                discriminante > 0 -> {
                    var x1 = (-b + sqrt(discriminante)) / (2 * a)
                    var x2 = (-b - sqrt(discriminante)) / (2 * a)
                    println("El valor de x1 es $x1")
                    println("El valor de x2 es $x2")
                }
                discriminante == 0.0 -> {
                    var x = -b / (2 * a)
                    println("El valor de x es $x")
                }
                else -> {
                    val real = -b / (2 * a)
                    val imaginario = sqrt(-discriminante) / (2 * a)
                    println("El valor de x1 es $real + $imaginario")
                    println("El valor de x2 es $real - $imaginario")
                }
            }
            break
        }catch (e: NumberFormatException){
            println("Ingresa formato de numeros correctos")
        }catch (e: IllegalArgumentException){
            println("Error" + e.message)
        }catch (e: ArithmeticException){
            print("Error: "+ e.message)
        }
    }while(true)

}

