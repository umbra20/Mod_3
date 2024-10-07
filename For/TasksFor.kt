package Module_3.For

import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sqrt

const val pi = 3.14
fun main() {
      val a = 30
       val b = 60
       val result1 = (a + b) / 2
       println("Задача 1")
       println("Найти среднее арифметическое между $a и $b = " + result1)
       println("_______________________________________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")


    println("Задача 2")
    val S = 4
    val D = 2 * sqrt(S / pi) // диаметр круга
    val DD = String.format("%2f", D)
    val L = pi * D // длина окружности
    val LL = String.format("%2f", L)
    println("Площадь круга = $S: ")
    println( "Диаметр круга = " + DD)
    println("Длина окружности = " + LL)
    println("_______________________________________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 3")
    val x1= 10
    val x2 = 15
    val y1 = 11
    val y2 = 16
    val P = 2*(abs(x1-x2)+abs(y1-y2))
    println("Периметр прямоугольника равен: " + P)
    val Ss = abs(x1-x2)*abs(y1-y2)
    println("Площадь прямоугольника равна: " + Ss)
    println("_______________________________________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 4")
    var i = 1
    while (i <= 512) {
        println(i)
        i *= 2
    }

    println("_______________________________________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")
    println("Задача 5")

    for (i in 20 downTo 0 ) {
        if (i % 2 == 0) println("$i")
    }

}