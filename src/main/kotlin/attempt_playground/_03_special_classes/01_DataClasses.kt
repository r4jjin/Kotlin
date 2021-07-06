package attempt_playground._03_special_classes

data class User(val name: String, val id: Int) {
    /*Override the default equals method by declaring users equal if they have the same id.*/
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    /*Data class instances with exactly matching attributes have the same hashCode.*/
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    /*Auto-generated copy function makes it easy to create a new instance.*/
    println(user.copy())

    /*copy creates a new instance, so the object and its copy have distinct references.*/
    println(user === user.copy())

    /*When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.*/
    println(user.copy("Max"))

    /*Use copy with named arguments to change the value despite of the properties order.*/
    println(user.copy(id = 3))

    /*Auto-generated componentN functions let you get the values of properties in the order of declaration.*/
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}