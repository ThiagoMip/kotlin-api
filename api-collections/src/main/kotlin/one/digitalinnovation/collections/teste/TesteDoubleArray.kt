package one.digitalinnovation.collections.teste

fun main(){
    val salarios = DoubleArray(size = 3)

    salarios[0] = 1000.00
    salarios[1] = 98000.00
    salarios[2] = 300.00

    salarios.forEach { println(it) }

    println("-------------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-------------------------")

    val salarios2 = doubleArrayOf(6000.00, 200.00, 15000.00)
    salarios2.sort()
    salarios2.forEach { println(it) }
}