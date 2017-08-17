package development.alberto.com.kotlinintroalberto


class When {
    fun cambiarMoneda(monto: Double, moneda: Enumeradores) = when (moneda) {
        Enumeradores.USD -> monto * 1.35
        Enumeradores.BOB -> monto * 1.52
        Enumeradores.ASD -> monto * 1.85
        Enumeradores.CLP -> monto * 1.52
        Enumeradores.PEN -> TODO()
        Enumeradores.ARS -> TODO()
        Enumeradores.MXN -> TODO()
        Enumeradores.PVG -> TODO()
        Enumeradores.UYU -> TODO()
    }

    fun monedaPorGrupos( moneda: Enumeradores) = when (moneda) {

        Enumeradores.USD, Enumeradores.MXN  -> "Norteamerica"
        Enumeradores.PEN, Enumeradores.ASD,
        Enumeradores.ARS,
        Enumeradores.BOB,
        Enumeradores.CLP,
        Enumeradores.PVG,
        Enumeradores.UYU -> "Sudamerica"
    }
}