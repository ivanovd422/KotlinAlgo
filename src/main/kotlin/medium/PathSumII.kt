package medium

import utils.Node
import utils.TreeNode
import utils.generateAsymmetricTree

fun main() {


    pathSum(generateAsymmetricTree(), 10)
}

val result: MutableList<List<Int>> = mutableListOf()

fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
    val list: MutableList<Int> = mutableListOf()
    helper(root, targetSum, list)
    return result
}

fun helper(node: TreeNode?, targetSum: Int, list: MutableList<Int>) {
    if (node == null) return

    list.add(node.`val`.toInt())
    if (node.left == null && node.right == null && targetSum == node.`val`.toInt()) {
        result.add(list.toList())
    }

    helper(node.left, targetSum - node.`val`.toInt(), list)
    helper(node.right, targetSum - node.`val`.toInt(), list)

    list.removeAt(list.lastIndex)
}