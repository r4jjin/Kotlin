fun main() {
    println(sayHello())
    println(sayHello("welcome"))
}

//this method is same as returning a string value in response
/*
 fun sayHello(): Unit
 {
 return "Hello World"
 }
 */
fun sayHello() = "Hello World"
fun sayHello(x: String = "default ") = "Hello $x"
//fun sayHello(x:String) = println("Hello $x")