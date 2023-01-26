package medium

import utils.TreeNode

class InsertIntoaBinarySearchTree {
}

fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    var node: TreeNode? = root
    while (node != null) {
        if (`val` > node.`val`.toInt()) {

            if (node.right == null) {
                node.right = TreeNode(`val`.toString())
                return root
            } else node = node.right

        } else {

            if (node.left == null) {
                node.left = TreeNode(`val`.toString())
                return root
            } else node = node.left

        }
    }
    return TreeNode(`val`.toString())
}
