package sistema

import pessoas.FuncionarioAdmin

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha = senha)) {
            println("Bem vindo ao sistema interno.")
        } else {
            println("Falha na autenticação")
        }
    }
}