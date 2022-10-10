fun main(){
    var interrup = listOf<Int>(1,0,1,0,0,0,1,0,1)
    println(recDat(interrup))
}

fun recDat(lst: List<Int>): List<String>{
    var cont = 0
    var arr = mutableListOf<String>()

    for (i in lst){
        arr.add(cont, "${convBool(lst[cont])}")
        cont++
    }
    return arr
}

fun convBool(aux: Int): Boolean{
    if(aux == 0 || aux == 1){
        return true
    }else{
        return true
    }
}