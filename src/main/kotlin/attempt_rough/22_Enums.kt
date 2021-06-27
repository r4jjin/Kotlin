package attempt_rough

fun main() {
    /*properties of enum
    1.attempt_rough.getName - This property stores the attempt_rough.getName of the constant.
    2.ordinal-This property stores the ordinal value of the constant, which is usually a zero-based index.
    */
    println(Gender.Female.name)
    println(Gender.Male.ordinal)

    /*Methods of enum
    1. values: This method returns a list of all the constants defined within the enum class.
    2. valueOf: This methods returns the enum constant defined in enum, matching the input string. If the constant, is not present in the enum, then an IllegalArgumentException is thrown.
    */
    println(Cards.valueOf(Cards.Spade.toString()))
    println(Gender.values())

    /*
    3. Usage of when expression with enum class –
    */
    when(DAYS.SUNDAY){
        DAYS.SUNDAY -> println("Today is Sunday")
        DAYS.MONDAY -> println("Today is Monday")
        DAYS.TUESDAY -> println("Today is Tuesday")
        DAYS.WEDNESDAY -> println("Today is Wednesday")
        DAYS.THURSDAY -> println("Today is Thursday")
        DAYS.FRIDAY -> println("Today is Friday")
        DAYS.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }

    println(Cards.Spade.s)
}

/*1. enum constants are instances of an Enum class*/
enum class Gender {
    Male,
    Female,
    Other
}

/*2.the constants can be initialized by passing specific values to the primary constructor.*/
enum class Cards(val s: String) {
    Spade("black"),
    Hearts("red")
}

enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
