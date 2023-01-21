package easy

import java.util.*

fun main() {

}

class MyQueue() {
    private val firstStack = Stack<Int>()
    private val secondStack = Stack<Int>()

    fun push(x: Int) {
        firstStack.add(x)

    }

    fun pop(): Int {
        if (secondStack.isEmpty().not()) {
            return secondStack.pop()
        }
        moveToTheSecondStack()

        return secondStack.pop()
    }

    fun peek(): Int {
        if (secondStack.isEmpty().not()) {
            return secondStack.peek()
        }
        moveToTheSecondStack()

        return secondStack.peek()
    }

    fun empty(): Boolean {
        return firstStack.isEmpty() && secondStack.isEmpty()
    }

    private fun moveToTheSecondStack() {
        while (firstStack.isEmpty().not()) {
            secondStack.add(firstStack.pop())
        }
    }

}