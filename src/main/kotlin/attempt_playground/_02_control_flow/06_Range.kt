package attempt_playground._02_control_flow

fun main() {
    /*Integer range */
    /*Iterates over a range starting from 0 up to 3 (inclusive). Like 'for(i=0; i<=3; ++i)' in other programming languages (C/C++/Java).*/
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    /*Iterates over a range starting from 0 up to 3 (exclusive). Like for loop in Python or like 'for(i=0; i<3; ++i)' in other programming languages (C/C++/Java).*/
    for (i in 0 until 3) {
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")


    /*Char range*/
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")

    /*usage of range in if statements*/
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }

}