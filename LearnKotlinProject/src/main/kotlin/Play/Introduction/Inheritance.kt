package Play.Introduction

class Inheritance {
    class Human()           // default : final 상속불가
    open class Animal(val species : String, val name : String)     // 상속가능
    {
        open fun whoAreYou() {
            println("I am $name, a $species")
        }
    }

    class Dog(name : String) : Animal(species = "Dog", name = name)

    class Cat(name: String) : Animal(species = "Cat", name = name)
    {
        override fun whoAreYou() {
            println("I am $name, a $species Meow meow")
        }
    }

}