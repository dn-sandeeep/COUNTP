fun main(){
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    if (n-m > 0){
        println(n-m)
    }else{
        println(0)
    }
}