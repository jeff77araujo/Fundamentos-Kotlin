package fundamentos.operadores

fun main(args: Array<String>) {
    val trab1: Boolean = false
    val trab2: Boolean = false

    val sorvete: Boolean = trab1 || trab2
    val tv50: Boolean = trab1 && trab2
    val tv32: Boolean = trab1 xor trab2

    println("Toma sorvete: $sorvete")
    println("TV de 50 polegadas: $tv50")
    println("TV de 32 polegadas: $tv32")

    if (!sorvete) {
        println("A saúde agradece")
    }
}