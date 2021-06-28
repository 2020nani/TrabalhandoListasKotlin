package br.com.alura.array.testesParadigmaFuncional

fun testaFuncaoPorReferenciaClasse(){
    val funcaoDivide: (denominador: Int, cociente: Int) -> Int = ::divide
    println(funcaoDivide(10, 2))
    println(Divisao().invoke(3, 3))
}

fun divide(denominador: Int, cociente: Int): Int {
    return denominador / cociente
}

class Divisao: (Int, Int) -> Double {
    override fun invoke(p1: Int, p2: Int): Double {
        return (p1 * p2).toDouble()
    }

}