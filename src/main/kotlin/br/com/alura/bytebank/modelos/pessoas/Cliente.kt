package br.com.alura.bytebank.modelos.pessoas

import br.com.alura.bytebank.modelos.dados.Endereco
import br.com.alura.bytebank.modelos.sistema.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}