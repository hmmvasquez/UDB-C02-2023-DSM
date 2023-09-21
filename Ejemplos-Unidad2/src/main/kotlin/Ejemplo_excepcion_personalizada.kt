class SaldoInsuficienteException : Exception("Saldo insuficiente")
class CuentaBancaria(private var saldo: Double) {
    fun retirarDinero(monto: Double) {
        if (monto > saldo) {
            throw SaldoInsuficienteException()
        }
        saldo -= monto
        println("Retiro exitoso. Saldo restante: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria(500.0)
    try {
        cuenta.retirarDinero(700.0)
    } catch (excepcion: SaldoInsuficienteException) {
        println("Error: ${excepcion.message}")
    }}