fun main() {
    print("Ingrese un número: ")
    val numero = 7
    var factorial = 1
    var contador = 1
    while (contador <= numero) {
        factorial *= contador
        contador++
    }
    println("El factorial de $numero es: $factorial")
}	