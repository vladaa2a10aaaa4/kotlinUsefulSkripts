fun main() {
    val sec: Int = readln().toInt()
    val hours = sec / 3600
    val secForMinutes = sec % 3600
    val minutes = secForMinutes / 60
    val newsec = secForMinutes % 60
    println("$hours:$minutes:$newsec")
}