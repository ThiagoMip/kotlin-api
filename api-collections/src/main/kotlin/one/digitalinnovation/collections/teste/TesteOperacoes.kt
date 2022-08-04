package one.digitalinnovation.collections.teste

fun main(){
    val salarios = doubleArrayOf(200.00, 50.00, 30000.00)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salario: ${salarios.average()}")

    println("--------------------------")

    val salariosMaisDe2500 = salarios.filter { it > 2500.00 }
    println("--------------------------")
    salariosMaisDe2500.forEach { println(it) }
}