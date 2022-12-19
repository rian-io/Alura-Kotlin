package contas

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if (this.saldo < valor) { return }

        val valorComTaxa = valor + 0.10
        this.saldo -= valorComTaxa
    }
}