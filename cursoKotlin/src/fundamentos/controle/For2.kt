package fundamentos.controle

fun main(args: Array<String>) {
    println("Vai Explodir em 10 segundos!!")
    for(i in 10 downTo 1) {
        println(i)
    }
    println("BOOOOOM")
}