package development.alberto.com.kotlinintroalberto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

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
        textView.setText(" Name is :   + $name")

        //Llamando a metodo mayor de edad
        println( "Es esta persona mayor de edad??:  " + this.mayorEdad(edad) )

        //Trabajando cn clases externas..
        println( "Nombre : " + persona.nombre + "Edad : " + persona.edad )
        textViewName2.setText(" Name is : " + persona.nombre)
        textViewAge2.setText(" Age is : " + persona.edad)

        

    }

    fun mayorEdad(num:Int): Boolean = if(num>18) true else false

}
