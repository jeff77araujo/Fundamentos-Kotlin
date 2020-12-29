package fundamentos

fun main(args: Array<String>) {
    // Tipos númericos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_321_753_654_123_647 // Long.MAX_VALUE

    // Tipos númericos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipos caractere
    val char: Char = '?'

    // Tipos booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(1.0 is Double)

    println(10.dec())
}