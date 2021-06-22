/*
Example 1: this is called a markup interface
no need to define curly or round brackets for interface or class
code:
interface `16_Interface`
class InterfaceExample:`16_Interface`
}*/

/*
Example 2:
interface `16_Interface` {
    fun display(): String
}
*/
/*if can't implement methods of it, then make it abstract*//*

abstract class AbstractSample:`16_Interface`

*/
/*define all elements from Interface using the : keyword*//*

class InterfaceExample : `16_Interface` {

    override fun display(): String {
        println("display() method invoked")
        return "return type"
    }
}*/

/*
Example 3: Define a method in interface
interface `16_Interface` {
    fun display(): String {
        println("display() method invoked")
        return "return type"
    }
}
class InterfaceExample : `16_Interface` {}

fun main() {
    val x=InterfaceExample();
    x.display()
}*/

/*Example 4: Defining property inside interface
* for val-> implementing class should override get only, since it is initialized only once
* for var-> it should implement both getter ans setter
interface `16_Interface` {
    val s: String
    var x: Int
    val a: Boolean
    var b: Char
}

class InterfaceExample(override val a: Boolean, override var b: Char) : `16_Interface` {
    override val s: String
        get() = "return a constant for val"
    override var x: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val obj = InterfaceExample(b = '1', a = true)
    obj.x = 9
    println("s=${obj.s}, x=${obj.x} a=${obj.a}, b=${obj.b}")
}*/

/*Example 5: Defining multiple interface for same class*/
interface `16_Interface`
interface SecondInterface
class InterfaceExample : `16_Interface`, SecondInterface

fun main() {
    val obj = InterfaceExample()

}