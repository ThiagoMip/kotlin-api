package one.digitalinnovation.collections.teste

fun main(){
    val nomes = Array<String>(size = 3) {""}

    nomes[0] = "Julia"
    nomes[1] = "Claudio"
    nomes[2] = "Roberto"

    for (nome in nomes){
        println(nome)
    }
    println("--------------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("--------------------")

    val nomes2 = arrayOf("Jose", "Maria", "Leonardo")
    nomes2.sort()
    nomes2.forEach { println(it) }
}