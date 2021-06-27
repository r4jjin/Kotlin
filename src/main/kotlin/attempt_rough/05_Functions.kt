package attempt_rough

fun main() {
    println(sayHello())
    println(sayHello("welcome"))
}

//this method is same as returning a string value in response
/*
 fun attempt_rough.sayHello(): Unit
 {
 return "Hello World"
 }
 */
private fun sayHello() = "Hello World"
fun sayHello(x: String = "default ") = "Hello $x"
//fun attempt_rough.sayHello(x:String) = println("Hello $x")