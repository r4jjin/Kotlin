package attempt_playground._01_introductions
/*Member functions and extensions with a single parameter can be turned into infix functions.*/
fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    /*Creates a Pair by calling the infix function to from the standard library.*/
    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}