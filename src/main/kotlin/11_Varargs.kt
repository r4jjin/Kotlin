fun main() {
    vararg1("d", "e", "t", "o", "x", "i", "c")
    vararg2("welcome", "pathu", "vaava")
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