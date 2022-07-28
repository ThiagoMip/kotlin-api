package one.digitalinnovation.collections

class Pessoa {
    var nome:String = "Thiago"
    var cpf:String = "123.456.789-0"
}

fun main(){
    val thiago = Pessoa()

    println(thiago.nome)
    print(thiago.cpf)
}