package br.com.alura.array

fun testaIdade() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20
//
//    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
//        idade1
//    } else if (idade2 > idade3) {
//        idade2
//    } else {
//        idade3
//    }
//
//    println(maiorIdade)

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = Int.MIN_VALUE

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)

}

fun testaIdades2(){

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)

    val maiorIdade = idades.maxOrNull()
    println("maior idade é $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("menor idade é $menorIdade")

    val media = idades.average()
    println("a média é $media")

    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18}
    println("Algum é maior? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("busca: $busca")



}