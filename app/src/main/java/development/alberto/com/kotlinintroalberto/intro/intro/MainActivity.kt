package development.alberto.com.kotlinintroalberto.intro.intro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import development.alberto.com.kotlinintroalberto.R
import development.alberto.com.kotlinintroalberto.intro.pokemoncode.PokeDevCode
import development.alberto.com.kotlinintroalberto.intro.pokemoncode.Pokemon

class MainActivity : AppCompatActivity() {

    val name: String = "Juan Perez" //Solo se asigna el valor una vez
    var edad:Int = 20 //Se asigna varias veces, pero no podemos cambiar su tipo...
    val persona = Persona("Ataulfo", 20) //Trabajando cn clases externas..


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Jugando con textViews con Kotlin...
        val textView : TextView = findViewById(R.id.txtAge)
        val textViewName2 : TextView = findViewById(R.id.txtName)
        val textViewAge2 : TextView = findViewById(R.id.txtAge2)

        println("the value is $name")
        textView.setText(" Name is : $name")

        //Llamando a metodo mayor de edad
        println( "Es esta persona mayor de edad??:  " + this.mayorEdad(edad) )

        //Trabajando cn clases externas..
        println( "Nombre : " + persona.nombre + " Edad : " + persona.edad )
        textViewName2.setText(" Name is : " + persona.nombre)
        textViewAge2.setText(" Age is : " + persona.edad)

        //Cambiamos el valor set de la persona invocada...
        persona.edad = 17
        println("Edad de la persona ahora... ${persona.edad}")
        println("Persona es mayor de edad??? " + persona.esMayorEdad)

        //Enumeradores call
        println("LLamada enumeradores: " + Enumeradores.USD)
        println("LLamada enumeradores: " + Enumeradores.ASD.simbolo)
        println("LLamada enumeradores: " + Enumeradores.BOB.formato(120.0))

        //Usando When clausula
        var cuando = When()
        println("LLamada when para cambiar de moneda: " + cuando.cambiarMoneda(120.0, Enumeradores.CLP))
        println("LLamada para obtener moneda por region...: " + cuando.monedaPorGrupos(Enumeradores.USD))
        println("LLamada para obetener moneda por region...: " + cuando.monedaPorGrupos(Enumeradores.CLP))

        //Usando SmartCast
        var smartCast = SmartCast()
        println("LLamada smartCast interface : " +  smartCast.evaluarExpresion(SmartCast.Expresion.Sumar(SmartCast.Expresion.Multiplicar(SmartCast.Expresion.Numero(4),
                SmartCast.Expresion.Numero(2), SmartCast.Expresion.Numero(5)),
                SmartCast.Expresion.Numero(2), SmartCast.Expresion.Numero(3))) )

        println("LLamada smartCast interface : " +  smartCast.evaluarExpresionConWhen(SmartCast.Expresion.Sumar(SmartCast.Expresion.Multiplicar(SmartCast.Expresion.Numero(4),
                SmartCast.Expresion.Numero(2), SmartCast.Expresion.Numero(5)),
                SmartCast.Expresion.Numero(2), SmartCast.Expresion.Numero(3))) )

        //LLamamos los pokemones con un for...
        var pokedevCode = PokeDevCode()
        pokedevCode.main();
        val pokemon:Pokemon = pokedevCode.generarPokemon(2)//Insertar a traves de un editText ya que es harcoded al momento
        println(pokemon.nombre)
        


    }

    fun mayorEdad(num:Int): Boolean = if(num>18) true else false

}
