package com.aaronrocha.introkotlin903.temasKotlin

fun main() {
    do{
        print("Selecciona que operacion deseas hacer \n1.Suma  \n2.Resta \n3.Multiplicacion \n4.Division \n5.SALIR")
        val opcion = readln().toInt()
        if (opcion == 1){
            println("Suma")
            println("Ingresa el primer numero")
            val numero1 = readln().toDouble()
            println("Ingresa el segundo numero")
            val numero2 = readln().toDouble()
            println("La suma de los numeros es ${numero1 + numero2}")
        }
        if (opcion == 2){
            println("Resta")
            println("Ingresa el primer numero")
            val numero1 = readln().toDouble()
            println("Ingresa el segundo numero")
            val numero2 = readln().toDouble()
            println("La resta de los numeros es ${numero1 - numero2}")

        }
        if (opcion == 3){
            println("Multiplicacion")
            println("Ingresa el primer numero ")
            val numero1 = readln().toDouble()
            println("Ingresa el segundo numero")
            val numero2 = readln().toDouble()
            println("La multiplicacion de los numeros es ${numero1 * numero2}")

        }
        if (opcion == 4){
            print("Division")
            println("Ingresa el primer numero")
            val numero1 = readln().toDouble()
            println("ingresa el segundo numero")
            val numero2 = readln().toDouble()
            println("La division de los numeros es ${numero1 / numero2}")
        }
        if (opcion == 5)
            print("Saliendo.....")
    }while(opcion != 5)
}

