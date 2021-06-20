fun main() {
    /*down to upper bound to lower bound*/
    for (i in 10 downTo 5) {
        println("Down range from 10 to $i")
    }

    for (i in 10 downTo 5 step 2) {
        println("Down range from 10 to $i with step 2")
    }

    for (i in 'a'..'z' step 5) {
        println("Alphabet = $i")
    }

    println("Enter your age ")
    val age = readLine()?.toInt()
    if (age in 0..18) {
        println("You are not an adult yet as per age")
    } else {
        println("You are adult and can vote now")
    }
    when (age) {
        in 0..17 -> println("Your are not an adult as per when condition also :p")
        18 -> println("You are 18 finally..")
        19, 20 -> println("You will be crossing 20+ soon")
        else -> println("You are 18+")
    }
}