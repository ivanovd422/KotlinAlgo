package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode
import java.util.*

fun main() {
    val result = levelOrder(generateTreeNode())
    println(result)
}

// BFS
private fun levelOrder(root: TreeNode?): List<List<String>> {
    val ans: MutableList<List<String>> = ArrayList()
    val q: Queue<TreeNode> = LinkedList()

    if (root != null) {
        q.offer(root)
    }

    var current: TreeNode

    while (q.isEmpty().not()) {
        val size: Int = q.size

        val subAns: MutableList<String> = LinkedList()

        for (i in 0 until size) { // traverse nodes in the same level
            current = q.poll()
            subAns.add(current.value) // visit the root

            if (current.left != null) {
                q.offer(current.left) // push left child to queue if it is not null
            }

            if (current.right != null) {
                q.offer(current.right) // push right child to queue if it is not null
            }
        }

        ans.add(subAns)
    }

    return ans
}