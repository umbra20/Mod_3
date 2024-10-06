package Module_3.When

import kotlin.math.roundToInt

fun main() {
    val timeOfYear = 3 // 1 задача
    println("Задача 1")
    when (timeOfYear) {
        1 -> println("Январь: Зима")
        2 -> println("Февраль: Зима")
        3 -> println("Март: Весна")
        4 -> println("Апрель: Весна")
        5 -> println("Май: Весна")
        6 -> println("Июнь: Лето")
        7 -> println("Июль: Лето")
        8 -> println("Август: Лето")
        9 -> println("Сентябрь: Осень")
        10 -> println("Октябрь: Осень")
        11 -> println("Ноябрь: Осень")
        12 -> println("Декабрь: Зима")
        else -> println("Ошибка")
    }
    println("_________________________________________")
    println("Задача 2")
    val x: Double = 10.2 // 2 задача
    println("Число: $x округление до целого -  " + x.roundToInt())
    println("__________________________________________")
    println("Задача 3")
    val ztime = 21
    val value = when (ztime) {
        in 0..5 -> println("Раннее утро")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 17..20 -> println("Вечер")
        in 20..23 -> println("Поздний вечер")

        else -> "Ошибка"
    }
    println("__________________________________________")
    println("Задача 4")
    var a = 8
    var b = 5
    println("Меняем местами переменные \n a = $a с b = $b")
    a = a + b
    b = a - b
    a = a - b
    println("\n Результат после замены \n a = $a \n b = $b")
}