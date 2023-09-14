fun main() {
    val temperatura = 25
    when (temperatura) {
        25 -> {
            println("La temperatura es de 25 grados centígrados.")
        }
        30 -> {
            println("La temperatura es de 30 grados centígrados.")
        }
        35 -> {
            println("La temperatura es de 35 grados centígrados.")
        }
        else -> {
            println("La temperatura no coincide con ninguno de los casos especificados.")
        }
    }
}