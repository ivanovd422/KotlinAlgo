package easy

// mat = [[1,2]], r =1, c = 1 =?
fun main() {

    val result = matrixReshape(arrayOf(intArrayOf(1, 2)), 1, 1)

    result.forEach { outer ->
        outer.forEach {
            print(it)
        }
        println()
    }
}

private fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val list = mutableListOf<Int>()

    for (i in 0 until mat.size) {
        val currentArray = mat[i]

        for (j in 0 until currentArray.size) {
            list.add(currentArray[j])
        }
    }

    val finalArray = Array<IntArray>(r) { intArrayOf() }
    var pointer = 0

    if (r * c < list.size) {
        return mat
    }

    for (i in 0 until r) {
        val rowArray = IntArray(c)

        for (j in 0 until c) {
            if (pointer > list.size - 1) {
                return mat
            }

            rowArray[j] = list[pointer]
            pointer++
        }
        finalArray[i] = rowArray
    }

    return finalArray
}