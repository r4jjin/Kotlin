package attempt_rough

fun main() {
    println("Hello, please enter your age")
    val age = readLine()
    //adding the ? confirm it that if value is null, then remaining toInt() or methods wont be executed
    // and it will return null safetly
    var msg = ""
    if (age != null)
        msg = if (age.toInt() >= 18) "You are an adult" else "You are not a adult yet"
    println(msg)
}