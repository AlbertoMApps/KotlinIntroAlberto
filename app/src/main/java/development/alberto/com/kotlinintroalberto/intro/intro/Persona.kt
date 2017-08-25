package development.alberto.com.kotlinintroalberto.intro.intro

//References from Kotlin init
//https://www.youtube.com/watch?v=hteNta7eucI#t=131.954394

class Persona (val nombre:String, var edad: Int ) {

    val esMayorEdad:Boolean
    get() = if (edad>=18)  true else false

}
