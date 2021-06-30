package attempt_rough

/*
class Company<T>(text: T) {
    var x = text

    init {
        println(x)
    }
}

fun main(args: Array<String>) {
    var name: Company<String> = Company<String>("Basic generics class and method")
    var rank: Company<Int> = Company<Int>(12)
}
*/

// star projection in array
fun printArray(array: Array<*>) {
    array.forEach { print(it) }
}

fun main(args: Array<String>) {
    val name = arrayOf("The", " quick ", "brown", " fox", " jumps", " over", " the", " lazy", " dog")
    printArray(name)
}
