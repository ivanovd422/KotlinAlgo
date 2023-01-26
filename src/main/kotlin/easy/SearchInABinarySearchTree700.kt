package easy

import utils.TreeNode
import java.util.*

fun main() {

}

private fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null

    if (root.`val`.toInt() == `val`) {
        return root
    }

    return searchBST(root.left, `val`) ?: searchBST(root.right, `val`)
}


fun searchBSTIterative(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null

    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)

    while (queue.isEmpty().not()) {
        val currentNode = queue.poll()

        if (currentNode.`val`.toInt() == `val`) {
            return currentNode
        }

        if (currentNode.left != null) {
            queue.add(currentNode.left)
        }

        if (currentNode.right != null) {
            queue.add(currentNode.right)
        }
    }

    return null
}