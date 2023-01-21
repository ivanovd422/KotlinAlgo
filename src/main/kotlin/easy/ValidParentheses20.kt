package easy

import java.util.Stack

fun main() {

}

private fun isValid(s: String): Boolean {
    val stack: Stack<Char> = Stack()

    for (char in s) {

        if (isOpening(char)) {
            stack.add(char)
        } else {

            if (stack.isEmpty()) {
                return false
            }
            //check that value from stack: closing && same type
            val expected = getPairForClosing(char)
            val fromStack = stack.pop()

            if (expected != fromStack) {
                return false
            }
        }
    }

    return true
}


private fun isOpening(s: Char): Boolean {
    return s == '(' || s == '[' || s == '{'
}

private fun getPairForClosing(s: Char): Char {
    return if (s == ']') {
        '['
    } else if (s == '}') {
        '{'
    } else {
        '('
    }
}