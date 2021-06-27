package attempt_rough

fun main() {
    /*while looping concept*/
    var x = 5
    while (x <= 10) {
        println("Index=$x")
        x++
    }
    /*for loop*/
    /*1..3 is in range operator to attempt_rough.display 1 to 3*/
    for (i in 1..8) {
        println("In range index = $i")
    }

    /*for each loop -> lambda syntax in kotlin*/
    var ar = arrayOf(1, 2, 3, 4)
    ar.forEach {
        println("Reference by default is it->$it")
    }
    ar.forEach { x ->
        println("Reference updated to x->$x")
    }
    ar.forEachIndexed { index, item ->
        println("index= $index , i= $item")
    }
}