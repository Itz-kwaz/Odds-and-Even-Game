
import java.util.*


fun main() {
    val input = Scanner(System.`in`)
    println("Let's play a game called \"Odds and Evens\".")
    println("What is your name")
    val name = input.next()   //Name of the player.
    var reply = "yes"
    var userScore = 0
    var computerScore = 0
    while (reply.equals("yes", ignoreCase = true)) {
        println("Hello! $name, which do you choose? Odds or Evens?")
        var choice = input.next()
        while (!choice.equals("odds", ignoreCase = true) && !choice.equals("evens", ignoreCase = true)) {
            println("Please pick odds or evens again")
            choice = input.next()
        }
        if (choice.equals("odds", ignoreCase = true)) {
            println("$name has picked odds! The computer will be evens")
        } else if (choice.equals("evens", ignoreCase = true)) {
            println("$name has picked evens! The computer will be odds")
        }
        println("______________________________________________")
        println("How many \"finger\" do you put out?")

        var fingers = input.nextInt()  /* The number of fingers the user chooses. */
        while (fingers > 5) {
            println("It can't be more than 5,Plese pick again")

            fingers = input.nextInt()
        }
        val rand = Random()
        val computer = rand.nextInt(6) /* The choice of the computer. */
        println("The computer plays $computer fingers")
        println("__________________________")
        val sum = fingers + computer
        print("The sum is $sum")
        if (sum % 2 == 0) {
            println("(even)")
            if (choice.equals("evens", ignoreCase = true)) {
                println("Congratulations!! you won")
                userScore++
            } else {
                println("The computer won")
                computerScore++
            }
        } else {
            println("(odd)")
            if (choice.equals("odds", ignoreCase = true)) {
                println("Congratulations you won")
                userScore++
            } else {
                println("The computer won")
                computerScore++
            }
        }
        println("$name:$userScore Computer:$computerScore")
        println("Type yes if you want to play again")
        reply = input.next()

    }
    println("Thank you $name for playing.")

}

