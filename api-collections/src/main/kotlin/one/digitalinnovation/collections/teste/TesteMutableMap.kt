package one.digitalinnovation.collections.teste

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 3000.0, tipoContratacao = "CLT")
    val cleber = Funcionario(nome = "Cleber", salario = 87000.0, tipoContratacao = "PJ")
    val leo = Funcionario(nome = "Leo", salario = 100.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(cleber.nome, cleber)
    repositorio.create(leo.nome, leo)

    println(repositorio.findById(cleber.nome))

    println("------------------------------------")

    repositorio.findAll().forEach { println(it) }

    println("------------------------------------")
    repositorio.remove(cleber.nome)
    repositorio.findAll().forEach { println(it) }
}