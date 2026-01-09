object TimeConverter {

    private const val SECONDS_IN_HOUR = 3600
    private const val SECONDS_IN_MINUTE = 60
    private const val TIME_FORMAT = "%02d:%02d:%02d"

    @JvmStatic
    fun main() {
        println("Введите количество секунд:")

        try {
            val totalSeconds = readln().toInt()

            if (totalSeconds < 0) {
                throw IllegalArgumentException("Количество секунд не может быть отрицательным")
            }

            val timeComponents = convertSecondsToTime(totalSeconds)
            val formattedTime = formatTime(timeComponents)

            println("\nРезультат преобразования:")
            println("$totalSeconds секунд = $formattedTime")

        } catch (e: NumberFormatException) {
            println("Ошибка: пожалуйста, введите целое число (например: 3665)")
        } catch (e: IllegalArgumentException) {
            println("Ошибка: ${e.message}")
        }
    }

    private fun convertSecondsToTime(totalSeconds: Int): Triple<Int, Int, Int> {
        val hours = totalSeconds / SECONDS_IN_HOUR
        val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR
        val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
        val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

        return Triple(hours, minutes, seconds)
    }

    private fun formatTime(timeComponents: Triple<Int, Int, Int>): String {
        val (hours, minutes, seconds) = timeComponents
        return String.format(TIME_FORMAT, hours, minutes, seconds)
    }
}