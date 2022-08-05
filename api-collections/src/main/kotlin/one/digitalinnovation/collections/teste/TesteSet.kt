package one.digitalinnovation.collections.teste

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 3000.0, tipoContratacao = "CLT")
    val cleber = Funcionario(nome = "Cleber", salario = 87000.0, tipoContratacao = "PJ")
    val leo = Funcionario(nome = "Leo", salario = 100.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(joao, leo)
    val funcionarios2 = setOf(cleber)

    val resultUniao = funcionarios1.union(funcionarios2)

    resultUniao.forEach { println(it) }

    println("----------------------------")

    val funcionarios3 = setOf(joao, cleber, leo)
    val resultSubtracao = funcionarios3.subtract(funcionarios2)

    resultSubtracao.forEach { println(it) }

    println("----------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)

    resultIntersect.forEach { println(it) }

}