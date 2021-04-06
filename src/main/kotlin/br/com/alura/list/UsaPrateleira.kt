package br.com.alura.list

fun main(){

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros )

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeCommarcadores()
    porAnoPublicacao.imprimeCommarcadores()
}