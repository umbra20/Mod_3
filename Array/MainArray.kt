package Module_3.Array


fun main() {
    println(
        "Задача 1. Создать массив из 10 чисел с плавающей точкой. \n " +
                "Найти произведение его элементов."
    )
    val arrayDouble = doubleArrayOf(1.1, 2.4, 3.2, 4.7, 5.1, 6.9, 7.5, 8.2, 9.8, 10.5)
    val result = arrayDouble.reduce { acc, i -> acc * i } // Как я понял, поиск произведение всех элементов массива
    println("Результат - " + result)

    println("____________________________")
    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 2. Создать массив из 8 целых чисел. \n Найти среднее арифметическое его элементов.")
    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val srednie = arrayInt.average()
    print("Массив чисел - ")
    for (i in arrayInt.indices)
        print(arrayInt[i])
    println()
    println("Средние из массива чисел - " + srednie)

    println("____________________________")
    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    println("Задача 3. Дан массив размерностью size. \n Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.")
    val arraySize = intArrayOf(2, 5, 6, 10, 11, 12, 60)
    print("Данный массив чисел - ")
    for (number in arraySize) {
        print("$number" + " ")
    }
    println()
    var count = 0
    print("Вывод четных чисел -  ")
    for (number in arraySize) {
        if (number % 2 == 0) {
            print("$number" + " ")
            count++
        }
    }
    println()
    println("Количество четных чисел = $count")


    println("____________________________")
    do {
        println("Нажмите Enter, чтоб продолжить...")
        val input = readLine()
    } while (input != "")

    val N = 10
    var i = 1
    val a = IntArray(N)
    println(
        "Задача 4.  Дано целое число N(>0). Сформировать и вывести целочисленный " +
                "массив размера N, \n содержащий степени двойки от первой до N-й: 2,4,8,16,…."
    )

    a[0] = 2 // инициализируем первый элемент массива
    for (i in 1 until N) {
        a[i] = a[i - 1] * 2 //Преобразуем в степерь 2
    }

    for (i in 0 until N) {
        println("$i : ${a[i]}") // Вывод под инедексом
    }

}