package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Analista

fun main(){
    val joao = Analista(nome = "Danilo", cpf = "098.765.432-1", salario = (2800.0))

    ImprimeRelatorioFuncionario.imprime(joao)
}