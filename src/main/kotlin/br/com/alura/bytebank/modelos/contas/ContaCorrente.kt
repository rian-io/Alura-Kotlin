package br.com.alura.bytebank.modelos.contas

import br.com.alura.bytebank.modelos.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.pessoas.Cliente

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if (this.saldo < valor) throw SaldoInsuficienteException()

        val valorComTaxa = valor + 0.10
        this.saldo -= valorComTaxa
    }
}