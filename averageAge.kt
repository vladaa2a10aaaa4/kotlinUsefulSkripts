fun main() {
    println("Рассчитаем средний возраст троих людей")

    print("Введите возраст первого человека: ")
    val age1 = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    print("Введите возраст второго человека: ")
    val age2 = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    print("Введите возраст третьего человека: ")
    val age3 = readln().toIntOrNull() ?: return println("Ошибка: введите целое число")

    // Проверка диапазона 1-130 для каждого возраста
    val ages = listOf(age1, age2, age3)
    val invalidAges = ages.filter { it !in 1..130 }

    if (invalidAges.isNotEmpty()) {
        println("Ошибка: возраст должен быть от 1 до 130 лет. Некорректные значения: ${invalidAges.joinToString()}")
        return
    }

    val averageAge = (age1 + age2 + age3) / 3.0

    // Форматирование вывода
    val formattedAge = if (averageAge % 1 == 0.0) {
        averageAge.toInt().toString()
    } else {
        "%.1f".format(averageAge)
    }

    println("Средний возраст этих троих: $formattedAge года(лет)")
}