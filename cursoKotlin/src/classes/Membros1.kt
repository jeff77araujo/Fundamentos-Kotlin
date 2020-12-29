package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia = 1, mes = 5, ano = 1993)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("${dia}/${mes}/${ano}")}

    nascimento.ano = 1800
    println(nascimento.formatar())
}