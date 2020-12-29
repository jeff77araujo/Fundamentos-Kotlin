package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(12345678941, "João")
    map.put(12345678944, "Maria")
    map.put(12345678942, "Pedro")

    map.put(12345678942, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(12345678942)?.print()
    map[12345678944]?.print()
    map.contains(12345678941).print()
    map.remove(12345678942)?.print()
    map.clear()
    map.isEmpty().print()
}