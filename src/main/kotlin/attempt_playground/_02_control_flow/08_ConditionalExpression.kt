package attempt_playground._02_control_flow

/*There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:*/
fun main() {

    /*if is an expression here: it returns a value.*/
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))
}