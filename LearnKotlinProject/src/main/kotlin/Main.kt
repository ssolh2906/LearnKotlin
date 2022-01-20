import Play.Introduction.*

fun main() {
    println("Hello Kotlin!\n")

    println("Example Codes from play.kotlinlang.org\n")
    NullSafety().example()

    val lola = Inheritance.Dog("Lola")
    lola.whoAreYou()
    val inky = Inheritance.Cat("Inky")
    inky.whoAreYou()
}