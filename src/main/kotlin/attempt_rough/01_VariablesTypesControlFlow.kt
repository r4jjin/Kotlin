package attempt_rough

//declaring variables and values
val hello: String = "Hello"
var world: String = "World"

//by default string are not null in kotlin
var name: String? = null

//Type inference: Kotlin can automatically understand the type of variable
val subject = "Kotlin"

//control flow
//if,else,when(switch in java)
fun main() {

    println(hello)
    println(world)

    when (subject) {
        null -> print("null incoming")
        else -> print("welcome to $subject")
    }

    //if,else,when used as expressions
    var greetings = if (world != null) world else "Hello"
    var msg = when (hello) {
        null -> "Hello"
        else -> hello
    }

}