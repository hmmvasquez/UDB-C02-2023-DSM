fun main() {
    val sumar = fun(a: Int, b: Int): Int = a + b
    val multiplicar = fun(a: Int, b: Int): Int = a * b
    val resultadoSuma = sumar(3, 5)  // Llamada a la expresión de función "sumar"
    val resultadoMultiplicacion = multiplicar(4, 6)  // Llamada a la expresión de función "multiplicar"

    println("El resultado de la suma es $resultadoSuma")
    println("El resultado de la multiplicación es $resultadoMultiplicacion")
}