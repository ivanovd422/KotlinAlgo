package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode

var answer = 0

fun main() {
    maximumDepth(generateTreeNode(), answer)
    println(answer)
}


private fun maximumDepth(root: TreeNode?, depth: Int) {
    if (root == null) {
        return
    }

    if (root.left == null && root.right == null) {
        answer = Math.max(answer, depth)
    }

    maximumDepth(root.left, depth + 1)
    maximumDepth(root.right, depth + 1)
}