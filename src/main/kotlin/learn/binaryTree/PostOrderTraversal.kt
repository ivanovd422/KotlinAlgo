package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode

fun main() {
    val result = postorderTraversal(generateTreeNode())
    println(result)
}

private fun postorderTraversal(root: TreeNode?, answer: MutableList<String>) {
    if (root == null) {
        return
    }
    postorderTraversal(root.left, answer) // traverse left subtree
    postorderTraversal(root.right, answer) // traverse right subtree
    answer.add(root.value) // visit the root
}

fun postorderTraversal(root: TreeNode?): List<String> {
    val answer: MutableList<String> = ArrayList()
    postorderTraversal(root, answer)
    return answer
}