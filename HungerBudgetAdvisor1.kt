fun main() {
    println("Сколько денег в вашем кармане?")
    val sum = readln().toInt()

    println("Вы голодны? (true/false)")
    val isHungry = readln().toBoolean()

    when {
        isHungry && sum > 500 -> println("Купите пиццу")
        isHungry && sum <= 500 -> println("Купите доширак")
        !isHungry && sum > 500 -> println("Сходите в кино")
        else -> println("Сходите на прогулку") // !isHungry && sum <= 500
    }
}