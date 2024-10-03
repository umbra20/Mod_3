package Module_3.Operator

import Module_2.Abstraction.Piano
import kotlin.math.PI

const val Pi = 3.14
fun main() {
    var a = 100  //1. Дана сторона квадрата a. Найти его периметр P=4∗a.
    var P = 4 * a

    var S = a * a  //2. Дана сторона квадрата a. Найти его площадь S=a*a

    var b = 20  //3. Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
    var Ss = a * b

    var Pp = 2 * (a + b)

    var d = 15 //4. Дан диаметр окружности d.
    var L = Pi * d //Найти длину окружности L=π∗d

    var Ll = 1000 //Дано расстояние L в сантиметрах.
    Ll /= 100  //Кол-во метров

    var A = 200
    var B = 30
    A /= B // кол-во отрезков

    println("P = " + P + " | " + "S = " + S + " | " +
            "Ss = " + Ss + " | " + "Pp = " + Pp + " | " +
            "L =" + L + " | " + "Ll = " + Ll + " | " + "A = " + A)


}

