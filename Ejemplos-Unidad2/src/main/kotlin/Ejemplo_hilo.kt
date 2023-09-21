import java.util.concurrent.*

class Pedido(val id: Int) {
    fun procesar() {
        println("Procesando pedido $id...")
        // Simulación de tiempo de procesamiento
        Thread.sleep(2000)
        println("Pedido $id procesado")
    }
}

class ProcesadorPedidos(private val pedidos: BlockingQueue) : Runnable {
    override fun run() {
        while (true) {
            val pedido = pedidos.take() // Obtener un pedido de la cola (bloqueante si está vacía)
            pedido.procesar()
        }
    }
}

fun main() {
    val numHilos = 3 // Número de hilos de procesamiento
    val pedidos: BlockingQueue = LinkedBlockingQueue() // Cola de pedidos
    // Crear e iniciar los hilos de procesamiento
    val pool = Executors.newFixedThreadPool(numHilos)
    for (i in 1..numHilos) {
        val procesador = ProcesadorPedidos(pedidos)
        pool.execute(procesador)
    }
    // Agregar pedidos a la cola
    for (i in 1..10) {
        val pedido = Pedido(i)
        pedidos.put(pedido) // Agregar pedido a la cola (bloqueante si está llena)
        println("Pedido $i agregado a la cola")
    }
    // Esperar a que todos los pedidos sean procesados
    while (pedidos.isNotEmpty()) {
        Thread.sleep(1000)
    }
    // Finalizar los hilos de procesamiento
    pool.shutdown()
}