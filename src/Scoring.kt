fun main(){
    val t = readln().toInt()

    repeat(t){
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        val alice = (x + y)/2
        val bob = (y-x)/2

        println("${alice} ${bob}")

    }
}