package development.alberto.com.kotlinintroalberto


enum class Enumeradores(val simbolo:String) {
    USD("$"), PEN("./p"), ASD(".?O"), ARS("\$P"), MXN("$"), BOB("$"), CLP("$"), PVG("$"), UYU("$");
    fun formato(monto:Double) = "$simbolo $monto"

}