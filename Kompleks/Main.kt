package Module_3.Kompleks

import com.sun.net.httpserver.Authenticator.Success
import kotlin.contracts.contract

fun main() {
    val n = 1
    val b = 5 // кол-во вывода в консоль
    var sumSqr = 0.0
    println("Задача 1")
    for (i in n..b) {
        sumSqr += 1 / i.toDouble()

    }
    println(sumSqr)
    println("____________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 2")
    var c1 = 2
    var c2 = 4
    var sSqr = 0
    for (p in c1..c2) {
        sSqr += p * p

    }
    println(sSqr)
    println("____________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 3")
    var A = 3
    var B = 5

    var count = 0
    for (n in A..B) {
        repeat(++count) {
            println(" " + n)

        }

    }
    println("____________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 4")
    var nn = 23
    var proverka = false
    for (ii in 2..nn / 2) {
        if (nn % ii == 0) {
            proverka = true
            break
        }
    }
    if (!proverka)
        println("$nn - простое число")
    else
        println("$nn - не простое число")

    println("____________________________")

    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 5")
    println("Загадка: \"Что это такое: синий, большой, с усами и полностью набит зайцами?\"")
    print("Напишите ответ: ")
    var answer = readLine()
    val result = "троллейбус"

    repeat(2) {
        while (answer != result) {
            println("Подумай еще!")
            answer = readLine()
            continue
        }
    }
    if (answer == result) {
        println("Правильно")
    }
    if (answer != result)
        println("Правильный ответ был - троллейбус")
}








