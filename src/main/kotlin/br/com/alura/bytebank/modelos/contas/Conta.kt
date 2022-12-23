package br.com.alura.bytebank.modelos.contas

import br.com.alura.bytebank.modelos.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.modelos.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.pessoas.Cliente
import br.com.alura.bytebank.modelos.sistema.Autenticavel

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {

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

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta, senha: Int) {
        if (saldo < valor) throw SaldoInsuficienteException("Saldo insuficiente: $saldo, valor de retirada $valor")

        if (!autentica(senha)) throw FalhaAutenticacaoException()

        saldo -= valor
        contaDestino.deposita(valor)
    }
}
