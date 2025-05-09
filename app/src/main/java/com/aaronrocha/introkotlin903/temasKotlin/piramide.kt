package com.aaronrocha.introkotlin903.temasKotlin



fun main() {
    /*
    practica 2 = imprimir una piramide es * segun el numero dado por el usuario
    n = 5
    *
    **
    ***
    ****
    *****
    cuando se capture 0 terminar el programa, utilizando puro do - while
    */
    do{
        println("Dame un numero para construir una piramide: ")
        var n = readln().toInt()
        var i = 1
        do{
            var j = 1
            do{
                print("*")
                j++
            }while(j <= i)
            println("")
            i++
        }while(i <= n)
    }while(n != 0)



}