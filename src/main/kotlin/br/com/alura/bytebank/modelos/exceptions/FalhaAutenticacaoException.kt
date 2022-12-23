package br.com.alura.bytebank.modelos.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha a autenticação"
) : Exception(mensagem)