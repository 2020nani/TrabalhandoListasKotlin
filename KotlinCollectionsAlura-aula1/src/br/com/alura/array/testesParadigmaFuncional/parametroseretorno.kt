package br.com.alura.array.testesParadigmaFuncional

fun parametroseretorno(){
    val funcaoSoma:(Int,Int) -> Int = ::soma;
    val funcaoDivide  = { den: Int, coc: Int -> den / coc }
    println(funcaoDivide(10,2))
    println(funcaoSoma(10,90))
    //retorna dois parametros
    val multiplica:(salario:Double) -> Double = lambda@{
        if(it < 500.0){
            return@lambda it*2
        }
        it * 1
    }
    println(multiplica(400.0))
}

fun soma(a:Int,b:Int):Int{
    return a+b
}