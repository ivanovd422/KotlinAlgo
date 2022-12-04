package utils


class TreeNode(
    val value: String
) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


fun generateTreeNode(): TreeNode {
    val nodeC = TreeNode("C")
    val nodeE = TreeNode("E")
    val nodeA = TreeNode("A")
    val nodeH = TreeNode("H")
    val nodeD = TreeNode("D").apply {
        left = nodeC
        right = nodeE
    }
    val nodeB = TreeNode("B").apply {
        left = nodeA
        right = nodeD
    }
    val nodeI = TreeNode("I").apply {
        left = nodeH
    }
    val nodeG = TreeNode("G").apply {
        right = nodeI
    }
    val nodeF = TreeNode("F").apply {
        left = nodeB
        right = nodeG
    }

    return nodeF

}