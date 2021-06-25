package br.com.alura.array.testes

fun testeMap() {
    val pedidos = mapOf(Pair(1, 100.0), 2 to 500.0, Pair(3, 1000.0), 4 to 300.0)
    println(pedidos)
    val pedido = pedidos[5]
    pedido?.let {
        println("$it")
    }
    for (pedido in pedidos) {
        if(pedido.key == 4){
            continue
        }
        println("Numero do pedido: ${pedido.key}, Valor do Pedido: ${pedido.value}")
    }
    //escrita em map
    val pedidosMutable = mutableMapOf(Pair(1, 100.0), 2 to 500.0, Pair(3, 1000.0), 4 to 300.0)
    pedidosMutable[5] = 20.0
    println(pedidosMutable)
    pedidosMutable[5] = 1000.0
    println(pedidosMutable)
    pedidosMutable.remove(5)
    println(pedidosMutable)
    //imprime null mesmo nao existindo a chave
    println(pedidosMutable[7])
    //garante que a chave e nula e solta uma exception
    //println(pedidosMutable.getValue(6))
    //imprime o valor contido na chave se nao houver imprime a funcao
    println(pedidosMutable.getOrElse(0) {
        "Nao ha pedido com essa chave"
    })
    //imprime o valor contido ou default
    println(pedidosMutable.getOrDefault(0, 100.0))
    //percorre keys pedidos
    for(pedidoNumero in pedidos.keys){
        println("Pedido numero: $pedidoNumero")
    }
    //percorre valores pedidos
    for(pedidoValores in pedidos.values){
        println("Pedido valor: $pedidoValores")
    }
    //filtrando dados
    println(pedidosMutable.filter { (keys, values) -> keys%2 == 0 && values > 10.0 })
    //filtrando a partir das chaves
    println(pedidosMutable.filterKeys { keys -> keys%2 != 0 })
    //filtrando por valor
    println(pedidosMutable.filterValues { values -> values < 200.0 })
}