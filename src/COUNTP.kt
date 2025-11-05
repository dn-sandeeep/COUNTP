fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val arr = readLine()!!

            .split(" ")
            .map { it.toInt() }

        val totalSum = arr.sum()
        val oddCount = arr.count { it % 2 == 1 }

        if (totalSum % 2 == 0 && oddCount >= 2) {
            println("YES")
        } else {
            println("NO")
        }
    }
}