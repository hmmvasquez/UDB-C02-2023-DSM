fun main() {
    try {
        // Código que puede generar una excepción
        val result = divide(10, 0)
        println("El resultado es: $result")
    } catch (e: ArithmeticException) {
        // Manejo de excepciones específicas
        println("Error: No se puede dividir entre cero")
    } finally {
        // Código que se ejecuta sin importar si se produce una excepción o no
        println("Finalizando la ejecución")
    }
}

fun divide(a: Int, b: Int): Int {
    return a / b
}