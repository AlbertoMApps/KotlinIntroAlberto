package development.alberto.com.kotlinintroalberto.intro.intro

class SmartCast {
    interface Expresion {
        class Numero(val valor: Int) : Expresion
        class Sumar(val valor1: Expresion, val valor2: Expresion, val valor3: Expresion) : Expresion
        class Multiplicar(val valor1: Expresion, val valor2: Expresion, val valor3: Expresion) : Expresion
    }

    fun evaluarExpresion( expresion: Expresion) :Int {
        if( expresion is Expresion.Numero) {
            return expresion.valor
        } else if ( expresion is Expresion.Sumar) {
            return evaluarExpresion(expresion.valor1) + evaluarExpresion(expresion.valor2) + evaluarExpresion(expresion.valor3)
        } else if ( expresion is Expresion.Multiplicar) {
            return evaluarExpresion(expresion.valor1) * evaluarExpresion(expresion.valor2) * evaluarExpresion(expresion.valor3)
        } else {
            throw IllegalArgumentException(" No se puede reconocer la expresion ")
        }
    }

    fun evaluarExpresionConWhen(expresion: Expresion): Int = when(expresion){

        is Expresion.Numero ->expresion.valor
        is Expresion.Sumar ->evaluarExpresion(expresion.valor1) + evaluarExpresion(expresion.valor2) + evaluarExpresion(expresion.valor3)
        is Expresion.Multiplicar ->evaluarExpresion(expresion.valor1) * evaluarExpresion(expresion.valor2) * evaluarExpresion(expresion.valor3)
        else->
            throw IllegalArgumentException(" No se puede reconocer la expresion ")
    }

}