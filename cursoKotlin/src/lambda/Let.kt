package lambda

fun main(args: Array<String>) {
    val listaComNulos: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listaComNulos) {
        item?.let {
            println(it)
        }
    }
}