package attempt_rough

fun main() {
    /*values of list are mutable and cannot be changed*/
    var ar = arrayOf(1, 2, 3, 4)
    println("First position = ${ar.get(0)}")
    println("Second position = ${ar[1]}")

    /*so we use mutable list,so we can change it's value*/
    var ls = listOf(1, 2, 3, 4)
    var mls = mutableListOf(1, 2, 3, 4)
    mls.add(5)
    mls.removeAt(1)
    mls.remove(1)
    println("Mutable list value =$mls")

    /*maps*/
    var map = mapOf(1 to "a", 2 to "b", 3 to "3")
    var mumap = mutableMapOf(1 to "a", 2 to "b", 3 to "3", 5 to "f")

    map.forEach { (key, value) ->
        println("key= $key value= $value")
    }


}