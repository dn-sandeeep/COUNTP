fun main(){
    val t = readln()!!.toInt()
    repeat(t){
        val(x, y, z) = readLine()!!.split(" ").map { it.toInt() }
        val tm = y*z
        val remain = (x - tm)
        if (remain > 0){
            println(remain)
        }else{
            println(0)
        }

    }

}