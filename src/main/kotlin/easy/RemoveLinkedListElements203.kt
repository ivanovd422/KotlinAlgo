package easy

import utils.ListNode
import utils.generateNodesWithSize
import utils.printAllNodesValues

fun main() {
    val node = ListNode(3)
    node.next = generateNodesWithSize(4)

    val result = removeElements(node, 3)
    printAllNodesValues(result)
}


private fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var fakeNode = ListNode(0)
    fakeNode.next = head

    var prevNode: ListNode? = fakeNode
    var currentNode: ListNode? = head

    while (currentNode != null) {
        if (currentNode.`val` == `val`) {
            prevNode?.next = currentNode.next
        } else {
            prevNode = currentNode
        }
        currentNode = currentNode.next
    }

    return fakeNode.next

}