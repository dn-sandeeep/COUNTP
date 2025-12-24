fun main(){
    val (n, a, m, b) = readLine()!!.split(" ").map { it.toInt() }
    val totalbuy = n*a
    val totalSold = m*b
    println(totalSold-totalbuy)
}