package one.digitalinnovation.collections.teste

fun main(){
    val salarios = doubleArrayOf(200.00, 50.00, 30000.00)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    println("--------------------------")

    val salariosMaisDe2500 = salarios.filter { it > 2500.00 }
    println("--------------------------")
    salariosMaisDe2500.forEach { println(it) }

    println("--------------------------")

    println(salarios.count{it in 2000.00 .. 55000.00})

    println("--------------------------")

    println(salarios.find{it == 30000.00})
    println(salarios.find{it == 3000.00})

    println("--------------------------")

    println(salarios.any{it == 2000.00})


}