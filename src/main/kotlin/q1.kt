// Questão 1
class Produto(val nome: String, val preco: Double) {
    // Implemente os construtores conforme especificado na questão
}

fun main() {
    val produto1 = Produto("Celular", 1200.0)
    val produto2 = Produto("Notebook", 2500.0)

    println("Produto 1: ${produto1.nome}, Preço: ${produto1.preco}")
    println("Produto 2: ${produto2.nome}, Preço: ${produto2.preco}")
}