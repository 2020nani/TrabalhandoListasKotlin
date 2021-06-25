package br.com.alura.array.testes

import br.com.alura.array.Livro

fun trabalhandoComListas() {
    val livro = Livro(
        titulo = "baba",
        price = 100,
        anoPublicacao = 2000
    )
    val livro2 = Livro(
        titulo = "tartaruga ninja",
        price = 100,
        anoPublicacao = 2010
    )
    val livro3 = Livro(
        titulo = "marvel avengers",
        price = 100,
        anoPublicacao = 2000
    )
    val livro4 = Livro(
        titulo = "x-mem",
        price = 100,
        anoPublicacao = 2000
    )
    val livros: MutableList<Livro> = mutableListOf(livro, livro2, livro3)
    //imprime lista formatada
    livros.imprimeFormatado()
    livros.add(livro4)
    livros.imprimeFormatado()
    livros.remove(livro)
    livros.imprimeFormatado()
    livros.sorted().imprimeFormatado()
    livros.sortedBy { it.titulo }.imprimeFormatado()
    livros.filter { it.titulo == "x-mem" }.imprimeFormatado()
    livros.filter { it.titulo.startsWith("t") }.imprimeFormatado()
    //map retorna outra lista
    val titulos : List<String> = livros.map{it.titulo}
    println(titulos)

}

fun List<Livro>.imprimeFormatado() {
    val listaFormatada = this.joinToString(separator = "\n") {
        "- Titulo: ${it.titulo}, Price: ${it.price}, AnoPublicaçao: ${it.anoPublicacao}"
    }
    println("##### Lista de livros ####\n$listaFormatada ")
}