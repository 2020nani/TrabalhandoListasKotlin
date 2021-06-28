package br.com.alura.array.testesParadigmaFuncional

import javax.print.DocFlavor

fun funcaoAltaOrdem() {
/* sem high order function
    val endereco: Endereco = Endereco(rua = "Primeiro de Maio", cep = "18608460")
    val enderecoMaisculo = "Rua: ${endereco.rua}, Cep: ${endereco.cep}".toUpperCase()
    println(enderecoMaisculo)
 */
    /*usando high order function*/
    Endereco(rua = "Primeiro de Maio", cep = "18608460").let { endereco ->
        "Rua: ${endereco.rua}, Cep: ${endereco.cep}".toUpperCase()
    }.let(::println)

    val enderecos = listOf(
        Endereco(rua = "teste", cep = "18608460"),
        Endereco(rua = "teste2", cep = "18608460"),
        Endereco(rua = "teste3",cep = "18608461")
    )
        .filter { endereco -> endereco.cep.equals("18608460") }
        .let (::println)

    //utilizando funcao alta ordem
    multiplica(5, 5,resultado = (::println))


}

fun multiplica(a: Int, b: Int, resultado: (Int) -> Unit) {
     resultado(a * b)
}

data class Endereco(
    val rua: String,
    val cep: String
)