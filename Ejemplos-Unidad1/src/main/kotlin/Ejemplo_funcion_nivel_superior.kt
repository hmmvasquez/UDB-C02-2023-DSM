fun saludar(nombre: String) {
    println("¡Hola, $nombre!")
}
fun sumar(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    saludar("Juan")  // Llamada a la función de nivel superior "Clases.UNIDAD1.Ejemplos.Hola_Mundo.src.main.kotlin.saludar"
    val resultado = sumar(3, 5)  // Llamada a la función de nivel superior "sumar"
    println("El resultado de la suma es $resultado")
}