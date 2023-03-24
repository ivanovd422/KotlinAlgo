package medium

import utils.TreeNode

private var totalSum = 0

fun sumNumbers(root: TreeNode?): Int {
    helper(root, "")
    return totalSum
}

private fun helper(root: TreeNode?, current: String) {
    if (root == null) return

    val value = current + root.`val`.toString()
    if (root.left == null && root.right == null) {
        totalSum += value.toInt()
    }

    helper(root.left, value)
    helper(root.right, value)
}