package medium

import utils.TreeNode
import java.util.*

fun main() {

}

private fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return listOf()
    val finalList: MutableList<MutableList<Int>> = mutableListOf()
    val queue: Queue<TreeNode> = LinkedList()
    val childQueue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    var currentLayer = mutableListOf<Int>()

    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()
        currentLayer.add(currentNode.`val`.toInt())

        if (currentNode.left != null) {
            childQueue.add(currentNode.left)
        }

        if (currentNode.right != null) {
            childQueue.add(currentNode.right)
        }

        if (queue.isEmpty()) {
            finalList.add(currentLayer)
            currentLayer = mutableListOf()

            while (childQueue.isNotEmpty()) {
                queue.add(childQueue.poll())
            }
        }

    }

    return finalList
}