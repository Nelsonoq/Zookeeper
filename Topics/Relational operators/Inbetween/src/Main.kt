
fun main() {
    // put your code here
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()

    val inRange = first in second..third || first in third..second

    println(inRange)
}
