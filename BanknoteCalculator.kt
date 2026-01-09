fun main() {
    val money = readln().toInt()
    var remaining = money
    val hundred = remaining / 100
    remaining %= 100
    val fifty = remaining / 50
    remaining %= 50
    val twenty = remaining / 20
    remaining %= 20
    val ten = remaining / 10
    remaining %= 10
    val five = remaining / 5
    remaining %= 5
    val two = remaining / 2
    remaining %= 2
    val one = remaining
    println("Вам доступно:")
    println("100 - $hundred шт")
    println("50 - $fifty шт")
    println("20 - $twenty шт")
    println("10 - $ten шт")
    println("5 - $five шт")
    println("2 - $two шт")
    println("1 - $one шт")
}