package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode

fun main() {
    val result = inorderTraversal(generateTreeNode())
    println(result)
}


private fun inorderTraversal(root: TreeNode?, answer: MutableList<String>) {
    if (root == null) {
        return
    }
    inorderTraversal(root.left, answer) // traverse left subtree
    answer.add(root.value) // visit the root
    inorderTraversal(root.right, answer) // traverse right subtree
}

private fun inorderTraversal(root: TreeNode?): List<String> {
    val answer: MutableList<String> = ArrayList()
    inorderTraversal(root, answer)
    return answer
}