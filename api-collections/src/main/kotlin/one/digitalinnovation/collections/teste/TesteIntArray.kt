package one.digitalinnovation.collections.teste

fun main(){
    val values = IntArray(size = 5)

    values[0] = 1
    values[1] = 21
    values[2] = 8
    values[3] = 60
    values[4] = 3

    for (valor in values){
        println(valor)
    }

    println("-------------------------------")

    values.forEach { valor ->
        println(valor)
    }

    println("-------------------------------")

    for (index in values.indices){
        println(values[index])
    }
    println("-------------------------------")

    values.sort()
    for (valor in values){
        println(valor)
    }
}