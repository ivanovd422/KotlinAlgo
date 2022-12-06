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

fun generateAsymmetricTree(): TreeNode {
    val node41 = TreeNode("4")
    val node42 = TreeNode("4")
    val node43 = TreeNode("4")
    val node44 = TreeNode("4")
    val node45 = TreeNode("4")
    val node46 = TreeNode("4")
    val node47 = TreeNode("4")

    val node31 = TreeNode("3").apply {
        left = node41
        right = node42
    }
    val node32 = TreeNode("3").apply {
        left = node43
        right = node44
    }
    val node33 = TreeNode("3").apply {
        left = node45
        right = node46
    }
    val node34 = TreeNode("3").apply {
        left = node47
    }

    val node21 = TreeNode("2").apply {
        left = node31
        right = node32
    }
    val node22 = TreeNode("2").apply {
        left = node33
        right = node34
    }
    val node1 = TreeNode("1").apply {
        left = node21
        right = node22
    }

    return node1
}
fun generateSymmetricTree(): TreeNode {
    val node41 = TreeNode("4")
    val node42 = TreeNode("4")
    val node43 = TreeNode("4")
    val node44 = TreeNode("4")
    val node45 = TreeNode("4")
    val node46 = TreeNode("4")
    val node47 = TreeNode("4")
    val node48 = TreeNode("4")

    val node31 = TreeNode("3").apply {
        left = node41
        right = node42
    }
    val node32 = TreeNode("3").apply {
        left = node43
        right = node44
    }
    val node33 = TreeNode("3").apply {
        left = node45
        right = node46
    }
    val node34 = TreeNode("3").apply {
        left = node47
        right = node48
    }

    val node21 = TreeNode("2").apply {
        left = node31
        right = node32
    }
    val node22 = TreeNode("2").apply {
        left = node33
        right = node34
    }
    val node1 = TreeNode("1").apply {
        left = node21
        right = node22
    }

    return node1
}