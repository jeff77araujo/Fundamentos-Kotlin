package lambda

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    // run é igual o apply, porém mais limitado, sendo assim o apply é melhor
    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }

    println(casa)
}