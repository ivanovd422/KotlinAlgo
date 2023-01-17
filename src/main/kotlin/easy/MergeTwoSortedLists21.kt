package easy

import utils.ListNode


fun main() {

    val first = ListNode(1)
        .apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }

    val second = ListNode(1)
        .apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }

    var result = mergeTwoLists(first, second)

    while (result != null) {
        print(result.`val`)
        result = result.next
    }

}

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var prehead: ListNode? = ListNode(-1)
    var prev = prehead

    var firstNode = list1
    var secondNode = list2

    while (firstNode != null && secondNode != null) {

        if (firstNode.`val` <= secondNode.`val`) {
            prev?.next = firstNode
            firstNode = firstNode.next
        } else {
            prev?.next = secondNode
            secondNode = secondNode.next
        }

        prev = prev?.next
    }

    prev?.next = firstNode ?: secondNode


    return prehead?.next
}
