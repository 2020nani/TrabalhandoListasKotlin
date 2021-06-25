package br.com.alura.array.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun ArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.00", "2670.99", "3599.90", "6000.00", "3000.00")
    val aumento = "1.1".toBigDecimal()
    val salariosComAUmento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoSalario(salario, aumento) }
        .toTypedArray()
    println(salarios.contentToString())
    println(salariosComAUmento.contentToString())
    val gastoInicial = salarios.somatoria()
    val gastoComAumento = salariosComAUmento.somatoria()
    println(gastoInicial)
    println(gastoComAumento)
    //fold encontro um gasto definindo um valor passado
    val meses = "6".toBigDecimal()
    println(salariosComAUmento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    })
    //ordenacao
    val salariosOrdenados = salariosComAUmento.sorted()
    //take pega os elementos inicio takelast elementos final
    val maioresSalarios = salariosComAUmento.takeLast(3).toTypedArray()
    println(maioresSalarios.media())
}

fun calculaAumentoSalario(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        (salario + "500.00".toBigDecimal()).setScale(2, RoundingMode.UP)
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acc, valor -> acc + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    if(this.isEmpty()){
        return BigDecimal.ZERO
    }
    return (this.somatoria() / this.size.toBigDecimal()).setScale(2,RoundingMode.UP)
}