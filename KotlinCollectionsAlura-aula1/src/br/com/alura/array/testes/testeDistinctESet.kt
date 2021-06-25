package br.com.alura.array.testes

fun testeDistinctESet(){
    val curtiGame = mutableListOf("Joao","Hernani","Mario","Rafael")
    val curtiTv = mutableListOf("Hernani","Marcos","Junior","Bruno")
    val curtiAmbos = curtiGame + curtiTv
    println(curtiAmbos)
    //utilizando distinct nao retorna nomes repetidos
    println(curtiAmbos.distinct())
    //set
    val curtiGameSet = mutableSetOf("Joao","Hernani","Mario","Rafael")
    val curtiTvSet = mutableSetOf("Hernani","Marcos","Junior","Bruno")
    val curtiAmbosSet = curtiGameSet.union( curtiTvSet)
    println(curtiAmbosSet)
    println(curtiGameSet subtract curtiTv)
    println(curtiGameSet intersect curtiTvSet)


}