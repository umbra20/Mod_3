package Module_3.WhileDoWhile

import java.util.Scanner

fun main() {
       println("Задача 1")
       print("Введите число для поиска факториала: ")
       val scanner1 = Scanner(System.`in`)
       var num = scanner1.nextInt()
       var factorial = 1
       do {
           factorial *= num
           num--
       } while (num > 0)
       println("Факториал = $factorial")
       println("___________________________")

       do {
           println("Для продолжения нажмите - 1")
           val input = readln().toInt()
       } while (input != 1)

       println("Задача 2")
       val cost = 60
       print("Стоимость конфет 1 кг: $cost руб." + "\n")

       for (i in 1..10) {
           println("$i кг = " + i * cost + "руб.")
       }
       println("___________________________")

       do {
           println("Для продолжения нажмите - 1")
           val input = readln().toInt()
       } while (input != 1)

       println("Задача 3")
       var c1 = 10
       var c2 = 20
       println("Вывод чисел между $c1 и $c2")
       for (i in c1..c2) {
           println("Число - " + i)
       }
       var n = c2 - c1 + 1
       println("Кол-во чесел: " + n)
       println("___________________________")

       do {
           println("Для продолжения нажмите - 1")
           val input = readln().toInt()
       } while (input != 1)

       println("Задача 4")
       val x = 43
       println("Остаток от деления: $x на 10 = " + x % 10)
       println("____________________________")

       do {
           println("Для продолжения нажмите - 1")
           val input = readln().toInt()
       } while (input != 1)


    println("Задача 5")
    var ch = 20
    var count = 0
    println("Вывод чисел с диапазоном 1 - 20")
    while (count++ < ch) if (count % 4 == 0) println(count * 2)
    println("____________________________")

    do {
        println("Для продолжения нажмите - 1")
        val input = readln().toInt()
    } while (input != 1)


    println("Задача 6")
    val deposit = 350
    println("Первоначальный вклад: $deposit ")
    val procent = 7
    println("Процентная ставка: $procent %")
    val timePeriod = 9
    println("Продолжительность вклада: $timePeriod месяцев")

    val sum = deposit.toDouble()+deposit.toDouble()/100.0*procent*timePeriod

    println("Итого получаем за $timePeriod месяцев: $sum")

}






