//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val n = readLine()!!.toInt()
        val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

        val inv = mutableListOf<Int>()
        for (i in 0 until n - 1) {
            if (arr[i] > arr[i + 1]) {
                inv.add(i)
            }
        }
        val result = when {
            inv.isEmpty() -> "YES"
            inv.size > 1 -> "NO"
            else -> {
                val i = inv[0]
                arr[i] = arr[i + 1].also { arr[i + 1] = arr[i] }

                var sorted = true
                for (j in 0 until n - 1) {
                    if (arr[j] > arr[j + 1]) {
                        sorted = false
                        break
                    }
                }
                if (sorted) "YES" else "NO"
            }
        }

        println(result)
    }
}
