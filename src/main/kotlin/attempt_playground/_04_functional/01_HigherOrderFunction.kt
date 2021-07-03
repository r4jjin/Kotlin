package attempt_playground._04_functional


fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    /*Invokes the higher-order function passing in two integer values and the function argument
     ::sum. :: is the notation that references a function by name in Kotlin.*/
    val sumResult = calculate(4, 5, ::sum)                          // 4
    /*Invokes the higher-order function passing in a lambda as a function argument.*/
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")

}