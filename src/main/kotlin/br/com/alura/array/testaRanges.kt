package br.com.alura.array

fun testaRanges() {
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { println("$it") }

    val intervalo = 1500.0..5000.0
    val salario = 6000.0
    if (salario in intervalo) {
        salario
        println("$salario")
    }
    println("Não está no intervalo")
}