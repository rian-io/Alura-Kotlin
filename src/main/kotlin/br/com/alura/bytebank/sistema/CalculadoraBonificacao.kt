package br.com.alura.bytebank.sistema

import br.com.alura.bytebank.modelos.pessoas.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.00
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}