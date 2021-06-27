fun main() {
    println("Enter a number ")
    val age = try {
        readLine()?.toInt()
    } catch (e: Exception) {
        0
    }
    println(age)
    val by = 0;
    try {
        if (by == 0) throw DivideByZeroException()
        else {
            val x = 10 / by
            println(x)
        }
    } catch (e: DivideByZeroException) {
        println(e)
    }
}

class DivideByZeroException : ArithmeticException("You cannot divde a number by zero")