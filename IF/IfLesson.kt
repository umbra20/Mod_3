package Module_3.IF

fun main() {
    var a = 10
    println("Задача 1")
    if (a > 0) {
        println(a + 1)
    } else println(a)
    println("_______________________________")
    println("Задача 2")
    println("Вывод положительных чисел: ")
    var a1 = 4
    var a2 = 45
    var a3 = -2
    var a4 = 8
    if (a1 > 0) {
        println(a1)
    }
    if (a2 > 0) {
        println(a2)
    }
    if (a3 > 0) {
        println(a3)
    }
    if (a4 > 0) {
        println(a4)
    }
    println("________________________________")
    println("Задача 3")
    var x1 = 10
    var x2 = 20
    if (x1 > x2) {
        println("$x1 - наибольшее из $x1 и $x2")
    } else {
        println("$x2 - наибольшее из чисел $x1 и $x2")
    }
    println("________________________________")
    println("Задача 4")
    var c = 4
    var day1 = "Понедельник"
    var day2 = "Вторник"
    var day3 = "Среда"
    var day4 = "Четверг"
    var day5 = "Пятница"
    var day6 = "Суббота"
    var day7 = "Воскресенье"

    if (c == 1) {
        println(day1)
    }
    if (c == 2) {
        println(day2)
    }
    if (c == 3) {
        println(day3)
    }
    if (c == 4) {
        println(day4)
    }
    if (c == 5) {
        println(day5)
    }
    if (c == 6) {
        println(day6)
    }
    if (c == 7) {
        println(day7)
    }
    println("________________________________")
    println("Задача 5")
    var K = 5
    if (K == 1) {
        println("Плохо")
    } else if (K == 2) {
        println("Неудовлетворительно")
    } else if (K == 3) {
        println("Удовлетворительно")
    } else if (K == 4) {
        println("Хорошо")
    } else if (K == 5) {
        println("Отлично")
    } else
        println("Ошибка")
    println("__________________________________")
    println("Задача 6")
    var number = 4
    var z1 = 20
    var z2 = 20
    if (number == 1) {
        println("$z1" + "+" + "$z2" + " = " + (z1 + z2))
    }
    if (number == 2) {
        println("$z1" + "-" + "$z2" + " = " + (z1 - z2))
    }
    if (number == 3) {
        println("$z1" + "*" + "$z2" + " = " + (z1 * z2))
    }
    if (number == 4) {
        println("$z1" + "/" + "$z2" + " = " + (z1 / z2))
    }

}
