class Persona(nombre: String, edad: Int) : Cumpleaños {
    private var nombre: String
    private var edad: Int
    init {
        this.nombre = nombre
        this.edad = edad
    }
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }}
fun main() {
    val persona = Persona("Juan", 25)
    persona.saludar()
    persona.felizCumpleaños()
}
interface Cumpleaños
{
    fun felizCumpleaños(){
        println("Felicidades, has cumplido un año más de vida.")
    }
}
