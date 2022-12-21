package br.com.alura.bytebank.modelos.sistema

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}