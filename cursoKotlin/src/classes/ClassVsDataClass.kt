package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)
    println(g1 == g2) // equals é igual ao ===

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)
    println(tv1 == tv2) // equals
    println(tv1 === tv2)
    println(tv1.copy(polegadas = 42))
    println("-----------------------")
    println(tv1.toString())
    println(g1.toString())
    println("-----------------------")
    val (marca, poleg) = tv1
    println("$marca $poleg")
}