fun main() {
    val min = 0
    val max = 10
    val number = readln().toInt()

    val inRange = number > min && number < max
    println(inRange)
}
