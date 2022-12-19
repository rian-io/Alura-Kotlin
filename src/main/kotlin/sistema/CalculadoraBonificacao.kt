package sistema

import pessoas.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.00
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}