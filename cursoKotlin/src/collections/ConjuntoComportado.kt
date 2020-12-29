package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("Sem ordem: ")

    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nLinked: ")

    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nSorted: ")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    aprovados.sortedBy { it.substring(1) }.print()
    aprovados.sortedBy { it.substring(1).reversed() }.print()
}