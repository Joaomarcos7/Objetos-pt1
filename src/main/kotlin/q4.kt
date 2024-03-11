interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

fun main() {
    val retangulo = Retangulo(5.0, 3.0)
    val circulo = Circulo(2.0)

    println("Área do Retângulo: ${retangulo.calcularArea()}")
    println("Área do Círculo: ${circulo.calcularArea()}")
}
