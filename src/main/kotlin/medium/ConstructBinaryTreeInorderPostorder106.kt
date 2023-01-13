package medium

import utils.TreeNode
import utils.generateTreeNode


private var postIdx = 0
private lateinit var postOrder: IntArray
private lateinit var inOrder: IntArray
private val idxMap: MutableMap<Int, Int> = mutableMapOf()

fun main() {
    val result = buildTree(intArrayOf(9, 3, 15, 20, 7), intArrayOf(9, 15, 7, 20, 3))
    println(result)
}


private fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
    inOrder = inorder
    postOrder = postorder

    postIdx = postOrder.size - 1

    var idX = 0

    for (i in inOrder) {
        idxMap[i] = idX++
    }

    return helper(0, inOrder.size - 1)
}

private fun helper(inLeft: Int, inRight: Int): TreeNode? {

    if (inLeft > inRight) return null

    val rootVal = postOrder[postIdx]
    val root = TreeNode(rootVal.toString())

    val index = idxMap[rootVal]!!


    postIdx--

    root.right = helper(index + 1, inRight)
    root.left = helper(inLeft, index - 1)
    return root
}