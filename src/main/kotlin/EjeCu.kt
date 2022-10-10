fun main() {
    var auxMap: Map<String,Int> = mapOf (
        "Arq Comutadoras" to 71,
        "Leng Interfaz" to 83,
        "Graficacion" to 100,
        "Simulacion" to 89,
        "Investigacion" to 40
    )

    println(genCalif(auxMap))
}

fun genCalif(auxM: Map<String,Int>): Map<String,String> {
    val auxMut: MutableMap<String,String> = mutableMapOf()

    for ((contA, contB) in auxM) {
        var aux = ""

        if (contB >= 0 && contB <= 69){
            aux = "Desempeño Insuficiente"

        }else if (contB >= 70 && contB <= 74){
            aux = "Suficiente"

        }else if (contB >= 75 && contB <= 84){
            aux = "Bueno"

        }else if (contB >= 85 && contB <= 94){
            aux = "Notable"

        }else if (contB >= 95 && contB <= 100){
            aux = "Excelente"

        }

        auxMut[contA.uppercase() + " "] = " ($contB)$aux"
    }

    return auxMut
}