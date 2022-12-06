package easy

import utils.TreeNode
import utils.generateSymmetricTree
import java.util.LinkedList
import java.util.Stack

fun main() {
    val result = hasPathSumIterative(generateSymmetricTree(), 10)
    println(result)
}

// Recursive
private fun hasPathSumRecursive(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) {
        return false
    }

    val targetSum = targetSum - root.value.toInt()

    if (root.left == null && root.right == null) {
        return targetSum == 0
    }

    return hasPathSumRecursive(root.left, targetSum) || hasPathSumRecursive(root.right, targetSum)
}


// Iterative
private fun hasPathSumIterative(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) {
        return false
    }

    val nodeStack: Stack<TreeNode> = Stack()
    val sumStack: Stack<Int> = Stack()

    nodeStack.add(root)
    sumStack.add(targetSum - root.value.toInt())

    var currentSum: Int
    var node: TreeNode

    while (nodeStack.isEmpty().not()) {
        node = nodeStack.pop()
        currentSum = sumStack.pop()

        if (node.left == null && node.right == null && currentSum == 0) {
            return true
        }

        if (node.left != null) {
            nodeStack.add(node.left)
            sumStack.add(currentSum - node.left!!.value.toInt())
        }

        if (node.right != null) {
            nodeStack.add(node.right)
            sumStack.add(currentSum - node.right!!.value.toInt())
        }
    }

    return false
}