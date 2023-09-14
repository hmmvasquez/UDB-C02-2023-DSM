class Persona1(nombre: String, edad: Int) {
    // Propiedades de la clase Persona
    private var nombre: String
    private var edad: Int

    // Inicializador init para asignar los valores iniciales a las propiedades
    init {
        this.nombre = nombre
        this.edad = edad
    }

    // Método de la clase Persona
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}

// Crear una instancia de la clase Persona y llamar al método Clases.UNIDAD1.Ejemplos.Hola_Mundo.src.main.kotlin.saludar
fun main() {
    val persona = Persona1("Juan", 25)
    persona.saludar()
}