package medium

fun main() {
    val result = isValidSudoku(boardTrue)
    println(result)

}


private fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rowsHashSet: Array<HashSet<Char>> = Array(9) { hashSetOf<Char>() }
    val columnsHashSet: Array<HashSet<Char>> = Array(9) { hashSetOf<Char>() }
    val boxesHashSet: Array<HashSet<Char>> = Array(9) { hashSetOf<Char>() }

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            val value = board[i][j]

            if (value== '.') {
                continue
            }

            if (rowsHashSet[i].contains(value)) {
                return false
            } else {
                rowsHashSet[i].add(value)
            }

            if (columnsHashSet[j].contains(value)) {
                return false
            } else {
                columnsHashSet[j].add(value)
            }


            val idx = (i / 3) * 3 + j / 3
            if (boxesHashSet[idx].contains(value)) {
                return false
            } else {
                boxesHashSet[idx].add(value)
            }

        }
    }


    return true
}


private val boardTrue: Array<CharArray> =
    arrayOf(
        // 1,2,3
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        // 4,5,6
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        // 7,8,9
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )