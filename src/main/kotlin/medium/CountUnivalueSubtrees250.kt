package medium

import utils.TreeNode
import utils.generateAsymmetricTree

private var counter = 0


fun main() {
    val countUnivalSubtrees = countUnivalSubtrees(generateAsymmetricTree())
    println(countUnivalSubtrees)
}


private fun countUnivalSubtrees(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    dfs(root)
    return counter
}

private fun dfs(root: TreeNode): Boolean{

    if (root.left == null && root.right == null) {
        counter++
        return true
    }

    var isCurrentUni = true

    if (root.left != null) {
        isCurrentUni = dfs(root.left!!) && root.left!!.value == root.value
    }

    if (root.right != null) {
        isCurrentUni = dfs(root.right!!) && root.right!!.value == root.value
    }

    if (isCurrentUni) {
        counter++
    }

    return isCurrentUni
}