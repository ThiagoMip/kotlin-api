package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Cliente
import one.digitalinnovation.collections.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose Luiz",
        cpf = "098.765.432.10",
        clienteTipo = ClienteTipo.PJ,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().auntentica(jose)

}