fun input(prompt: String): String {
    print(prompt)
    return readLine()?.trim() ?: ""
}

fun main() {
    val rating = input("Оцените качество обслуживания от 1 до 5, где 1 - очень плохо, 5 - очень хорошо: \n")

    val ratingNumber = rating.toIntOrNull()
    if (ratingNumber == null || ratingNumber !in 1..5) {
        println("Ошибка: пожалуйста, введите число от 1 до 5\n")
        return
    }

    val comment = input("Добавьте комментарий: \n").takeIf { it.isNotBlank() } ?: "без комментария"

    println("Спасибо за Вашу оценку!\nВы поставили: $ratingNumber\nВы оставили комментарий: $comment")
}
