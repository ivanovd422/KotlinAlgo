package easy

import utils.TreeNode

private fun postorderTraversal(root: TreeNode?): List<Int> {
    val answer: MutableList<Int> = ArrayList()
    postorderTraversal(root, answer)
    return answer
}

private fun postorderTraversal(root: TreeNode?, answer: MutableList<Int>) {
    if (root == null) {
        return
    }
    postorderTraversal(root.left, answer) // traverse left subtree
    postorderTraversal(root.right, answer) // traverse right subtree
    answer.add(root.`val`.toInt()) // visit the root
}