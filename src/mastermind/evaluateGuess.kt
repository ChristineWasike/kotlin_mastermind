package mastermind

import java.util.*

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun main() {
    println(evaluateGuess("ABCD", "CDBA"))
}

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0

    val letterDict = hashMapOf<String, String>()

    for (i in secret.indices) {
        letterDict[secret[i].toString()] = guess[i].toString()
    }

    for ((key, value) in letterDict) {
        if (key == value) {
            rightPosition +=1
        } else if(key != value && value in letterDict.keys){
            wrongPosition +=1
        }
    }

    return Evaluation(rightPosition, wrongPosition)
}
