fun main() {
    /*named arguments*/
    printSomething(s1 = "Hello", s = "World")
    /*default parameters and named type arguments*/
    printSomething(s = "x")
    /*default parameters and named type arguments*/
    printSomething(s1 = "x")
}

fun printSomething(s: String = "text 1", s1: String = "test2") {
    println("$s $s1")
}
