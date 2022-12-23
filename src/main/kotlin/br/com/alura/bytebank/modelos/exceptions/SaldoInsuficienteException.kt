package br.com.alura.bytebank.modelos.exceptions

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)