package attempt_rough

fun printDetails(msg: String, vararg z: String) {
    println(msg)
    z.forEach { value ->
        println("Item $value")
    }

}


fun main() {
    val msg = "Spread operator * in this calling method send it as a string"
    val x = arrayOf("1", "1", "1", "1")
    printDetails(msg, * x)
}