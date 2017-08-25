package development.alberto.com.kotlinintroalberto.intro.pokemoncode

class PokeDevCode {
    enum class Pokemones (val id:Int) { BULBASAUR(1), CHARMANDER(2), SQUIRTLE(3), PIKACHU(4)  }

    fun main() {
        println( "Inicia un pokemon" );
        for ((index, p) in Pokemones.values().withIndex() ) {
            println(" ${index+1} $p")
        }
    }

    fun generarPokemon(opcion:Int):Pokemon = when(opcion){
        Pokemones.BULBASAUR.id -> Pokemon("Bulbasaur", 20, 20, 15, arrayOf(Ataque("vine whio", 45),
                Ataque("tackle", 49)) )
        Pokemones.CHARMANDER.id -> Pokemon("Charmander", 20, 20, 15, arrayOf(Ataque("scratch", 45),
                Ataque("ember", 49)) )
        Pokemones.SQUIRTLE.id -> Pokemon("Squirtle", 20, 20, 15, arrayOf(Ataque("tackle", 45),
                Ataque("watergun", 49)) )
        Pokemones.PIKACHU.id -> Pokemon("Pikachu", 20, 20, 15, arrayOf(Ataque("thunder shock", 45),
                Ataque("quick attack", 49)) )
        else-> Pokemon("Misigno", 20, 20, 15, arrayOf(Ataque("pay day", 45),
                Ataque("blind", 49)) )

    }
}