fun main() {
    val t = readln().toInt()
    repeat(t) {
        val inputs = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        inputs.sort() // a = inputs[0], b = inputs[1], c = inputs[2]

        val a = inputs[0]
        val b = inputs[1]
        val c = inputs[2]

        if (a + b > c) {
            println(0)
        } else {
            println((c + 1) - (a + b))
        }
    }
}