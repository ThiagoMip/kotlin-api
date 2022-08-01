package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Gerente

fun main(){
    val claudia = Gerente(nome = "Claudia", cpf = "098.765.432-1", salario = (5000.0), senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(claudia)

    TesteAutenticacao().auntentica(claudia)
}