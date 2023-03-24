package medium

import utils.TreeNode
import java.util.*

fun main() {

}

private fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return listOf()
    val result: MutableList<MutableList<Int>> = mutableListOf()
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isEmpty().not()) {
        val list = mutableListOf<Int>()
        val size = queue.size

        for (i in 0 until size) {
            val node = queue.poll()

            list.add(node.`val`.toInt())

            if (node.left != null) {
                queue.add(node.left)
            }

            if (node.right != null) {
                queue.add(node.right)
            }
        }
        result.add(list)
    }

    return result
}