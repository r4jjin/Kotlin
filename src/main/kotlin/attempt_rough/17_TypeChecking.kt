package attempt_rough

/* Type Checking and Smart Casting
sort of similar to instanceof keyword in other programming languages
In Kotlin, we can check the type of certain variable using the is operator at runtime.
It is a way of checking the type of a variable at runtime to separate the flow for different objects.*/
fun main(args: Array<String>) {
    var name = "Ohma"
    var age = 47
    var salary = 99.99
    val employeeDetails: List<Any> = listOf(name, age, salary)

    /* Example1:usinf if statement
    for(attribute in employeeDetails) {
         if (attribute is String) {
             println("Name: $attribute")
         } else if (attribute is Int) {
             println("Age: $attribute")
         } else if (attribute is Double) {
             println("Salary: $attribute")
         } else {
             println("Not an attribute")
         }
     }*/
    for (attribute in employeeDetails) {
        when (attribute) {
            is String -> println("Name: $attribute ")
            is Int -> println("Age: $attribute")
            is Double -> println("Salary: $attribute")
            else -> println("Not an attribute")
        }
    }

    /*
    * Java uses explicit casting using brackets like (CastingClass)
Object ob = "Detoxic Copy";

if(ob instanceof String) {
	// Explicit type casting
	String str = (String) ob;

	System.out.println("length of String " + str.length());
}
* in below example kotlin confirms the same in is block and then takes care of it in inside modules
fun attempt_rough.main(args: Array<String>) {
	val str1: String? = "Detoxic Copy"
	var str2: String? = null // prints String is null
	if(str1 is String) {

		// No Explicit type Casting needed.
		println("length of String ${str1.length}")
	}
	else {
		println("String is null")
	}
}
* usage of !is
fun attempt_rough.main(args: Array<String>) {
	val str1: String? = "Detoxic Copy"
	var str2: String? = null // prints String is null
	if(str1 !is String) {
		println("String is null")
	}
	else {
		println("length of String ${str1.length}")
	}
}

    * */
}
