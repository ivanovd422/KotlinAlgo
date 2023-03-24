package medium

import utils.ListNode
import utils.Node
import java.util.*

fun main() {
    val node = Node(1)
        .apply {
            left = Node(2).apply {
                left = Node(4)
                right = Node(5)
            }
            right = Node(3).apply {
                left = Node(6)
                right = Node(7)
            }
        }

    var result = connect(node)


}

private fun connect(root: Node?): Node? {
    if (root == null) return null
    val queue: Queue<Node> = LinkedList()
    queue.add(root)

    while (queue.isEmpty().not()) {
        val size = queue.size
        var previous: Node? = null

        for (i in 0 until size) {
            val node = queue.poll()
            node.next = null
            previous?.next = node
            previous = node

            if (node.left != null) {
                queue.add(node.left)
            }

            if (node.right != null) {
                queue.add(node.right)
            }
        }
    }
    return root
}