import Deto.pi

/*this is equivalent to singleton class in java
* just like normarl class, this allows class and interface to be implemented
* if we need to have singleton behaviour for just few cases inside class- we define it in companion object block
* */
fun main() {
    println(pi)
    println(Amd.Grx.meg)
    println(Amd.showUp())
 }

object Deto : Amd(), Cer {
    val pi = 22.0 / 7.0
    override fun boss() {
        println("boss here")
    }
}

open class Amd {
    fun marlo() {
        println("this is method marlo")
    }
    companion object Grx{
        val meg="Meg reporting"
        fun showUp(){
            println("$meg")
        }
    }
}

open interface Cer {
    fun boss()
}
