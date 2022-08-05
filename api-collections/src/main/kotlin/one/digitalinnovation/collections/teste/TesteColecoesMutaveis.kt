package one.digitalinnovation.collections.teste

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 3000.0, tipoContratacao = "CLT")
    val cleber = Funcionario(nome = "Cleber", salario = 87000.0, tipoContratacao = "PJ")
    val leo = Funcionario(nome = "Leo", salario = 100.0, tipoContratacao = "CLT")

    val funcionarios = mutableListOf(joao, leo)
    funcionarios.forEach { println(it) }

    println("-------------------------")

    funcionarios.add(cleber)
    funcionarios.forEach { println(it) }

    println("-------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("--------------*SET*-------------")

    val funcionarioSet = mutableSetOf(joao)
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(leo)
    funcionarioSet.add(cleber)
    funcionarioSet.forEach { println(it) }

    println("-------------------------")

    funcionarioSet.remove(leo)
    funcionarioSet.forEach { println(it) }
}