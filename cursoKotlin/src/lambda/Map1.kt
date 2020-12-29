package lambda

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jeff")
    alunos.map { it.toUpperCase() }.apply { println(this) }
}