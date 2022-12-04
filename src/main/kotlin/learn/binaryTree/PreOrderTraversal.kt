package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode


fun main() {
    val result = preorderTraversal(generateTreeNode())
    println(result)
}

private fun preorderTraversal(root: TreeNode?, answer: MutableList<String?>) {
    if (root == null) {
        return
    }
    answer.add(root.value) // visit the root
    preorderTraversal(root.left, answer) // traverse left subtree
    preorderTraversal(root.right, answer) // traverse right subtree
}

private fun preorderTraversal(root: TreeNode?): List<String?> {
    val answer: MutableList<String?> = ArrayList()
    preorderTraversal(root, answer)
    return answer
}