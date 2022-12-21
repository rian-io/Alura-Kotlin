package br.com.alura.bytebank.modelos.contas

import br.com.alura.bytebank.modelos.pessoas.Cliente

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo: Double = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

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
