fun doAsyncOperation(callback: (result: Int) -> Unit) {
    // Simulando una operación asíncrona
    Thread.sleep(2000)
    val result = 42
    callback(result)
}
fun processData(result: Int) {
    println("El resultado obtenido es: $result")
}
fun main() {
    println("Inicio del programa")
    doAsyncOperation { result ->
        processData(result)
    }
    println("Fin del programa")
}