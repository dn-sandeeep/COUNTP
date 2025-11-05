fun main(){
    val(x, y) = readLine()!!.split(" ").map { it.toInt() }
    val totalKM = x*y
    if (totalKM >= 100){
        println("YES")
    }else{
        println("NO")
    }
}