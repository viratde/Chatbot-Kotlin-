package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val rem1 = readln().toInt()
    val rem2 = readln().toInt()
    val rem3 = readln().toInt()

    val userAge = (rem1 * 70 + rem2 * 21 + rem3 * 15) % 105

    println("Your age is $userAge; that's a good time to start programming!")
}
