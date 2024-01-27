fun main() {

    var numString = "x"
    println("Please enter a number 1-10 to be translated to German")
    val num = readln().toInt()
    when (num){
        1 -> numString = "Ein"
        2 -> numString = "Zwei"
        3 -> numString = "Drei"
        4 -> numString = "Vier"
        5 -> numString = "Funf"
        6 -> numString = "Sechs"
        7 -> numString = "Sieben"
        8 -> numString = "Acht"
        9 -> numString = "Neun"
        10 -> numString = "Zehn"
        !in 1..10 -> numString = "Out of range"
        else -> numString = "Unknown input"
    }
    println("the number is $numString")
}