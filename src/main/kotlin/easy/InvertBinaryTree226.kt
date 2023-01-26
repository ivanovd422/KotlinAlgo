package easy

import utils.TreeNode
import java.util.*

fun main() {

}

private fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()

        val left = currentNode.left
        currentNode.left = currentNode.right
        currentNode.right = left

        if (currentNode.left != null) {
            queue.add(currentNode.left)
        }

        if (currentNode.right != null) {
            queue.add(currentNode.right)
        }
    }

    return root
}

fun invertTreeRecursive(root: TreeNode?): TreeNode? {

    if (root == null) return null

    val left = invertTree(root.left)
    val right = invertTree(root.right)

    root.left = right
    root.right = left

    return root
}