package br.com.alura.array.testes

import br.com.alura.array.Livro
import br.com.alura.array.Prateleira

fun usaPrateleira(){

    val livro = Livro(
        titulo = "baba",
        price = 100,
        genero = "comedia",
        anoPublicacao = 2000,
        editora = "azul"
    )
    val livro2 = Livro(
        titulo = "tartaruga ninja",
        price = 100,
        genero = "Herois",
        anoPublicacao = 2010,
        editora = "amarelo"
    )
    val livro3 = Livro(
        titulo = "marvel avengers",
        price = 100,
        genero = "Herois",
        anoPublicacao = 2000,
        editora = "azul"
    )
    val livro4 = Livro(
        titulo = "x-mem",
        price = 100,
        genero="Herois",
        anoPublicacao = 2000
    )
    /*Trabalhando com listas mutaveis*/
    val livros: MutableList<Livro> = mutableListOf(livro, livro2, livro3,livro4)
    val prateleira: Prateleira = Prateleira(genero = "Herois", livros = livros.filter { it.genero == "Herois" } as MutableList<Livro>)
    prateleira.organizaPorTitulo()?.imprimeFormatado()
    prateleira.organizaPorAnoPublicacao()?.imprimeFormatado()
    //Ao realizar o sort altera o estado da lista
    prateleira.livros?.imprimeFormatado()
    /*Trabalhando com lista imutaveis*/
    val prateleira2: Prateleira = Prateleira(genero = "Herois", livros = livros.filter { it.genero == "Herois" } as MutableList<Livro>)
    prateleira2.organizaPorTituloImutaveis().imprimeFormatado()
    prateleira2.organizaPorAnoPublicacaoImutaveis().imprimeFormatado()
    //Ao realizar o sort nao altera o estado da lista
    prateleira2.livros?.imprimeFormatado()


    fun List<Livro?>.imprimeFormatado() {
        val listaFormatada = this
            .filterNotNull()
            .joinToString(separator = "\n") {
                "- Titulo: ${it.titulo}, Price: ${it.price}, AnoPublicaçao: ${it.anoPublicacao}"
            }
        println("##### Lista de livros ####\n$listaFormatada ")
    }
}


