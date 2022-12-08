// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    if (a > h && b < h){
        println("Normal")
    }else if (h > h){
        println("Excess")
    }
    else{
        println("Deficiency")
    }
}
