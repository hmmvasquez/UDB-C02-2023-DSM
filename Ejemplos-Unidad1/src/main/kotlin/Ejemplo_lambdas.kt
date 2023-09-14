fun main() {
    val sumar: (Int, Int) -> Int = { a, b -> a + b }
    val multiplicar: (Int, Int) -> Int = { a, b -> a * b }
    val resultadoSuma = sumar(3, 5)  // Llamada a la lambda "sumar"
    val resultadoMultiplicacion = multiplicar(4, 6)  // Llamada a la lambda "multiplicar"
    println("El resultado de la suma es $resultadoSuma")
    println("El resultado de la multiplicación es $resultadoMultiplicacion")
}