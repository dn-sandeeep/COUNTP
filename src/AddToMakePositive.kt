fun main(){
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val a = readln().trim().split(" ").map { it.toInt() }
        val sumOfArray = a.sum()
        var dig = 0
        for (i in 1..n+1){
            val nonNegativeInt = sumOfArray + (i*i)
            if(nonNegativeInt >= 0){
                dig = i
                break
            }
        }
        println(dig)
    }
}