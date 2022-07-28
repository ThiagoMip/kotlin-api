package one.digitalinnovation.collections

class Pessoa {
    var nome:String = "Thiago"
    var cpf:String = "123.456.789-0"

    private set

    fun pessoaInfo() = "$nome + $cpf"
}

fun main(){
    val thiago = Pessoa()

    println(thiago.pessoaInfo())

}