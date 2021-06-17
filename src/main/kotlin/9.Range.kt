fun main() {
    /*down to upper bound to lower bound*/
    for(i in 10 downTo 5){
        println("Down range from 10 to $i")
    }

    for(i in 10 downTo  5 step 2){
        println("Down range from 10 to $i with step 2")
    }

    for (i in 'a'..'z' step 5){
        println("Alphabet = $i")
    }
}