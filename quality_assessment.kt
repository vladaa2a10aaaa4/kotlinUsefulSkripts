fun input(prompt: String): String {
    print(prompt)
    return readLine()?.trim() ?: ""
}

fun main() {
    val rating = input("Оцените качество обслуживания от 1 до 5, где 1 - очень плохо, 5 - очень хорошо: ")
    
    val ratingNumber = rating.toIntOrNull()
    if (ratingNumber == null || ratingNumber !in 1..5) {
        println("Ошибка: пожалуйста, введите число от 1 до 5")
        return
    }
    
    val comment = input("Добавьте комментарий: ").takeIf { it.isNotBlank() } ?: "без комментария"
    
    println("\n=== Результат ===")
    println("Ваша оценка: $ratingNumber")
    println("Ваш комментарий: $comment")
}
