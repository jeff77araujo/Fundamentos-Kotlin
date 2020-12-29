package funcoes

fun <X>List<X>.secondOrNull(): X? = if (this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("Maria", "João", "Pedro")
    println(list.secondOrNull())
}