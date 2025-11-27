fun main(){
    val t = readln().toInt()
    repeat(t){
        val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
        val friendStart = x - y
        val friendEnd = x + y

        val chefStart = x - z
        val chefEnd = x + z

        val meetStart = maxOf(friendStart, chefStart)
        val meetEnd = minOf(friendEnd, chefEnd)

        var count = 0

        for (pos in meetStart..meetEnd) {
            if (pos != x) {
                count++
            }
        }
        println(count)
    }
}