package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as? Int) {  // Usando '?' qualquer valor que não seja inteiro, será Null e entra no 'else'
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.3, 3.1, 7.2, 5.5, 4.7)
    for(nota in notas) {
        imprimirConceito(nota.toInt())
    }
}