package utils

fun main() {

    val result = generateNodesWithSize(10)
    printAllNodesValues(result)
}

fun runWithTime(algo: () -> Unit) {
    val start = System.currentTimeMillis()
    algo.invoke()
    val end = System.currentTimeMillis()
    println("------------------------------")
    println("Time - ${end - start}")
    println("------------------------------")
}

fun generateNodesWithSize(size: Int): ListNode {
    val head = ListNode(0)
    var buffer: ListNode? = null

    for (i in 1..size) {
        if (buffer == null) {
            buffer = ListNode(i)
            head.next = buffer
        } else {
            buffer.next = ListNode(i)
            buffer = buffer.next
        }
    }

    return head
}

fun printAllNodesValues(node: ListNode?) {
    var buffer = node
    while (buffer != null) {
        println(buffer.`val`)
        buffer = buffer.next
    }
}