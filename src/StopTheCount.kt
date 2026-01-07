fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val s = readln().trim()

        var vot = 0
        var antiVotes = 0
        var waysWin = 0

        for (i in 0 until n) {
            if (s[i] == '1') {
                vot++
            } else {
                antiVotes++
            }
            if (vot > antiVotes) {
                waysWin++
            }
        }

        println(waysWin)
    }
}
