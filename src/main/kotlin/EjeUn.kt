import kotlin.math.*

fun main() {
    println("Ingresa la cantidad a calcular")
    var auxNum = readLine()

    println("Ingrese el num de Operacion que desea hacer:" +
            "\nSin -> 1\nCos -> 2\nTan -> 3\nExp -> 4\nLog Nep-> 5")
    var auxOpe = readLine()

    if (auxNum != null && auxOpe != null) {
        genCalc(auxNum.toInt(), auxOpe.toInt())

    }
}

fun genCalc(auxNum: Int, auxOpe: Int) {

    for (i in 1..auxNum) {
        var aux = 0.0

        if (auxOpe == 1){
            aux = sin(i.toDouble())

        }else if (auxOpe == 2){
            aux = cos(i.toDouble())

        }else if (auxOpe == 3){
            aux = tan(i.toDouble())

        }else if (auxOpe == 4){
            aux = exp(i.toDouble())

        }else if (auxOpe == 5){
            aux = ln(i.toDouble())

        }

        println("Resultado($i) -> $aux")
    }
}