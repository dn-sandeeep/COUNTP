fun main(){

    val rank = readln().trim().toInt()
    val a = 8000
    val b = 4000
    val c = 2000
    val d = 1000
    if ( rank == 1){
        println(a)
    }else if (rank == 2){
        println(b)
    }else if (rank == 3){
        println(c)
    }else if (rank == 4){
        println(d)
    }else{
        println(0)
    }
}