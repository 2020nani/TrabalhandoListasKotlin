package br.com.alura.array

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>? = null,
    val livrosMutaveis: List<Livro>? = null
) {
    fun organizaPorTitulo() : MutableList<Livro>? {
        livros?.sortBy { it.titulo }
        return livros
    }

    fun organizaPorAnoPublicacao() : MutableList<Livro>? {
        livros?.sortBy { it.anoPublicacao }
        return livros
    }

    fun organizaPorTituloImutaveis(): List<Livro> {
        return livros?.sortedBy { it.titulo } ?: emptyList()
    }

    fun organizaPorAnoPublicacaoImutaveis(): List<Livro> {
        return livros?.sortedBy { it.anoPublicacao } ?: emptyList()
    }
}