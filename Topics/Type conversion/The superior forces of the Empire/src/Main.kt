import java.util.Scanner;
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextLine()
    val num2 = scanner.nextLine()

    val galacticEmpire = num1.toInt()
    val rebelAlliance = num2.toInt()
    val multiple = galacticEmpire / rebelAlliance
    print(multiple)
}
