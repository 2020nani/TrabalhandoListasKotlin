package br.com.alura.array.testes

fun associacaoCollection() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 50.0),
        Pedido(2, 500.0),
        Pedido(3, 5000.0),
        Pedido(4, 5.0),
        Pedido(5, 25.0),
        Pedido(6, 200.0)
    )
    pedidos.imprime()
    //jeito 1 de associar
    val pedidosMapeado = pedidos.associate { pedido -> Pair(pedido.numero, pedido)  }
    println(pedidosMapeado)
    //jeito 2 de associar
    val pedidosMapeado2 = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeado2)
    // associa com condicional
    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 100.0  }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[pedidos[1]])
    //agrupa conforme parametro passado
    val pedidosFreteGratisAgrupado = pedidos.groupBy { pedido -> pedido.valor > 100 }
    println(pedidosFreteGratisAgrupado)
    println(pedidosFreteGratisAgrupado[true])
    println(pedidosFreteGratisAgrupado[false])
    //construindo agenda
    val nomes = listOf("Ana Rosa","Hernani","Helton","Marcos","Mario","Amanda","Carina","Taciana")
    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['H'])
}

data class Pedido(val numero: Int, val valor: Double)

fun List<Pedido>.imprime(): List<Unit> {
    return this.map { pedido -> println(pedido) }
}


