
fun main(){
val (N, K) = readLine()!!.split(" ").map { it.toInt() }

    val requiredSeats = (N/2 + 1)
    val seatsWanted = requiredSeats - K
    if (seatsWanted > 0){
        println(seatsWanted)
    }else{
        println(0)
    }
}