fun main() {
    val auxLst= mutableListOf(71,87,22,99,79,69,100,93,67,28,85)
    var auxMut= mutableListOf<String>()

    println(genCalif(auxLst,auxMut))
}


fun genCalif(auxLst: MutableList<Int>, auxRes: MutableList<String>): MutableList<String> {

    for (i in auxLst) {

        if (i >= 95 && i <= 100){
            auxRes.add("\n($i) Excelente")

        }else if (i >= 85 && i <= 94){
            auxRes.add("\n($i) Notable")

        }else if (i >= 75 && i <= 84){
            auxRes.add("\n($i) Bueno")

        }else if (i >= 70 && i <= 74){
            auxRes.add("\n($i) Suficiente")

        }else if (i <= 69){
            auxRes.add("\n($i) Insuficiente")

        }
    }

    return auxRes
}