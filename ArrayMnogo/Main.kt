package Module_3.ArrayMnogo

fun main() {
       val arrayNumber = arrayOf(
           arrayOf(3, 6, 10),
           arrayOf(5, 11, 1),
           arrayOf(24, 13, 2)
       )
       var min = arrayNumber[0][0]
       println("Задача 1. Найти минимальный элемент в целочисленном массиве размера 3 х 3 \n")
       for (i in arrayNumber.indices) {
           for (j in arrayNumber.indices) {
               print("${arrayNumber[i][j]} ")
           }
           println()
       }

       for (i in arrayNumber.indices) {
           for (j in arrayNumber[i].indices) {
               if (min > arrayNumber[i][j]) {
                   min = arrayNumber[i][j]
               }
           }
       }
       println("Минимальный элемент - $min ")
       println("____________________________")
       do {
           println("Нажмите Enter, чтоб продолжить...")
           val input = readLine()
       } while (input != "")


    println("Задача 2. Создать матрицу размером 3 х 5. Найти элемент в этом массиве, \n" +
            " который является средним(медиана). \n")
    println()
    val arr = arrayOf(
        arrayOf(1, 9, 5, 4, 15),
        arrayOf(6, 7, 8, 2, 10),
        arrayOf(13, 12, 11, 14, 3)
    )
    val result = arr.flatten().sorted()
    val n = result.size
println("Отсортированный массив - " + result)
    val median = if (n % 2 == 0) {
        (result[n / 2 - 1] + result[n / 2]) / 2.0
    } else {
        result[n / 2].toDouble()
    }

    // Print the median
    println("Медиан массива: $median")
    println("____________________________")
       do {
           println("Нажмите Enter, чтоб продолжить...")
           val input = readLine()
       } while (input != "")

    println("Задача 3. Дана матрица размером 5 х 5. Заполнить в определенном порядке \n")

    val matrix = arrayOf(
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 1, 0, 0),
        arrayOf(0, 1, 1, 1, 0),
        arrayOf(1, 1, 1, 1, 1)
    )
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]} ")

        }
        println()
    }
    println("____________________________")
       do {
           println("Нажмите Enter, чтоб продолжить...")
           val input = readLine()
       } while (input != "")

    println("Задача 4. Дан набор целых чисел. Найти второе максимальное число. \n")
    var numbers = arrayOf(2,3,1,4,5)
    var biggest = Int.MIN_VALUE
    var secondBiggest = Int.MIN_VALUE
println("Целые числа - " + numbers.contentToString())
    for (arrItem in numbers) {
        if (arrItem > biggest) {
            secondBiggest = biggest // Сохраняет предыдущее значение от самого большого до второго по величине
            biggest = arrItem
        } else if (arrItem > secondBiggest && arrItem < biggest) {
            //  Если  найдем число, которое больше второго по величине и меньше самого большого
            secondBiggest = arrItem
        }
    }

    println("Второе мах число: $secondBiggest")


}




