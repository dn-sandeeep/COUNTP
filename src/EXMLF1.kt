fun main(){
    val t = readln()!!.toInt()
    repeat(t){
        val carsQuantity = readln().toInt()
        var fastestCar = 1
        var maxSpeed = 0
        for (i in 1..carsQuantity ) {
            val (distance, time) = readLine()!!.split(" ").map { it.toInt() }
            val Speed = distance/time
            if (Speed > maxSpeed){
                maxSpeed = Speed
                fastestCar = i
            }
        }
        println(fastestCar)
    }
}