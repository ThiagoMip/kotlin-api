package one.digitalinnovation.collections.teste

fun main(){
    val valores = intArrayOf(2, 5, 7, 32, 1, 90)

    valores.forEach {
        println(it)
    }

    println("-----------------------")

    valores.sort()
    valores.forEach {
        println(it)
    }

}