package one.digitalinnovation.collections.teste

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "300".toBigDecimal(),
        "8000".toBigDecimal())

    println("-----------------------------------")
    println(salarios.somatoria())

    println("-----------------------------------")
    println(salarios.media())

    println("-----------------------------------")

}