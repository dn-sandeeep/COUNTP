fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val s = readln()

        val seen = mutableSetOf<Char>()
        var repeated = false
        for (ch in s) {
            if (ch in seen) {
                repeated = true
                break
            }
            seen.add(ch)
        }

        println(if (repeated) "Yes" else "No")
    }
}
