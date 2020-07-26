package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun main() {
    evaluateGuess("abc", "abc")
}

fun evaluateGuess(secret: String, guess: String): Evaluation {
    println(guess)
}
