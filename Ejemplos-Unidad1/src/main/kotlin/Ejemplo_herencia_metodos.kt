open class Vehiculo(val marca: String, val modelo: String) {
    fun acelerar() {
        println("El vehículo está acelerando.")
    }
    fun frenar() {
        println("El vehículo está frenando.")
    }
}

class Automovil(marca: String, modelo: String, val puertas: Int) : Vehiculo(marca, modelo) {
    fun abrirPuertas() {
        println("Se han abierto las $puertas puertas del automóvil.")
    }
}

class Motocicleta(marca: String, modelo: String, val cilindrada: Int) : Vehiculo(marca, modelo) {
    fun hacerCaballito() {
        println("La motocicleta está haciendo un caballito.")
    }
}
fun main() {
    val automovil = Automovil("Toyota", "Corolla", 4)
    automovil.acelerar()
    automovil.frenar()
    automovil.abrirPuertas()

    val motocicleta = Motocicleta("Honda", "CBR", 1000)
    motocicleta.acelerar()
    motocicleta.frenar()
    motocicleta.hacerCaballito()
}