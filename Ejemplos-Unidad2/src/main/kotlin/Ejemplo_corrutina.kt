import kotlinx.coroutines.*
suspend fun picarVegetales() {
    delay(1000) // Simulando el tiempo de picar vegetales
    println("Vegetales picados")
}
suspend fun cocinarCarne() {
    delay(1000) // Simulando el tiempo de cocinar la carne
    println("Carne cocinada")
}
suspend fun mezclarIngredientes() {
    delay(1500) // Simulando el tiempo de mezclar ingredientes
    println("Ingredientes mezclados")
}
fun main() {
    println("Inicio del programa")
    // Iniciar una nueva corrutina
    GlobalScope.launch {
        picarVegetales()
    }
    // Iniciar otra corrutina
    GlobalScope.launch {
        cocinarCarne()
    }
    // Continuar con el flujo principal mientras las corrutinas trabajan
    runBlocking {
        mezclarIngredientes()
    }
    println("Fin del programa")
}
