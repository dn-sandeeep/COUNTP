fun main() {
    val t = readln().toInt()
    repeat(t) {
        val length = readln().toInt()
        val string = readln().trim()

        val firstIndex = string.indexOf('0')
        var count = 0

            if (firstIndex != -1 ) {
                for (i in firstIndex + 1 until length) {
                    if (string[i] == '1') {
                    count++
                }
            }
        }
        println(count)
    }
}