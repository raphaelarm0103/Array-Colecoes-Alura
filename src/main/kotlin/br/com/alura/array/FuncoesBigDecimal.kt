package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode


    fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
        if (salario < "5000.0".toBigDecimal()) {
            salario + "500.0".toBigDecimal()
        } else (salario * aumento)
            .setScale(2, RoundingMode.UP)

    fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
        return Array<BigDecimal>(valores.size) { i ->
            valores[i].toBigDecimal()
        }
    }

    fun Array<BigDecimal>.somatoria(): BigDecimal {
        return this.reduce { acumulador, valor ->
            acumulador + valor
        }
    }

    fun Array<BigDecimal>.media(): BigDecimal {
        return if (this.isEmpty()) {
            BigDecimal.ZERO
        } else {
            this.somatoria() / this.size.toBigDecimal()
        }
    }