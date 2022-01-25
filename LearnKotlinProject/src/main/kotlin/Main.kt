import Play.Collections.MyList
import Play.Collections.MyMap
import Play.Introduction.*

fun main() {
    println("Hello Kotlin!\n")

    println("Example Codes from play.kotlinlang.org\n")
    // Null Safety
    NullSafety().example()

    // Class
    val lola = Inheritance.Dog("Lola")
    lola.whoAreYou()
    val inky = Inheritance.Cat("Inky")
    inky.whoAreYou()


    // Collections
    // List
    val myList = MyList()
    myList.testMyList()

    val myMap = MyMap()
    myMap.testMyMap()

}