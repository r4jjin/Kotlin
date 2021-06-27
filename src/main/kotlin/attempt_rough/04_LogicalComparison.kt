package attempt_rough

fun main() {

    println("Comparison operators")
    var f = 9
    var x = 10
    println(" $x & $f operation(>) ${x > f}")
    println(" $x & $f operation(<) ${x < f}")
    println(" $x & $f operation(==) ${x == f}")
    println(" $x & $f operation(!=) ${x != f}")
    println(" $x & $f operation(>=) ${x >= f}")
    println(" $x & $f operation(<=) ${x <= f}")
    println()
    println("Logical Operators")
    println("&& operation for {x > f && x >= f} ${x > f && x >= f}")
    println("|| operation for {x > f || x >= f} ${x > f || x >= f}")
    println("! operation for {!(x > f || x >= f)} ${!(x > f || x >= f)}")

}