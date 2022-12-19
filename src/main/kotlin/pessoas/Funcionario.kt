package pessoas

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    abstract val bonificacao: Double
}