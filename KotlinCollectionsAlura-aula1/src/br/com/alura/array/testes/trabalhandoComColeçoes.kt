package br.com.alura.array.testes

import br.com.alura.array.Livro

fun trabalhandoComColeçoes() {
    val livro = Livro(
        titulo = "baba",
        price = 100,
        anoPublicacao = 2000,
        editora = "azul"
    )
    val livro2 = Livro(
        titulo = "tartaruga ninja",
        price = 100,
        anoPublicacao = 2010,
        editora = "amarelo"
    )
    val livro3 = Livro(
        titulo = "marvel avengers",
        price = 100,
        anoPublicacao = 2000,
        editora = "azul"
    )
    val livro4 = Livro(
        titulo = "x-mem",
        price = 100,
        anoPublicacao = 2000
    )

    val livros: MutableList<Livro?> = mutableListOf(livro, livro2, null, livro3,livro4)
    livros.imprimeFormatado()
    livros
        .filterNotNull()
        .groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach{(editora,livr) ->
            run {
                println("$editora ${livr.joinToString { it.titulo ?: "desconhecido" }}")
            }

    }

}

fun List<Livro?>.imprimeFormatado() {
    val listaFormatada = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "- Titulo: ${it.titulo}, Price: ${it.price}, AnoPublicaçao: ${it.anoPublicacao}"
        }
    println("##### Lista de livros ####\n$listaFormatada ")
}