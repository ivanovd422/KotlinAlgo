package learn.binaryTree

import utils.TreeNode
import utils.generateTreeNode
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val result = preorderTraversal(generateTreeNode())
    println(result)
}

// DFS
private fun preorderTraversal(root: TreeNode?): List<String> {
    val answer: MutableList<String> = ArrayList()
    val stack: Stack<TreeNode> = Stack<TreeNode>()
    
    if (root != null) {
        stack.push(root)
    }
    
    var current: TreeNode

    while (stack.empty().not()) {

        current = stack.pop()
        answer.add(current.value) // visit the root

        if (current.right != null) {
            stack.push(current.right) // push right child to stack if it is not null
        }

        if (current.left != null) {
            stack.push(current.left) // push left child to stack if it is not null
        }
    }
    return answer
}