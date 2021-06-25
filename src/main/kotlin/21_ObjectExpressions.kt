/**
 * Object Expressions
 * Create method, variable inside a temporary instance of class
 * Helps in creating instance of anonymous inner class using Object Expression
 */
fun main() {
    val o = object : Sample(), Intra {
        val x = 10
        override var neo: String = super.neo
            get() {
               return "$field??"
            }


        fun diskM() {
            println("Display Method Activated $neo")
        }

        override fun calc() {
            TODO("Not yet implemented")
        }
    }
    o.diskM()
    o.x

}

open class Sample {
open var neo="Neo ?"
}

interface Intra {
    fun calc()
}