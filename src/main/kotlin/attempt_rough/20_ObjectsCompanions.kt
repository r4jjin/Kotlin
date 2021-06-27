package attempt_rough

import attempt_rough.Detox.pi

/*this is equivalent to singleton class in java
* just like normal class, this allows class and interface to be implemented
* if we need to have singleton behaviour for just few cases inside class- we define it in companion object block
* */
fun main() {
    println(pi)
    println(Amd.meg)
    println(Amd.showUp())
    val x = Amd()
    x.marlo()
}

/*Object declarations are thread safe singletons*/
object Detox : Amd(), Cer {
    const val pi = 22.0 / 7.0
    override fun boss() {
        println("boss here")
    }
}

open class Amd {
    fun marlo() {
        println("this is method marlo")
    }

    companion object Grx {
        const val meg = "Meg reporting"
        fun showUp() {
            println(meg)
        }
    }
}

interface Cer {
    fun boss()
}
