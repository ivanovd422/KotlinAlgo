package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode

fun main() {
    val result = maximumDepth(generateTreeNode())
    println(result)
}

private fun maximumDepth(node: TreeNode?): Int {
    if (node == null) {
        return 0
    }

    val leftDepth = maximumDepth(node.left)
    val rightDepth = maximumDepth(node.right)

    return Math.max(leftDepth, rightDepth) + 1
}