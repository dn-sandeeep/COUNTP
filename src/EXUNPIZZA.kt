fun main(){
    val (N, K, R) = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val remainingPizzas = N - K
    println(remainingPizzas*R)
}