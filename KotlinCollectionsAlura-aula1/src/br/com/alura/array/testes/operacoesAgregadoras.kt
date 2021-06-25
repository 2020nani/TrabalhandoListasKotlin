package br.com.alura.array.testes

fun operacoesAgregadoras(){
    val arrayIdades : IntArray = intArrayOf(18,22,23,24,56,58,34)
    //acha valor maximo
    println(arrayIdades.max())
    // acha valor minimo
    println(arrayIdades.min())
    // calcula media e retona em double
    println(arrayIdades.average())
    // retorna true se todos forem maiores ou igual a idade passada como parametro
    println(arrayIdades.all { it >= 18 })
    // retorna true se apenas um for maior ou igual a idade passada como parametro
    println(arrayIdades.any() { it >= 18 })
    // realiza filtro conforme condicional passada no parametro
    println(arrayIdades.filter { it >18 })
    //busca o primeiro valor que satisfaça a condiçao
    println(arrayIdades.find { it > 18 })
    //verifica se contain parametro passado
    println(arrayIdades.contains(18))
}