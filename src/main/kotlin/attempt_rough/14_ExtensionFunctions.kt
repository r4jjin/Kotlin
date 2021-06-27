package attempt_rough

fun main() {
    for (x in 2..9) {
        if (x.isPrime()) {
            println(x)
        }
    }

}

/*adding a method to existing class, the value is referenced by this keyword*/
fun Int.isPrime(): Boolean {
    var pr = true
    for (i in 2 until this) {
        if (this % i == 0) {
            pr = false
            break
        }
    }

    return pr
}