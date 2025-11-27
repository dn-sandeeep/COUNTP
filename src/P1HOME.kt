fun main(){
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }

    if (A == B){
        println("YES")
    }else{
        println("NO")
    }
}