fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val n = readLine()!!.toInt()
        val balns = readLine()!!.split(" ").map { it.toInt() }

        var totalCost = 0
        for (i in 0 until n) {
            totalCost += (i + 1) * balns[i]
        }

        println(totalCost)
    }
}
