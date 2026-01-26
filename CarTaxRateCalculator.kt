fun main() {
    println("Если у вас легковой автомобиль, то введите \"false\", если автомобиль грузовой, то введите \"true\"")
    val isTruck = readln().toBoolean()

    println("Введите мощность лошадиных сил вашего автомобиля(числом):")
    val enginePower = readln().toInt()

    val rate: Int
    val vehicleType: String

    if (isTruck) {
        vehicleType = "грузовой"
        rate = when {
            enginePower > 250 -> 85
            enginePower > 200 -> 65
            enginePower > 150 -> 50
            enginePower > 100 -> 40
            else -> 25  // <= 100
        }
    } else { // ЛЕГКОВОЙ автомобиль
        vehicleType = "легковой"
        rate = when {
            enginePower > 250 -> 150
            enginePower > 200 -> 75
            enginePower > 150 -> 49
            enginePower > 100 -> 34
            else -> 10  // <= 100
        }
    }

    val tax = enginePower * rate

    println("Вид ТС: $vehicleType автомобиль")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $rate руб./л.с.")
    println("Сумма налога: $tax руб.")
}