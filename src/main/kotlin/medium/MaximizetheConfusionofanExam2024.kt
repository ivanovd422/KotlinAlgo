package medium

fun main() {
        val answerKey = "FFFTTFTTFT" //5 //5
    val k = 3

    val result = maxConsecutiveAnswers(answerKey, k)
    println(result)

}

private fun maxConsecutiveAnswers(answerKey: String, k: Int): Int {
    var right = 0
    var left = 0
    var max = 0
    var current = 0
    var swaps = k
    var n = answerKey.length

    while (right != n  && left != n ) {
        if (answerKey[left] == answerKey[right]) {
            current++
            max = Math.max(current, max)
            right++
        } else if (swaps > 0) {
            current++
            max = Math.max(current, max)
            swaps--
            right++
        } else {
            current = 0
            swaps = k
            left++
            right = left
        }
    }

    return max
}