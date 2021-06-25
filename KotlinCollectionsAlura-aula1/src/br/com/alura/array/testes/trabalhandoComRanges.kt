package br.com.alura.array.testes

    fun trabalhandoComRanges() {
        //nao so percorre como verifica se variavel esta dentro do range
        /*0 a 100*/
        var intervalo = 0..100
        /*0 a 99*/
        var intervalo2 = 0.until(to = 100)
        var numero = 100
        if (numero in intervalo) {
            println("ok")
        } else {
            println("nao pertence ao intervao")
        }
        if (numero in intervalo2) {
            println("ok")
        } else {
            println("nao pertence ao intervao")
        }
        //string verifica upper ou lowerr
        var intervaloLetra = "a".."z"

        var intervaloLetra2 = "A".."Z"
        var letra = "A"
        if (letra in intervaloLetra) {
            println("ok")
        } else {
            println("nao pertence ao intervao")
        }
        if (letra in intervaloLetra2) {
            println("ok")
        } else {
            println("nao pertence ao intervao")
        }
    }
