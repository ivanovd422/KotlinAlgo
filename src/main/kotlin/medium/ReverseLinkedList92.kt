package medium

import utils.ListNode

fun main() {

    val node = ListNode(1)
        .apply {
            next = ListNode(2)/*.apply {
                next = ListNode(3).apply {
                    next =  ListNode(4).apply {
                        next =  ListNode(5)
                    }
                }
            }*/
        }

    var result = reverseBetween(node, 1, 2)


    while (result != null) {
        println(result.`val`)
        result = result?.next
    }

}

private fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    var newHead = head
    var counter = 1
    var previous: ListNode? = null
    var current: ListNode? = newHead
    while (counter < left) {
        previous = current
        current = current?.next
        counter++
    }

    val start = previous
    start?.next = null
    var subEnd = current
    var next: ListNode? = null
    previous = null

    while (counter <= right) {
        next = current?.next
        current?.next = previous
        previous = current
        current = next
        counter++
    }

    if (start != null) {
        start.next = previous
    } else {
        newHead = previous
    }

    subEnd?.next = current

    return newHead
}