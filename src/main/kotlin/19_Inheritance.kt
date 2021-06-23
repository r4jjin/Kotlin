/*
* In Kotlin, all classes are final by default.
* To permit the derived class to inherit from the base class,
* we must use the open keyword in front of the base class.
* open class baseClass (x:Int ) {
      ..........
}
class derivedClass(x:Int) : baseClass(x) {
     ...........
}
* */
//base class
open class baseClass {
    val name = "Ohma"
    open fun A() {
        println("Base Class")
    }
}

//derived class
class derivedClass : baseClass() {
    fun B() {
        println(name)         //inherit name property
        println("Derived class")
    }

    override fun A() {}
}

fun main(args: Array<String>) {
    val derived = derivedClass()
    derived.A()         // inherting the base class function
    derived.B()         // calling derived class function
}

/*Kotlin inheritance secondary constructor:
If the derived class does not contain a primary constructor,
we need to call the base class secondary constructor from the secondary constructor of derived class
using the 'super' keyword.
We also need to initialize the base class secondary constructor using the parameters of derived class.
* //base class
open class Employee {
	constructor(name: String,age: Int){
			println("Name of the Employee is $name")
			println("Age of the Employee is $age")
	}
}
// derived class
class CEO : Employee{
	constructor( name: String,age: Int, salary: Double): super(name,age) {
		println("Salary per annum is $salary million dollars")
	}
}
fun main(args: Array<String>) {
	CEO("Satya Nadela", 48, 250.00)
}
*/

/*Kotlin program of overriding the member function :
* // base class
open class Animal {
	open fun run() {
		println("Animals can run")
	}
}
// derived class
class Tiger: Animal() {
	override fun run() {	 // overrides the run method of base class
		println("Tiger can run very fast")
	}
}
fun main(args: Array<String>) {
	val t = Tiger()
	t.run()
}
*/

/*Kotlin program of overriding the member property:
If the base class and derived class contain a member function with the same name,
then we can override the base member function in the derived class using the 'override' keyword and
 also need to mark the member function of the base class with 'open' keyword.
* // base class
open class Animal {
	open var name: String = "Dog"
	open var speed = "40 km/hr"

}
// derived class
class Tiger: Animal() {
	override var name = "Tiger"
	override var speed = "100 km/hr"
}
fun main(args: Array<String>) {
	val t = Tiger()
	println(t.name+" can run at speed "+t.speed)
}
*/

/*Calling the superclass implementation:
* // base class
open class Phone() {
	var color = "Rose Gold"
	fun displayCompany(name:String) {
		println("Company is: $name")
	}
}
// derived class
class iphone: Phone() {
	fun displayColor(){

		// calling the base class property color
		println("Color is: "+super.color)

		// calling the base class member function
		super.displayCompany("Apple")
	}
}
fun main(args: Array<String>) {
	val p = iphone()
	p.displayColor()
}
*/