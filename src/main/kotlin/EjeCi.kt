fun main() {
    var auxLst = listOf(
        clsVals(2020, 180, 5, true, "A"),
        clsVals(2022, 90, 3, true, "B"),
        clsVals(2015, 230, 7, true, "A"),
        clsVals(2011, 50, 4, false, "B"),
        clsVals(2000, 25, 2, false, "A"),
        clsVals(1980, 40, 4, true, "B"),
        clsVals(1999, 38, 5, false, "B")

    )

    println(genPre(auxLst, 3000000.0))
}

class clsVals(
    var ani: Int,
    var met: Int,
    var hab: Int,
    var gar: Boolean,
    var zon: String
)

fun genPre(auxLst: List<clsVals>, auxPre: Double): MutableList<String>{
    var auxMut = mutableListOf<String>()

    for (i in auxLst.indices) {
        var cont = 0.0

        if (auxLst[i].zon == "A") {
            if (auxLst[i].gar) {
                cont = (((auxLst[i].met * 1000) + (auxLst[i].hab * 5000) + 15000) * ((auxLst[i].ani - 1) / 100)) * 1.0
            }else {
                cont = (((auxLst[i].met * 1000) + (auxLst[i].hab * 5000)) * ((auxLst[i].ani - 1) / 100)) * 1.0
            }

        } else if (auxLst[i].zon == "B") {
            if (auxLst[i].gar) {
                cont = ((auxLst[i].met * 1000) + (auxLst[i].hab * 5000) + 15000) * ((auxLst[i].ani - 1) / 100) * 1.5
            } else {
                cont = ((auxLst[i].met * 1000) + (auxLst[i].hab * 5000)) * ((auxLst[i].ani - 1) / 100) * 1.5
            }

        }

        if (cont <= auxPre) {
            var cad = "\nHabitaciones: ${auxLst[i].hab}, Año: ${auxLst[i].ani}, Garage: ${auxLst[i].gar}, " +
                    "Zona: ${auxLst[i].zon}, Metros: ${auxLst[i].met}, Precio: $cont"

            auxMut.add(cad)
        }
    }

    return auxMut
}