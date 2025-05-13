package com.aaronrocha.introkotlin903.temasKotlin

fun saludo(){
    return println("Hola mundo")
}

fun suma(x: Int, y: Int): Int{
    return x+y
}
fun resta(x:Int,y:Int) = x-y


fun main() {
    println(saludo())
    println("" +
            "----------------------------------------------------------------------------------------------------------------------------------------")
    println(suma(10,20))
    println(resta(100,90))

}

