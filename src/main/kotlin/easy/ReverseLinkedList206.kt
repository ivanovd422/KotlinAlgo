package easy

import utils.ListNode
import utils.generateNodesWithSize
import utils.printAllNodesValues

fun main() {
    val result = reverseList(generateNodesWithSize(5))

    printAllNodesValues(result)

}

private fun reverseList(head: ListNode?): ListNode? {
    var currentNode = head
    var previousNode: ListNode? = null
    var nextNode: ListNode? = null

    while (currentNode != null) {
        nextNode = currentNode.next
        currentNode.next = previousNode
        previousNode = currentNode
        currentNode = nextNode
    }

    return previousNode

}