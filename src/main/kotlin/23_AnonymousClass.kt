abstract class Shape(val shape: String, val dimensions: Double) {
    abstract fun details()
}

fun main() {
    val x = object : Shape("square", 5.0) {
        override fun details() {
            println("Details are shape is $shape & dimension is $dimensions")
        }
    }
    x.details()
}