package br.com.alura.list

fun List<Livro?>.imprimeCommarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} do ano ${it.anoPublicacao}"
    }
    println("### Lista de Livros ### \n$textoFormatado")
}