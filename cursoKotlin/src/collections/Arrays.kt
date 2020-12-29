package collections

fun main(args: Array<String>) {
    val numeros = Array<Int>(10) { i -> i * 10 }

    for (numero in numeros) {
        println(numero)
    }
    println("------------------------------------------")

    println(numeros.get(1))
    println("------------------------------------------")

    println(numeros[1])
    println("------------------------------------------")

    println(numeros.size)
    println("------------------------------------------")

    numeros.set(1, 1234)
    println(numeros[1])

    numeros[2] = 4561
    println(numeros[2])
}