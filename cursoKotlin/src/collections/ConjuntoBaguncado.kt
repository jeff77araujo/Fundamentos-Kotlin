package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    // conjunto.get(1)  não funciona pois não é indexado

    conjunto.add(2).print()  // false
    conjunto.add(10).print() // true

    conjunto.size.print()

    conjunto.remove("a").print()  // false pois é uma String
    conjunto.remove('a').print()  // true pois é um caracter

    conjunto.contains('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) // somente leitura

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print()  // não muda o conjunto, faz um novo
    conjunto.retainAll(nums) // muda o conjunto
    conjunto.print()

    conjunto.clear()
    conjunto.print()
}