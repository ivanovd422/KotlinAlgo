package easy

import utils.ListNode

fun main() {
    //3,2,0,-4
    val node = ListNode(3)
        .apply {
            next = ListNode(2).apply {
                next = ListNode(0).apply {
                    next = ListNode(-4)
                }
            }
        }

    val result = hasCycle(node)
    println(result)
}

private fun hasCycle(head: ListNode?): Boolean {
    if (head == null) return false

    val hashSet = hashSetOf<ListNode>()
    var node: ListNode? = head

    while (node?.next != null) {

        if (hashSet.contains(node)) {
            return true
        }

        hashSet.add(node)
        node = node.next
    }

    return false

}

private fun hasCycleConstantSpace(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next

    while (fast != null) {
        if (fast == slow) {
            return true
        }

        slow = slow?.next
        fast = fast?.next?.next
    }

    return false
}