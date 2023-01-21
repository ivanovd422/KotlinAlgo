package easy

import utils.ListNode
import utils.generateNodesWithSize
import utils.printAllNodesValues

fun main() {
    val firstNode = ListNode(0)
    firstNode.next = generateNodesWithSize(5)
    val result = deleteDuplicates(firstNode)
    printAllNodesValues(result)

}

private fun deleteDuplicates(head: ListNode?): ListNode? {
    val fakeNode = ListNode(-101)
    fakeNode.next = head
    var previousNode = fakeNode
    var currentNode = head

    while (currentNode != null) {
        if (currentNode.`val` == previousNode.`val`) {
            previousNode.next = currentNode.next
        } else {
            previousNode = currentNode
        }
        currentNode = currentNode.next

    }

    return fakeNode.next

}