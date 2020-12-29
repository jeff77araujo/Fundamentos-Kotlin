package classes

var desconto: Double = 0.1

class ItemDePedido(val nome: String, var preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        // @JvmStatic var desconto: Double = 0.1
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemDePedido.create("TV 50 polegadas", 2999.99)
    val item2 = ItemDePedido("Liquidificador",200.00)

    println(item1.precoComDesconto())

    // ItemDePedido.desconto = 0.20
    desconto = 0.20
    println(item2.precoComDesconto())
}