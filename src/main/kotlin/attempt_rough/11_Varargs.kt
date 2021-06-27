package attempt_rough

fun main() {
    vararg1("d", "e", "t", "o", "x", "i", "c")
    vararg2("welcome", "pathu", "vaava")
    val x = intArrayOf(1, 2, 3, 4, 5)
    vararg3(9, *x, 10, 11)
}

fun vararg3(vararg x: Int) {
    println(x)
}

private fun vararg1(vararg x: String) {
    x.forEach {
        println(it)
    }
}

private fun vararg2(greetings: String, vararg x: String) {
    x.forEach { values ->
        println(" $greetings to ooty, nice to meet you $values")
    }
}