class Cliente {
    var nome: String = ""
        get() = field.capitalize()
        set(value) {
            field = value
        }
    private var idade: Int = 0

    fun mostrarIdade() {
        println("A idade do cliente é $idade")
    }
}
fun main() {
    val cliente = Cliente()
    cliente.nome = "joão"
    cliente.mostrarIdade() // Deve imprimir "A idade do cliente é 0"
}