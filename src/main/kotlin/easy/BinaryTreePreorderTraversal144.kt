package easy

import utils.TreeNode

fun main() {

}

private fun preorderTraversal(root: TreeNode?): List<Int> {
    val finalList = mutableListOf<Int>()
    if (root == null) return finalList

    preorderTraversal(root, finalList)
    return finalList

}

private fun preorderTraversal(root: TreeNode, list: MutableList<Int>) {
    list.add(root.`val`.toInt())
    if (root?.left != null) preorderTraversal(root.left!!, list)
    if (root?.right != null) preorderTraversal(root.right!!, list)

}