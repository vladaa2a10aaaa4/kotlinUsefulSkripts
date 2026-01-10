fun main() {
    println("Давай узнаем на сколько лет один человек старше другого")
    println("Сколько лет первому человеку?")
    val first = readln().toInt()
    println("Сколько лет второму человеку?")
    val second = readln().toInt()
    if (first > second) {
        val diff = first - second
        println("Первый старше второго на $diff ${getYearsForm(diff)}")
    } else if (second > first) {
        val diff = second - first
        println("Второй старше первого на $diff ${getYearsForm(diff)}")
    } else {
        println("Возраст одинаков")
    }
}

fun getYearsForm(years: Int): String {
    return when {
        years % 10 == 1 && years % 100 != 11 -> "год"
        years % 10 in 2..4 && years % 100 !in 12..14 -> "года"
        else -> "лет"
    }
}