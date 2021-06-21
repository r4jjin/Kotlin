/*by default it has a constructor
* we can define this class as following for no default constructor scenario
* class `15_Class` constructor()
* class `15_Class`()
* class `15_Class`
* class `15_Class`{}
* all of the above are same
*
* Constructor
* the init block is same as declared variables fName & lName. Both help to initialize the values
* property access syntax-> no getter and setter in kotlin, access variables directly
*
* Here variable is declared directly in constructor, no need to define separate variables for it
* before=( firstName: String,  lastName: String)
* after=(val firstName: String, val lastName: String)
* */
class `15_Class`(val firstName: String = "Detoxic", val lastName: String = "Soul") {

    init {
        println("init 1: this will be executed before anything else")
    }

    init {
        println("init 2 this will be executed in order in which delcared")
    }

    var msg = "Welcome"

    /*defining method in class with no return type and no arguments*/
    fun printDetails() {
        /*this is an elvis operator ?: */
        msg = msg
        println("$msg, Name is $firstName $lastName")
    }

    /*here we are moidying class getter and setter properties*/
    /*we are providing customization for set value*/
    var name = "Detoxic"
        set(value) {
            field = "$value new value"
            println("setter is called")
        }
        /*this is modifying the getter propert*/
        get() {
            println("getter is called")
            return field

        }
    /*var fName = firstName
    var lName = lastName*/
    /* init {
         fName=firstName
         lName=lastName
     }*/

    /*by defining secondary constructor we need to satisfy the params of first constructor*/
    /* constructor() : this("Peter", "Parker") {

     }*
     this block of code can replaced by
     before: (val firstName: String, val lastName: String)
     after:(val firstName: String="Detoxic", val lastName: String="Soul")
     /
     */
}

fun main() {
    /*this is how object is created, no need to use new keyword like other programming lang*/
//    val x1 = `15_Class`()
//    val x2 = `15_Class`("firtName", "lastName")
    val x3 = `15_Class`()
    x3.name = "annakutty"
    println(x3.name)
    x3.printDetails()

    /*
    * visibility modifiers
    * public- by default everything is public in kotlin
    * private-only made accesible inside the class
    * protected- only available to subclasses
    * internal- only available within the package
    * */
}