class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field.capitalize()
        set(value) {
            field = value
        }
    var saldo: Double = 0.0
        get()=field
        set(value) {
            field = if (value < 0) 0.0 else value
        }
}

fun main() {
    val conta = ContaBancaria()
    conta.nomeTitular = "maria"
    conta.saldo = -100.0

    println("Nome do Titular: ${conta.nomeTitular}") // Deve imprimir "Nome do Titular: Maria"
    println("Saldo da Conta: ${conta.saldo}") // Deve imprimir "Saldo da Conta: 0.0"
}