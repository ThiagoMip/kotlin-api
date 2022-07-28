package one.digitalinnovation.collections

class Pessoa {
    var nome:String = "Thiago"
    var cpf:String = "123.456.789-0"

    private set

    inner class  Endereco {
        var rua:String = "Rua teste"

    }
}

fun main(){
    val thiago = Pessoa()

    println(thiago.nome)
    println(thiago.cpf)

    println(thiago.Endereco().rua)
}