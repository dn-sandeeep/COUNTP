fun main(){
    val t = readln()!!.toInt()
    repeat(t){
        val(w, p, k) = readLine()!!.split(" ").map { it.toInt() }
        if (k <= w){
            val wood = 2*k
            println(wood)
        }else if (k > w){
            val remain = k - w + w*2
            println(remain)


        }
    }

}