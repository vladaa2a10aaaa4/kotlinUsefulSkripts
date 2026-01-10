fun main() {
    val enginePower = readln().toInt()
    val rate: Int

    rate = when {
        enginePower > 250 -> 150
        enginePower > 200 -> 75
        enginePower > 150 -> 49
        enginePower > 100 -> 34
        else -> 10  // <= 100
    }

    val tax = enginePower * rate

    println("Вид ТС: легковой автомобиль")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $rate руб./л.с.")
    println("Сумма налога: $tax руб.")
}