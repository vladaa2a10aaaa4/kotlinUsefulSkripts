fun main() {
    println("Сколько денег в вашем кармане?")
    val sum = readln().toInt()
    println("Вы голодны? (да/нет)")
    val answer = readln().lowercase()
    val isHungry = answer in listOf("да", "yes", "true", "1", "голоден", "голодный")
    if (isHungry && sum > 500) {
        println("Купите пиццу")
    } else if (isHungry && sum <= 500) {
        println("Купите доширак")
    } else if (!isHungry && sum > 500) {
        println("Сходите в кино")
    } else { // !isHungry && sum <= 500
        println("Сходите на прогулку")
    }
}