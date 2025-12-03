fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (r, b, g) = readLine()!!.split(" ").map { it.toInt() }
        val min = minOf(r, b, g)

        val total = (r+b+g) - min
        val remain = total-min*2
        val totalcoins = remain*3
        val grandTotal = totalcoins+(min*10)
        println(grandTotal)

    }
}