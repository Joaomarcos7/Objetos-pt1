abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("O Guerreiro ataca com sua espada!")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("O Mago lança um feitiço poderoso!")
    }
}

fun main() {
    val guerreiro = Guerreiro()
    val mago = Mago()

    guerreiro.atacar()
    mago.atacar()
}