package easy

import utils.TreeNode
import utils.generateAsymmetricTree
import java.util.*


fun main() {
    val resultIsSymmetricRecursive = isSymmetricIterative(generateAsymmetricTree())
    println(resultIsSymmetricRecursive)
}

// Recursive
private fun isSymmetricRecursive(root: TreeNode?): Boolean {
    return isMirror(root?.left, root?.right)
}

private fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
    if (left?.value == null && right?.value == null) {
        return true
    }

    if (left?.value == null || right?.value == null) {
        return false
    }


    return left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left)
}

// Iterative
private fun isSymmetricIterative(root: TreeNode?): Boolean {
    if (root == null) {
        return true
    }

    val q: Queue<TreeNode?> = LinkedList()
    q.add(root.left)
    q.add(root.right)

    while (!q.isEmpty()) {
        val t1 = q.poll()
        val t2 = q.poll()

        if (t1 == null && t2 == null) {
            continue
        }

        if (t1 == null || t2 == null) {
            return false
        }

        if (t1.value !== t2.value) {
            return false
        }

        q.add(t1.left)
        q.add(t2.right)
        q.add(t1.right)
        q.add(t2.left)
    }

    return true

}
