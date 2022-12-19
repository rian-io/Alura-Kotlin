package contas

abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor <= 0) return
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo < valor) return false

        saldo -= valor
        contaDestino.deposita(valor)
        return true
    }
}
