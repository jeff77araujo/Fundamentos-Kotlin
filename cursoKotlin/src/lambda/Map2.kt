package lambda

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
        Produto("Fichário", 21.90),
        Produto("Lápis", 11.90),
        Produto("Borracha", 0.70),
        Produto("Apontador", 1.80)
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é ${precoTotal / materialEscolar.size}.")
}