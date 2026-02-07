import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Введите радиус окружности: ")

    val radius = readln().toDoubleOrNull() ?: run {
        println("Ошибка: введите число")
        return
    }

    if (radius <= 0) {
        println("Ошибка: радиус должен быть положительным числом")
        return
    }

    val circumference = 2 * PI * radius
    val area = PI * radius.pow(2)

    println(
        """
        |Результаты вычислений:
        |Радиус: ${"%.2f".format(radius)} 
        |Длина окружности: ${"%.2f".format(circumference)}
        |Площадь круга: ${"%.2f".format(area)}
        """.trimMargin()
    )
}