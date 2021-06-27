/*
* sealed classes conform to restricted or bounded class hierarchies.
* All the subclasses of the sealed class must be defined within the same Kotlin file, They can be defined in any scope where the sealed class is visible.
* It is used when it is known in advance that a type will conform to one of the subclass types
* The sealed classes constructors are private by default.
* A sealed class is implicitly abstract and hence it cannot be instantiated.
* */
/*sealed class Demo {
    class A : Demo() {
        fun display() {
            println("Subclass A of sealed class Demo")
        }
    }

    class B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

fun main() {
    val obj = Demo.B()
    obj.display()

    val obj1 = Demo.A()
    obj1.display()
}*/
// A sealed class with a string property
sealed class Fruit
    (val x: String) {
    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate : Fruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}

fun main() {
    // Objects of different subclasses created
    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
}
