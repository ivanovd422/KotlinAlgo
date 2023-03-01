package medium

import utils.ListNode

fun main() {
    val cycle = ListNode(2)
    val node = ListNode(3)
        .apply {
            next = cycle.apply {
                next = ListNode(0).apply {
                    next = ListNode(-4).apply {
                        next = cycle
                    }
                }
            }
        }

    val result = detectCycle(node)
    println(result)
}

private fun detectCycle(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while (fast != null) {
        slow = slow?.next
        fast = fast?.next?.next
        if (fast == slow) break
    }

    if (fast == null) return null

    var point1 = head
    while (fast != point1) {
        point1 = point1!!.next!!
        fast = fast!!.next!!
    }

    return fast
}

private fun detectCycleWithLength(head: ListNode?): ListNode? {
    var fast = head
    var slow = head

    while (fast != null && fast.next != null) {
        fast = fast?.next?.next
        slow = slow?.next
        if (fast == slow) break
    }

    if (fast?.next == null) return null

    var counter = slow
    var count = 0
    do {
        count++
        counter = counter?.next
    } while (counter != slow)

    slow = head
    fast = head

    while (count > 0) {
        count--
        fast = fast?.next
    }

    while (slow != fast) {
        slow = slow?.next
        fast = fast?.next
    }
    return slow
}