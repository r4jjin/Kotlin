package attempt_playground._04_functional

/*Declares a higher-order function that returns a function.
 (Int) -> Int represents the parameters and return type of the square function.*/
fun operation(): (Int) -> Int {
    return ::square
}

/*Declares a function matching the signature*/
fun square(x: Int) = x * x

fun main() {
    /*Invokes operation to get the result assigned to a variable.
     Here func becomes square which is returned by operation*/
    val func = operation()
    println(func(2))
}