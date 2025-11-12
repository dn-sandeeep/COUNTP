fun main() {

    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val totalPoints = x*3 + y*2
    println(totalPoints)

}