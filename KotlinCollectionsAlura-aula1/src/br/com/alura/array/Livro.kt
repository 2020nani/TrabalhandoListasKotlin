package br.com.alura.array

data class Livro(
    var titulo: String,
    var price: Int,
    var genero: String? = null,
    var anoPublicacao: Long,
    var editora: String? = null
) : Comparable<Livro> {
    override fun compareTo(other: Livro): Int {

            return this.anoPublicacao.compareTo(other.anoPublicacao)

    }


}