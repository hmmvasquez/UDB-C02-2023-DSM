fun main() {
    var opcion: Int
    do {
        println("Menú:")
        println("1. Saludar")
        println("2. Sumar dos números")
        println("3. Salir")
        print("Ingrese una opción: ")
        opcion = readLine()!!.toInt()
        when (opcion) {
            1 -> println("¡Hola!")
            2 -> {
                print("Ingrese el primer número: ")
                val num1 = readLine()!!.toInt()
                print("Ingrese el segundo número: ")
                val num2 = readLine()!!.toInt()
                val suma = num1 + num2
                println("La suma de $num1 y $num2 es: $suma")
            }
            3 -> println("Saliendo del programa...")
            else -> println("Opción inválida, por favor ingrese una opción válida.")
        }
        println()
    } while (opcion != 3)
}	