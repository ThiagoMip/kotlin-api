package one.digitalinnovation.collections.teste

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 3000.0, tipoContratacao = "CLT")
    val cleber = Funcionario(nome = "Cleber", salario = 87000.0, tipoContratacao = "PJ")
    val leo = Funcionario(nome = "Leo", salario = 100.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, cleber, leo)

    funcionarios.forEach { println(it) }

    println("---------------------")

    println(funcionarios.find { it.nome == "Cleber" })

    println("---------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

    println("---------------------")

}
